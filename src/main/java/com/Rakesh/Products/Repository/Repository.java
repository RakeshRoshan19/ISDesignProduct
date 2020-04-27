package com.Rakesh.Products.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.Rakesh.Products.Model.ProductsDetails;

public interface Repository extends CrudRepository<ProductsDetails, String>{
	
	List<ProductsDetails> findBypNameContainingIgnoreCase(String name);
	List<ProductsDetails> findBypName(String name);
	List<ProductsDetails> findBypCategory(String pCategory);

}
