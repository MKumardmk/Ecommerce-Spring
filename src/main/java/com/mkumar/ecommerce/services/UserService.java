package com.mkumar.ecommerce.services;

import com.mkumar.ecommerce.payloads.UserDTO;
import com.mkumar.ecommerce.payloads.UserResponse;

public interface UserService {
	UserDTO registerUser(UserDTO userDTO);
	
	UserResponse getAllUsers(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);
	
	UserDTO getUserById(Long userId);
	
	UserDTO updateUser(Long userId, UserDTO userDTO);
	
	String deleteUser(Long userId);
}
