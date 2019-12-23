package ApiTesting;

public class PojoUser {
	private String email;
	private String  password;
	private PojoForAddress address;
	
	public PojoUser(String email,String password,String flatnumber,String  city,String country) {
		this.email=email;
		this.password = password;
		this.address=new PojoForAddress(flatnumber, city, country);
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public PojoForAddress getAddress() {
		return address;
	}
	public void setAddress(PojoForAddress address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setFilename(String password) {
		this.password = password;
	}
	

}
