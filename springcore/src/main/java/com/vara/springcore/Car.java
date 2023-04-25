package com.vara.springcore;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehical{
	
 public void drive( ) {
	  System.out.println("We want car for shopping");
 }

}
