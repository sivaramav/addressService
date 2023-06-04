package com.addressapp.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressResponse {
	
	private Long addressId;
	private String line1;
	private String line2;
	private String state;
	private String zip;
	private Long employeeId;

}
