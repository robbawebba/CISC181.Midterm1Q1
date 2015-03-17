package Question1;

public abstract class Person {
	private String name;
	private String address;
	private String phoneNumber;
	private String emailAddress;

	
	public Person(String name, String address, String phoneNumber,
			String emailAddress) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}

	public String getName() {
		return name;
	}	
}
