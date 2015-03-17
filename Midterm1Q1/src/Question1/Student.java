package Question1;

public class Student extends Person {
	private ClassStatus classStatus;

	public Student(String name, String address, String phoneNumber,
			String emailAddress, ClassStatus classStatus) {
		super(name, address, phoneNumber, emailAddress);
		this.classStatus = classStatus;
	}

	public ClassStatus getClassStatus() {
		return classStatus;
	}

	public void setClassStatus(ClassStatus classStatus) {
		this.classStatus = classStatus;
	}
	
	public String toString() {
		return getName() +", "+ getClass();
	}

}
