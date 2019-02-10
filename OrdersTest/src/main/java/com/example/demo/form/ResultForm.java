package com.example.demo.form;

public class ResultForm {
	
	Long OrderId;
	String GoodsName;
	int amount;
	int price;
	int totalPrice;
	
	public ResultForm() {}
	
	public ResultForm(Long OrderId, String GoodsName, int amount, int price)
	{
		this.OrderId = OrderId;
		this.GoodsName = GoodsName;
		this.amount = amount;
		this.price = price;
		this.totalPrice = amount*price;
	}
	
	public Long getOrderId()
	{
		return OrderId;
	}
	public void setOrderId(Long OrderId)
	{
		this.OrderId = OrderId;
	}
	public String getGoodsName()
	{
		return GoodsName;
	}
	public void setGoodsName(String GoodsName)
	{
		this.GoodsName = GoodsName;
	}
	public int getAmount()
	{
		return amount;
	}
	public void setAmount(int amount)
	{
		this.amount = amount;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public int getTotalPrice()
	{
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice)
	{
		this.totalPrice = totalPrice;
	}

}
