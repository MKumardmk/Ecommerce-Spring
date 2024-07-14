package com.mkumar.ecommerce.services;

import com.mkumar.ecommerce.entites.Address;
import com.mkumar.ecommerce.payloads.AddressDTO;

import java.util.List;



public interface AddressService {
	
	AddressDTO createAddress(AddressDTO addressDTO);
	
	List<AddressDTO> getAddresses();
	
	AddressDTO getAddress(Long addressId);
	
	AddressDTO updateAddress(Long addressId, Address address);
	
	String deleteAddress(Long addressId);
}
