package Addressbook_domain;

public class Country {
private int countryId;
private String countryNAme;
public Country() {
	super();
	this.countryId=0;
	this.countryNAme=null;
}
public Country(int countryId, String countryNAme) {
	super();
	this.countryId = countryId;
	this.countryNAme = countryNAme;
}
public int getCountryId() {
	return countryId;
}
public void setCountryId(int countryId) {
	this.countryId = countryId;
}
public String getCountryNAme() {
	return countryNAme;
}
public void setCountryNAme(String countryNAme) {
	this.countryNAme = countryNAme;
}
@Override
public String toString() {
	return "Country [countryId=" + countryId + ", countryNAme=" + countryNAme + "]";
}

}
