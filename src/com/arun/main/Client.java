package com.arun.main;

public class Client {
	
	public static void main(String args[])
	{
		User user1= new User.UserBuilder().setUserName("Arun").setUserAddress("Hyderabad").build();
		System.out.println(user1);
		
		
		
		
	}

}
