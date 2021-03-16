package Addressbook_read;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAdder;
import Addressbook_domain.Address;
import Addressbook_domain.City;
import Addressbook_domain.Country;
import Addressbook_service.Cityservice;
import Addressbook_service.Countryservice;
import addressbook_data.CityAccessObject;
import addressbook_data.CountrydataaccessObject;
import addressbook_data.DataAccessObject;

public class ConsolereadAddress {
private Scanner consoleread;
City city=new City();
public Address buildAddress() {
	consoleread=new Scanner(System.in);
	Address address=new Address();
	askRoomNumber(address);
	askBuilding(address);
	askStreat(address);
	askCity(address);
	askPhone(address);
	askEmail(address);
	askCityid(address);
	return address;
}
public void askRoomNumber(Address address) {
	System.out.println("Enter the Room Number");
	address.setRoomNumber(consoleread.nextInt());
	try {
		if(address.getRoomNumber()==0) {
			askRoomNumber(address);
			System.out.println("you have typr invalid");
		}	
	} catch (Exception e) {
		System.out.println("Incorrect data");
	address.setRoomNumber(0);
	}
	
System.out.println("==================================================================================");
}
public void askBuilding(Address address) {
	System.out.println("Enter the Building");
	address.setBuilding(consoleread.next());
	try {
		if(address.getBuilding()==null|| address.getBuilding().trim().equals("")) {
			askBuilding(address);
			System.out.println("you have typr invalid");
		}	
	} catch (Exception e) {
		System.out.println("Incorrect data");
	address.setBuilding(null);
	}
	
System.out.println("==================================================================================");
}
public void askStreat(Address address) {
	System.out.println("Enter the Streat");
	address.setStreet(consoleread.next());
	try {
		if(address.getStreet()==null|| address.getStreet().trim().equals("")) {
			askStreat(address);
			System.out.println("you have typr invalid");
		}	
	} catch (Exception e) {
		System.out.println("Incorrect data");
	address.setStreet(null);
	}
	
System.out.println("==================================================================================");
}
public void askCity(Address address) {
	System.out.println("Enter the City");
	address.setCity(consoleread.next());
	try {
		if(address.getCity()==null|| address.getCity().trim().equals("")) {
			askCity(address);
			System.out.println("you have typr invalid");
		}	
	} catch (Exception e) {
		System.out.println("Incorrect data");
	address.setCity(null);
	}
	
System.out.println("==================================================================================");
}
public void askPhone(Address address) {
	System.out.println("Enter the Number");
	address.setPhone(consoleread.nextInt());
	try {
		if(address.getRoomNumber()==0) {
			askRoomNumber(address);
			System.out.println("you have typr invalid");
		}	
	} catch (Exception e) {
		System.out.println("Incorrect data");
	address.setRoomNumber(0);
	}
	
System.out.println("==================================================================================");
}
public void askEmail(Address address) {
	System.out.println("Enter the Email");
	address.setEmail(consoleread.next());
	try {
		if(address.getEmail()==null|| address.getEmail().trim().equals("")) {
			askEmail(address);
			System.out.println("you have typr invalid");
		}	
	} catch (Exception e) {
		System.out.println("Incorrect data");
	address.setEmail(null);
	}
	
System.out.println("==================================================================================");
}
public void askCityid(Address address) {
	boolean ans=false;
	List<City> citylist =new ArrayList<City>();
	System.out.println("listing the city");
	Cityservice cityservice =new Cityservice(null);
	citylist=cityservice.findallcity();
	System.out.println("==================================================================================");
	System.out.println("Enter the city id");
	city.setCityId(consoleread.nextInt());
	int value =city.getCityId();
	for(int i=0;i<citylist.size();i++) {
		ans=(citylist.get(i).getCityId()==value);
		if(ans==true) {
			break;
		}
	}
	if(ans) {
		System.out.println("cityid is taken in Address.....");
        address.setCityId(city);
	}else {
		System.out.println("this city id is not see the Citylist please add.......");
		Consolereadcity consolereadcity=new Consolereadcity();
    	DataAccessObject doa = new CityAccessObject("C:\\Users\\unknown\\eclipse-workspace\\AddressBook\\File\\City.txt");
		Cityservice citys=new Cityservice(doa);
		City city=consolereadcity.bildCity();
		citys.addCity(city);
		citys.findallcity();
		address.setCityId(city);
	}
	
System.out.println("==================================================================================");
}
//public void askCountryid(Address address) {
//	boolean ans=false;
//	List<Country> country=new ArrayList<Country>();
//	Country countryobj=new Country();
//System.out.println("Listing the counry");
//Countryservice counrys= new Countryservice(null);
//country=counrys.findAllCountry();
//System.out.println("==================================================================================");
//System.out.println("Enter the county id");
//countryobj.setCountryId(consoleread.nextInt());
//int value=countryobj.getCountryId();
//for(int i=0;i<country.size();i++) {
//	ans=(country.get(i).getCountryId()==value);
//	if(ans==true) {
//		break;
//	}
//}
//if(ans) {
//	System.out.println("countryid is taken in Address.....");
//	city.setCountryid(countryobj);
//	address.setCityId(city);
//}else {
//	System.out.println("this city id is not see the Citylist please add.......");
//	ConsolereadCountry consolereadcountry= new ConsolereadCountry();
//	DataAccessObject dao =new CountrydataaccessObject("C:\\Users\\unknown\\eclipse-workspace\\AddressBook\\File\\Country.txt");
//	Countryservice cs=new Countryservice(dao);
//	 Country countrys= consolereadcountry.bildCountry();
//	 cs.addCountry(countrys);
//	 cs.findAllCountry();
//	 city.setCountryid(countrys);
//	 address.setCityId(city);
//}
//System.out.println("==================================================================================");
//}
}
