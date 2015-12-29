package com.mkyong.common;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
 
@Controller
public class Person 
{
/*	@Autowired
	private Ability ability;
*/
	@Autowired
	@Qualifier("strength")
	baap abilityc;
	 public void printMessage(){
		
		 abilityc.printMessasge();
	 }
	 
	  
}