package com.addressapp.servies;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.addressapp.entity.Address;
import com.addressapp.repository.AddressRepo;
import com.addressapp.response.AddressResponse;

@Service
public class AddressServiceImpl implements AddressService {
	
	@Autowired
	AddressRepo addressRepo;
	
	@Autowired
	ModelMapper mapper;

	@Override
	public AddressResponse saveEmployee(Address address) {
		// TODO Auto-generated method stub
		Address adr = addressRepo.save(address);
		AddressResponse adrres= mapper.map(adr, AddressResponse.class);
		
		return adrres;
	}

	@Override
	public List<AddressResponse> getAddressList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AddressResponse updateAddress(Address employee, Long employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployeeById(Long employeeId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AddressResponse getAddressById(Long id) {
		
	   Address adr =  addressRepo.findById(id).get();
	   AddressResponse addres =  mapper.map(adr, AddressResponse.class);
		
		return addres;
	}

}
