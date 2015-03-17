package Question1;

public class Staff extends Employee {
	private String title;

	public Staff(String name, String address, String phoneNumber,
			String emailAddress, String office, double salary,
			MyDate dateHired, String title) {
		super(name, address, phoneNumber, emailAddress, office, salary,
				dateHired);
		this.title = title;
	}
	
	public String toString() {
		return getName() + ", " +getClass();
		
	}

}
