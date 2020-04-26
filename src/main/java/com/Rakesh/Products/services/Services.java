package com.Rakesh.Products.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.Rakesh.Products.Model.ProductsDetails;
import com.Rakesh.Products.Repository.Repository;

@Service
public class Services {
	
	@Autowired
	private Repository repository;
	
	public boolean addProducts(ProductsDetails pDetails) {
		repository.save(pDetails);
		return repository.findById((pDetails.getpId())).get().equals(pDetails);
	}
	
	public List<ProductsDetails> showAll(){
		return (List<ProductsDetails>) repository.findAll();
	}
	
	public List<ProductsDetails> categoryAll(String pCategory){
		return repository.findBypCategory(pCategory);
	}
	
	public Optional<ProductsDetails> showId(String id) {
		return repository.findById(id);
	}
	
	public List<ProductsDetails> showName(String name){
		List<ProductsDetails> lp = repository.findBypName(name);
		if (lp.isEmpty())
			return null;
		return lp;
	}
	
	public boolean editProduct(@RequestBody ProductsDetails pDetail) {
		repository.save(pDetail);
		return repository.findById(pDetail.getpId()).get().equals(pDetail);
	}
	
	public boolean deleteProduct(@PathVariable("id") String id) {
		repository.deleteById(id);
		return repository.findById(id).get()==null;
	}

	public List<ProductsDetails> allProductsDetails(String pIdList[]) {
		List<ProductsDetails> pdL = new ArrayList<>();
		for (String pId : pIdList) {
			Optional<ProductsDetails> pd = showId(pId);
			pdL.add(pd.get());
		}
		return pdL;
	}

}
