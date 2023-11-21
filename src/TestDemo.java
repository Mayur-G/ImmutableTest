
public class TestDemo {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address a1 = new Address("mysore","karnatka","India");
		Student s1 = new Student(1, "mike",a1);
		
		
		System.out.println("address object 1 : "+a1.hashCode());
		System.out.println(s1);
		
		Address a2 = s1.getAddress(); // 1) new object copy cnstr 2) cloning
		System.out.println("address object 2 : "+a2.hashCode());
		
		a2.setCity("Blr");
		a2.setState("Kerala");
		System.out.println("a1 :"+a1);
		System.out.println("a2 :"+a2);
		System.out.println(s1);
		
	}
}
