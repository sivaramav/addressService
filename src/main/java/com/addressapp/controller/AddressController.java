package com.addressapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.addressapp.entity.Address;
import com.addressapp.response.AddressResponse;
import com.addressapp.servies.AddressService;

@RestController
public class AddressController {
	
	@Autowired
	AddressService addressService;
	
	@GetMapping("address/{id}")
	public ResponseEntity<Object> getAddress(@PathVariable("id") Long id){
		
		//EmployeeResponce empObj 	= empservice.getEmployeeById(id);
	    AddressResponse res =  addressService.getAddressById(id);
		
		 return new ResponseEntity<Object>(res,HttpStatus.OK);
	}
	
	@PostMapping("/address")
	public ResponseEntity<Object>  saveAddress(@RequestBody Address addr){
		
	   AddressResponse addres=	addressService.saveEmployee(addr);
		
		return new ResponseEntity<Object>(addres,HttpStatus.OK);
	}

}
