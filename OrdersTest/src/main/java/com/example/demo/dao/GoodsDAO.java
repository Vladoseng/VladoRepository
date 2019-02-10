package com.example.demo.dao;

import java.util.List;
import javax.sql.DataSource;

import	com.example.demo.mapper.GoodsMapper;
import com.example.demo.model.GoodsInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class GoodsDAO extends JdbcDaoSupport{

	@Autowired
	public GoodsDAO(DataSource dataSource)
	{
		this.setDataSource(dataSource);
	}
	
	public List<GoodsInfo> GetGoodsSet() 
	{
		String sql = GoodsMapper.BASE_SQL;
		Object[] params = new Object[] {};
		GoodsMapper mapper = new GoodsMapper();
		
		List <GoodsInfo> list = this.getJdbcTemplate().query(sql, params,mapper);
		
		return list;
	}
	
	public GoodsInfo findGoods(Long id)
	{
		String sql = GoodsMapper.BASE_SQL + " where ba.Id = ? ";
		Object[] params = new Object[] {id};
		GoodsMapper mapper = new GoodsMapper();
		try
		{
			GoodsInfo goodsInfo = this.getJdbcTemplate().queryForObject(sql, params, mapper);
			return goodsInfo;
		}
		catch(EmptyResultDataAccessException e)
		{
			return null;
		}
	}
	
}
