package com.pkg.pandiyan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pkg.pandiyan.bean.UserBean;
import com.pkg.pandiyan.entiry.User;
import com.pkg.pandiyan.service.UserService;
import com.pkg.pandiyan.service.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepo;

	@Autowired
	public UserServiceImpl(UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
	}

	@Override
	public UserBean userRegister(UserBean userBean) throws Exception {

		User user = new User();
		
		return null;
	}

}
