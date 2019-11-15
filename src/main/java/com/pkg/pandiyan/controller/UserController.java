/**
 * 
 */
package com.pkg.pandiyan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pkg.pandiyan.bean.UserBean;
import com.pkg.pandiyan.service.UserService;

/**
 * @author Pandiyan
 *
 */
@RestController
public class UserController {

	private UserService userService;

	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	public UserBean userRegister( @RequestBody UserBean userBean)throws Exception {
		
		return userService.userRegister(userBean); 
	}
}
