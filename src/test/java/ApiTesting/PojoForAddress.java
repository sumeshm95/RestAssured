package ApiTesting;

public class PojoForAddress {
	
	private String flatnumber;
	private String  city;
	private String country;
	public PojoForAddress(String flatnumber,String  city,String country) {
		this.flatnumber = flatnumber;
		this.city = city;
		this.country = country;
		
	}
	public String getFlatnumber() {
		return flatnumber;
	}
	public void setFlatnumber(String flatnumber) {
		this.flatnumber = flatnumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
