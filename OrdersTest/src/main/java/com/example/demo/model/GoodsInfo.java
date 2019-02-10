package com.example.demo.model;

public class GoodsInfo {
	
	private Long id;
	private String GoodsName;
	private int price;
	
	public GoodsInfo(Long id, String GoodsName, int price)
	{
		super();
		this.id = id;
		this.GoodsName = GoodsName;
		this.price = price;
	}
	
	public Long getId()
	{
		return id;
	}
	public void setId(Long id)
	{
		this.id=id;
	}
	public String getGoodsName()
	{
		return GoodsName;
	}
	public void setGoodsName(String GoodsName)
	{
		this.GoodsName = GoodsName;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}

}
