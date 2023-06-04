package com.addressapp.servies;

import java.util.List;

import com.addressapp.entity.Address;
import com.addressapp.response.AddressResponse;

public interface AddressService {
	
	
	AddressResponse saveEmployee(Address adress);

	// Read operation
	List<AddressResponse> getAddressList();

	// Update operation
	AddressResponse updateAddress(Address employee, Long employeeId);

	// Delete operation
	void deleteEmployeeById(Long employeeId);
	
	AddressResponse getAddressById(Long id);

}
