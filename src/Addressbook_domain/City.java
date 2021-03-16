package Addressbook_domain;

public class City {
private int CityId;
private String CityName;
private Country Countryid;
public City() {
	super();
	// TODO Auto-generated constructor stub
}
public City(int cityId, String cityName, Country countryid) {
	super();
	CityId = cityId;
	CityName = cityName;
	Countryid = countryid;
}
public int getCityId() {
	return CityId;
}
public void setCityId(int cityId) {
	CityId = cityId;
}
public String getCityName() {
	return CityName;
}
public void setCityName(String cityName) {
	CityName = cityName;
}
public Country getCountryid() {
	return Countryid;
}
public void setCountryid(Country countryid) {
	Countryid = countryid;
}
@Override
public String toString() {
	return "City [CityId=" + CityId + ", CityName=" + CityName + ", Countryid=" + Countryid + "]";
}

}
