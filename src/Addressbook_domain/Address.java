package Addressbook_domain;

public class Address {
private int roomNumber;
private String building;
private String street;
private String city;
private int phone;
private String email;
private City cityId;
public Address() {
	super();
	this.roomNumber=0;
	this.building=null;
	this.street=null;
	this.city=null;
	this.phone=0;
	this.email=null;
	this.cityId=null;
}
public Address(int roomNumber, String building, String street, String city, int phone, String email, City cityId) {
	super();
	this.roomNumber = roomNumber;
	this.building = building;
	this.street = street;
	this.city = city;
	this.phone = phone;
	this.email = email;
	this.cityId = cityId;
}
public int getRoomNumber() {
	return roomNumber;
}
public void setRoomNumber(int roomNumber) {
	this.roomNumber = roomNumber;
}
public String getBuilding() {
	return building;
}
public void setBuilding(String building) {
	this.building = building;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public City getCityId() {
	return cityId;
}
public void setCityId(City cityId) {
	this.cityId = cityId;
}
@Override
public String toString() {
	return "Address [roomNumber=" + roomNumber + ", building=" + building + ", street=" + street + ", city=" + city
			+ ", phone=" + phone + ", email=" + email + ", cityId=" + cityId + "]";
}

}
