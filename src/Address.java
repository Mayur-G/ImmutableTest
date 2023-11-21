
public class Address implements Cloneable{
	
	
	private String city;
	private String state;
	private String country;
	
	
	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	//copy constructor
	public Address(Address address) {
		this( address.getCity(),  address.getState(),  address.getCountry());
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
	//not required , example cloning
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
