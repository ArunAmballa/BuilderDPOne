package com.arun.main;

public class User {
	
	
	private String userName;
	private String userId;
	private String userAddress;
	private String userPhone;
	
	public User(UserBuilder builder)
	{
		this.userAddress=builder.userAddress;
		this.userId=builder.userId;
		this.userName=builder.userName;
		this.userPhone=builder.userPhone;
		
	}
	public String getUserName() {
		return userName;
	}
	public String getUserId() {
		return userId;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public String getUserPhone() {
		return userPhone;
	}
	
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userId=" + userId + ", userAddress=" + userAddress + ", userPhone="
				+ userPhone + "]";
	}


	public static class UserBuilder
	{
		private String userName;
		private String userId;
		private String userAddress;
		private String userPhone;
		
		public UserBuilder setUserName(String userName) {
			this.userName = userName;
			return this;
		}
		public UserBuilder setUserId(String userId) {
			this.userId = userId;
			return this;
		}
		public UserBuilder setUserAddress(String userAddress) {
			this.userAddress = userAddress;
			return this;
		}
		public UserBuilder setUserPhone(String userPhone) {
			this.userPhone = userPhone;
			return this;
		}
		
		public User build()
		{
			return new User(this);
			
		}
		
	}
	
	

}
