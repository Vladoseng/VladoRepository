package com.example.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.demo.model.OrderInfo;
import org.springframework.jdbc.core.RowMapper;

public class OrderMapper implements RowMapper<OrderInfo>{
	
	public static final String BASE_SQL = "Select ba.Id, ba.Goods_Id, ba.Amount From orders ba ";
	
	@Override
	public OrderInfo mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		Long id = rs.getLong("Id");
		Long goodsId = rs.getLong("Goods_Id");
		int amount = rs.getInt("Amount");
		
		return new OrderInfo(id, goodsId, amount);
	}
}
