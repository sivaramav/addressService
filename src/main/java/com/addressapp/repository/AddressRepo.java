package com.addressapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.addressapp.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Long> {
	

}
