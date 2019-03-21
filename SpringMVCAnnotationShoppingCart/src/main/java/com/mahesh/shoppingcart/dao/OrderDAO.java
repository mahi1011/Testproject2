package com.mahesh.shoppingcart.dao;

import java.util.List;

import com.mahesh.shoppingcart.model.CartInfo;
import com.mahesh.shoppingcart.model.OrderDetailInfo;
import com.mahesh.shoppingcart.model.OrderInfo;
import com.mahesh.shoppingcart.model.PaginationResult;

public interface OrderDAO {
	
	 public void saveOrder(CartInfo cartInfo);
	 
	    public PaginationResult<OrderInfo> listOrderInfo(int page,
	            int maxResult, int maxNavigationPage);
	    
	    public OrderInfo getOrderInfo(String orderId);
	    
	    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);
	 

}
