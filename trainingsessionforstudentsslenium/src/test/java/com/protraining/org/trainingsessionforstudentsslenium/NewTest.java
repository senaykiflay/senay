package com.protraining.org.trainingsessionforstudentsslenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
 
  public void f() {
	  System.out.println("this is test anotation");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("this is before method anotaion");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("this is after method anotation");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is before class anotation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is after class anotaion");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("this is before class anotation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this is after class anotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("this is before class anotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("this is after class anotaion");
  }

}
