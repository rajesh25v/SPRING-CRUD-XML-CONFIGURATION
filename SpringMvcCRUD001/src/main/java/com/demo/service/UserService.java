package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Dao.UserDao;
import com.demo.model.Login;
import com.demo.model.User;

@Service
public class UserService {
	@Autowired
	public UserDao userDao;

	public void register(User user) {
		// TODO Auto-generated method stub

	}

	public User validateUser(Login login) {

		return userDao.validateUser(login);
	}

}
