package com.example.demo.controller;

import com.example.demo.dao.*;
import com.example.demo.form.*;
import com.example.demo.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	@Autowired
	private GoodsDAO goodsDAO;
	@Autowired
	private OrdersDAO orderDAO;
	
	 @RequestMapping(value = { "/","/main" }, method = RequestMethod.GET)
	    public String showMainPage(Model model) {
		 	OrderInfo order = new OrderInfo();
	        model.addAttribute("order", order);
	        return "main";
	    }
	 
	    @RequestMapping(value = { "/","/main" }, method = RequestMethod.POST)
	    public String FindOrder(Model model, //
	            @ModelAttribute("order") OrderInfo orderId) {
	 
	        if (orderId.getOrderId() != null && orderId.getOrderId() != 0) 
	        {
	        	OrderInfo order = orderDAO.findOrder(orderId.getOrderId());
				GoodsInfo goods = goodsDAO.findGoods(order.getGoodsId());
				ResultForm result = new ResultForm(order.getOrderId(), goods.getGoodsName(), order.getAmount(), goods.getPrice());
				model.addAttribute("result", result);
	            return "orderInfoPage";
	        }
	        return "main";
	    }
}
