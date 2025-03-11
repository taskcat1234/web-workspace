package com.kh.burgerking.model.service;

import java.util.List;

import com.kh.burgerking.model.dao.UserDAO;
import com.kh.burgerking.model.dto.UserDTO;

public class UserService {
	
	private UserDAO userDao = new UserDAO();
	
	public List<UserDTO> findAll(){
		return userDao.findAll();
	}
}
