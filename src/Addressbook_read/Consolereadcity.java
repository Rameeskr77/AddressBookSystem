package Addressbook_read;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Addressbook_domain.City;
import Addressbook_domain.Country;
import Addressbook_service.Countryservice;
import addressbook_data.CountrydataaccessObject;
import addressbook_data.DataAccessObject;

public class Consolereadcity {
private Scanner consoleread;
Country country=new Country();
public City bildCity() {
	consoleread=new Scanner(System.in);
	City city=new City();
	askcityId(city);
	askCityName(city);
	askCountryid(city);
	return city;
}
public void askcityId(City city) {
	System.out.println("Enter the City ID");
	city.setCityId(consoleread.nextInt());
	try {
		if(city.getCityId()==0) {
			askcityId(city);
			System.out.println("you have typr invalid");
		}	
	} catch (Exception e) {
		System.out.println("Incorrect data");
	city.setCityId(0);
	}
	
System.out.println("==================================================================================");
}
public void askCityName(City city) {
	System.out.println("Enter the City Name");
	city.setCityName(consoleread.next());
	try {
		if(city.getCityName()==null|| city.getCityName().trim().equals("")) {
			askCityName(city);
			System.out.println("you have typr invalid");
		}	
	} catch (Exception e) {
		System.out.println("Incorrect data");
	city.setCityName(null);
	}
	
System.out.println("==================================================================================");
}
 public void askCountryid(City city) {
	 boolean ans=false;
	 List<Country> countrylist=new ArrayList<Country>();
	 System.out.println("listing the Countrys");
	 Countryservice countrys= new Countryservice(null);
	countrylist=countrys.findAllCountry();
	System.out.println("==================================================================================");
	System.out.println("Enter the Country id");
	country.setCountryId(consoleread.nextInt());
	int value=country.getCountryId();
	for(int i=0;i<countrylist.size();i++) {
		ans=(countrylist.get(i).getCountryId()==value);
		if(ans==true) {
			break;
		}
	}
		if(ans) {
			System.out.println("Country id is taken in Countrylist.....");
			city.setCountryid(country);
		}else {
			System.out.println("this city id is not see the Citylist please add.......");
			ConsolereadCountry consolereadcountry= new ConsolereadCountry();
			DataAccessObject dao =new CountrydataaccessObject("C:\\Users\\unknown\\eclipse-workspace\\AddressBook\\File\\Country.txt");
			Countryservice cs=new Countryservice(dao);
			 Country country= consolereadcountry.bildCountry();
			 cs.addCountry(country);
			 cs.findAllCountry();
			 city.setCountryid(country);
		}
	System.out.println("==================================================================================");
 }
}
