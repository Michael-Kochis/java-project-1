package com.revature.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.revature.test.DAO.AllDAOTests;
import com.revature.test.controller.AllControllerTests;
import com.revature.test.model.AllModelTests;
import com.revature.test.service.AllServiceTests;
import com.revature.test.view.AllViewTests;

@RunWith(Suite.class)
@SuiteClasses({ AllServiceTests.class, AllControllerTests.class, AllModelTests.class,
	AllDAOTests.class, AllViewTests.class })
public class AllTests {

}
