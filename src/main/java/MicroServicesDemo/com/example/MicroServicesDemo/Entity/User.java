package MicroServicesDemo.com.example.MicroServicesDemo.Entity;

public class User {
	
	private String username;
	private String password;
	
	User(String username , String password){
		this.username =  username;
		this.password = password;
	}
	
	public String getUserName(){
		return "userName";
	}
	public String getPassword(){
		return "password";
	}

}
