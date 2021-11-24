package com.ashokit.dao;

import org.slf4j.Logger;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Vaibhav
 *
 */
@Repository
public class UserDao {
	Logger logger = org.slf4j.LoggerFactory.getLogger(UserDao.class);

	public void save() {
		logger.debug("save() method-> Started Executing");
		// logic to save user in db
		logger.info("user data inserted in user db");
		
		logger.debug("save() method-> Ended");
	}
}
