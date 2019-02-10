package com.example.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.demo.model.GoodsInfo;
import org.springframework.jdbc.core.RowMapper;

public class GoodsMapper implements RowMapper<GoodsInfo>{
	
	public static final String BASE_SQL = "Select ba.Id, ba.name_of_goods, ba.price From goods ba ";
	
	@Override
	public GoodsInfo mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		Long id = rs.getLong("Id");
		String goodsName = rs.getString("name_of_goods");
		int price = rs.getInt("price");
		
		return new GoodsInfo(id, goodsName, price);
	}
}
