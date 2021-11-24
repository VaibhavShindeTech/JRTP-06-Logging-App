package com.ashokit.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.dao.UserDao;

/**
 * 
 * @author Vaibhav
 *
 */
@Service
public class UserService {
	Logger logger = LoggerFactory.getLogger(UserService.class);
	@Autowired
	private UserDao dao;

	public void saveUser() {
		logger.debug("saveUser() -> Method Execution Started");
		logger.info("save() -> Method of UserDao class Invoking");
		dao.save();
		logger.info("save() -> Method of UserDao class Invoked");
		logger.debug("saveUser() -> Method Execution Completed");
	}
}
