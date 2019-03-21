package com.mahesh.shoppingcart.dao;

import com.mahesh.shoppingcart.entity.Product;
import com.mahesh.shoppingcart.model.PaginationResult;
import com.mahesh.shoppingcart.model.ProductInfo;

public interface ProductDAO {

	
public Product findProduct(String code);
    
    public ProductInfo findProductInfo(String code) ;
  
    
    public PaginationResult<ProductInfo> queryProducts(int page,
                       int maxResult, int maxNavigationPage  );
    
    public PaginationResult<ProductInfo> queryProducts(int page, int maxResult,
                       int maxNavigationPage, String likeName);
 
    public void save(ProductInfo productInfo);
    
}
