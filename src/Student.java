
public final class Student {
	
	final private int id;
	final private String studentName;
	final private Address address; // = Address [city=mysore, state=karnatka, country=India]]
	
	public Student(int id, String studentName, Address address) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public String getStudentName() {
		return studentName;
	}
	
	//COPY CONSTRUCTOR
	public Address getAddress(){
		// return address;
		return new Address(address);
	}
	
	
	//CLONING
//	public Address getAddress() throws CloneNotSupportedException {
//		return (Address)address.clone();
//	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", address=" + address + "]";
	}
	
	
	
}
