package com.Rakesh.Products.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Rakesh.Products.Model.ProductsDetails;
import com.Rakesh.Products.services.Services;

@RestController
@RequestMapping("/products")
//@CrossOrigin(origins = "http://localhost:3000")
public class ControllerRest {
	@Autowired
	Services services;
	
	@PostMapping("/add")
	public boolean addProducts(@RequestBody ProductsDetails pDetails) {
		return services.addProducts(pDetails);
	}

	@GetMapping("/all")
	public List<ProductsDetails> showAll(){
		return services.showAll();
	}
	
	@GetMapping("/category")
	public List<ProductsDetails> categoryAll(@PathVariable("pCategory") String pCategory){
		return services.categoryAll(pCategory);
	}
	
	@GetMapping("/id/{id}")
	public Optional<ProductsDetails> showId(@PathVariable("id") String id) {
		return services.showId(id);
	}
	
	@GetMapping("/name/{name}")
	public List<ProductsDetails> showName(@PathVariable("name") String name){
		return services.showName(name);
	}
	
	@PutMapping("/edit/{id}")
	public boolean editProduct(@RequestBody ProductsDetails pDetail) {
		return services.editProduct(pDetail);
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean deleteProduct(@PathVariable("id") String id) {
		return services.deleteProduct(id);
	}
	@GetMapping("/idall")
	public List<ProductsDetails> allProdutsDetails(@RequestBody String pIdList[]) {
		return services.allProductsDetails(pIdList);
	}
}
