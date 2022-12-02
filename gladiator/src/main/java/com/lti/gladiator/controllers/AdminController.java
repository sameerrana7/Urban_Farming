package com.lti.gladiator.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.gladiator.beans.Admin;
import com.lti.gladiator.beans.Login;
import com.lti.gladiator.beans.Product;
import com.lti.gladiator.beans.ProductDTO;
import com.lti.gladiator.beans.ProductRequest;
import com.lti.gladiator.beans.ProductRequestDTO;
import com.lti.gladiator.beans.Retailer;
import com.lti.gladiator.exceptions.AdminException;
import com.lti.gladiator.services.AdminServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/admins")
public class AdminController {

	@Autowired
	AdminServiceImpl adminService;
	
	@GetMapping("/login/{email}/{password}")
	public Admin adminLogin(@PathVariable("email") String email, @PathVariable("password") String password) {
		
		System.out.println("inside login controller");
		System.out.println(email+ password);
		
		try {
			return adminService.adminLogin(email, password);
		} catch (AdminException e) {
			
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	@PostMapping("/retailer")
	public int addRetailer(@RequestBody Retailer retailer)
	{
		return adminService.addRetailer(retailer);
	}
	
	@PostMapping("/product")
	public int addProduct(@RequestBody ProductDTO p) {

		return adminService.addProduct(p);
	}
	
	@GetMapping("/productrequests")    // need to test, not able to add productRequest records using oracle express
	public List<ProductRequestDTO> getAllProductRequests() {

		List<ProductRequest> prodReqList = adminService.getAllProductRequests();
		
		List<ProductRequestDTO> prodReqDTOList = new ArrayList<>();
		
		ProductRequestDTO prd;
		
		for(ProductRequest prodReq: prodReqList)
		{
			prd = new ProductRequestDTO();
			
			prd.setProductRequestId(prodReq.getProductRequestId());
			prd.setProductId(prodReq.getProduct().getProductId());
			prd.setNewProductPrice(prodReq.getNewProductPrice());
			prd.setNewProductQty(prodReq.getNewProductQty());
			prd.setRetailerId(prodReq.getRetailer().getRetailerId());
			prd.setRequestStatus(prodReq.getRequestStatus());
			if(prodReq.getAdmin() != null)
				prd.setAdminId(prodReq.getAdmin().getAdminId());
			
			prodReqDTOList.add(prd);
		}
		
		return prodReqDTOList;
	}

	@PutMapping("/productrequest/{prodReqDTOId}/{adminId}")
	boolean approveRequest(@PathVariable("prodReqDTOId") int prodReqDTOId, @PathVariable("adminId") int adminId) {

		return adminService.approveRequest(prodReqDTOId, adminId);
	}
	
	@GetMapping("/retailers")
	public List<Retailer> getAllRetailers() {
		
		return adminService.getAllRetailers();
	}

}
