package com.example.demo.dao;

import java.util.List;
import javax.sql.DataSource;

import	com.example.demo.mapper.OrderMapper;
import com.example.demo.model.OrderInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class OrdersDAO extends JdbcDaoSupport{
	
	@Autowired
	public OrdersDAO(DataSource dataSource)
	{
		this.setDataSource(dataSource);
	}
	
	public List<OrderInfo> getOrders()
	{
		String sql = OrderMapper.BASE_SQL;
		
		Object[] params = new Object[] {};
		OrderMapper mapper = new OrderMapper();
		List<OrderInfo> list = this.getJdbcTemplate().query(sql, params, mapper);
		
		return list;
	}
	
	public OrderInfo findOrder (Long id)
	{
		String sql = OrderMapper.BASE_SQL + " where ba.Id = ? ";
		
		Object[] params = new Object[] {id};
		OrderMapper mapper = new OrderMapper();
		try {
			OrderInfo orderInfo = this.getJdbcTemplate().queryForObject(sql, params, mapper);
			return orderInfo;
		}catch(EmptyResultDataAccessException e)
		{
			return null;
		}
	}
}
