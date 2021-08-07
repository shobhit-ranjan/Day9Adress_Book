import java.util.Scanner;

class Person {
	long phoneNumber;
	String city;
	int pin;
	String email;
	String state;
	String firstName;
	String lastName;
	String address;

	public String getfName() {
		return firstName;
	}

	public void setfName(String fName) {
		this.firstName = fName;
	}

	public String getlName() {
		return lastName;
	}

	public void setlName(String lName) {
		this.lastName = lName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public int getZip() {
		return pin;
	}

	public void setZip(int zip) {
		this.pin = pin;
	}

	public long getpNumber() {
		return phoneNumber;
	}

	public void setpNumber(long pNumber) {
		this.phoneNumber = pNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

public class NewAdressBook extends Person {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Welcome to Address Book Program ");
		Person firstentry = new Person();
		System.out.println("Enter your first name ");
		firstentry.setfName(sc.next());
		System.out.println("Enter your Last name: ");
		firstentry.setlName(sc.next());
		System.out.println("Enter your Address: ");
		firstentry.setAddress(sc.next());
		System.out.println("Enter your City: ");
		firstentry.setCity(sc.next());
		System.out.println("Enter your State: ");
		firstentry.setState(sc.next());
		System.out.println("Enter your Zip: ");
		firstentry.setZip(sc.nextInt());
		System.out.println("Enter your Phone Number: ");
		firstentry.setpNumber(sc.nextLong());
		System.out.println("Enter your Email: ");
		firstentry.setEmail(sc.next());

	}

}
