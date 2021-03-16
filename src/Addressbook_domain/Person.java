package Addressbook_domain;

public class Person {
private String firstName;
private String lastName;
private int dateofbirth;
private String homeAddress;
private String workAddress;
private Address roomNumber;
public Person() {
	super();
	this.firstName=null;
	this.lastName=null;
	this.dateofbirth=0;
	this.homeAddress=null;
	this.workAddress=null;
	this.roomNumber=null;
}
public Person(String firstName, String lastName, int dateofbirth, String homeAddress, String workAddress,
		Address roomNumber) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.dateofbirth = dateofbirth;
	this.homeAddress = homeAddress;
	this.workAddress = workAddress;
	this.roomNumber = roomNumber;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getDateofbirth() {
	return dateofbirth;
}
public void setDateofbirth(int dateofbirth) {
	this.dateofbirth = dateofbirth;
}
public String getHomeAddress() {
	return homeAddress;
}
public void setHomeAddress(String homeAddress) {
	this.homeAddress = homeAddress;
}
public String getWorkAddress() {
	return workAddress;
}
public void setWorkAddress(String workAddress) {
	this.workAddress = workAddress;
}
public Address getRoomNumber() {
	return roomNumber;
}
public void setRoomNumber(Address roomNumber) {
	this.roomNumber = roomNumber;
}
@Override
public String toString() {
	return "Person [firstName=" + firstName + ", lastName=" + lastName + ", dateofbirth=" + dateofbirth
			+ ", homeAddress=" + homeAddress + ", workAddress=" + workAddress + ", roomNumber=" + roomNumber + "]";
}

}
