package com.lti.gladiator.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.gladiator.beans.Product;
import com.lti.gladiator.beans.ProductDTO;
import com.lti.gladiator.beans.ProductRequestDTO;
import com.lti.gladiator.beans.Retailer;
import com.lti.gladiator.exceptions.ProductException;
import com.lti.gladiator.exceptions.RetailerException;
import com.lti.gladiator.services.RetailerServiceImpl;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/retailers")
public class RetailerController {

	@Autowired
	RetailerServiceImpl retailerService;

	// http://localhost:8282/retailers//login/{email}/{password}

	@GetMapping(path = "/login/{email}/{password}")
	public Retailer retailerLogin(@PathVariable("email") String email, @PathVariable("password") String password)
			throws RetailerException {
		System.out.println("login");
		try {
			return retailerService.RetailerLogin(email, password);
		} catch (RetailerException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	// http://localhost:8282/retailers/findproduct/101

	@GetMapping("/findproduct/{productid}")
	public Product findProduct(@PathVariable("productid") int productId) throws ProductException {
		System.out.println(retailerService.findProduct(productId));
		return retailerService.findProduct(productId);
	}

	// http://localhost:8282/retailers/findretailer/766

	@GetMapping("/findretailer/{retailerId}")
	public Retailer findretaRetailer(@PathVariable("retailerId") int retailerId) throws RetailerException {
		return retailerService.findRetailer(retailerId);
	}

	// http://localhost:8282/retailers/createrequest

	@PostMapping(path = "/createrequest")
	public int createUpdateRequest(@RequestBody ProductRequestDTO r) {

		return retailerService.createUpdateRequest(r);
	}

	/*
	 * // http://localhost:8282/retailers/myproducts/{retailerid}
	 * 
	 * @GetMapping(path = "/myproducts/{retailerid}") public List<Product>
	 * showMyProducts(@PathVariable("retailerid") int retailerId) { return
	 * retailerService.showMyProducts(retailerId); }
	 */

	// http://localhost:8282/retailers/myproducts/{retailerid}

	@GetMapping(path = "/myproducts/{retailerid}")

	public List<ProductDTO> showMyProducts(@PathVariable("retailerid") int retailerId) {
		List<Product> myProductList = retailerService.showMyProducts(retailerId);
		List<ProductDTO> pList = new ArrayList<>();
		ProductDTO dto;
		for (Product product : myProductList) {
			dto = new ProductDTO();

			dto.productId = product.getProductId();
			dto.productName = product.getProductName();
			dto.productImage = product.getProductImage();
			dto.productDesc = product.getProductDesc();
			dto.productPrice = product.getProductPrice();
			dto.productBrand = product.getProductBrand();
			dto.productQty = product.getProductQty();
			dto.categoryId = product.getCategory().getCategoryId();
			dto.retailerId = product.getRetailer().getRetailerId();
			pList.add(dto);
		}
		return pList;
	}

	/*
	 * @GetMapping(path = "") public List<ProductRequest>
	 * showmyproducts(@PathVariable("retailerId") int retailerId) {
	 * List<ProductRequest> dto = new ArrayList<>(); { ProductRequest rdto = new
	 * ProductRequest(); rdto.setProductRequestId(rId);
	 * rdto.setNewProductPrice(rId); dto.add(rdto);
	 * 
	 * } return dto; }
	 */

}
