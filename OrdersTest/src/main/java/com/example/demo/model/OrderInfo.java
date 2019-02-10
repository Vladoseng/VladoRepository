package com.example.demo.model;

public class OrderInfo {
	
	private Long orderId;
	private Long goodsId;
	private int amount;
	
	public OrderInfo()
	{}
	
	public OrderInfo(Long orderId, Long goodsId, int amount)
	{
		super();
		this.orderId = orderId;
		this.goodsId = goodsId;
		this.amount = amount;
	}
	
	public Long getOrderId()
	{
		return orderId;
	}
	public void setOrderId(Long orderId)
	{
		this.orderId = orderId;
	}
	public Long getGoodsId()
	{
		return goodsId;
	}
	public void setGoodsId(Long goodsId)
	{
		this.goodsId = goodsId;
	}
	public int getAmount()
	{
		return amount;
	}
	public void setAmount(int amount)
	{
		this.amount = amount;
	}

}
