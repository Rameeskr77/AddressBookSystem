package Addressbook_read;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Addressbook_domain.Address;
import Addressbook_domain.City;
import Addressbook_domain.Country;
import Addressbook_domain.Person;
import Addressbook_service.AddressService;
import Addressbook_service.Cityservice;
import Addressbook_service.Countryservice;
import addressbook_data.AddressaccessObject;
import addressbook_data.CityAccessObject;
import addressbook_data.CountrydataaccessObject;
import addressbook_data.DataAccessObject;

public class ConsolereadPerson {
private Scanner console;
Address adddress=new Address();
City city=new City();
Country country=new Country();
	public Person bildPerson() {
		console=new Scanner(System.in);
		Person person=new Person();
		askFirtsName(person);
		askLastName(person);
		askDateofBirth(person);
		askHomeAddress(person);
		askWorkAddress(person);
		askRoomNumber(person);
//		askCityid(person);
//		askCountryid(person);
		return person;
	}
	public void askFirtsName(Person person) {
		System.out.println("Enter the First Name");
		person.setFirstName(console.next());
		try {
			if(person.getFirstName()==null|| person.getFirstName().trim().equals("")) {
				askFirtsName(person);
				System.out.println("you have typr invalid");
			}	
		} catch (Exception e) {
			System.out.println("Incorrect data");
		person.setFirstName(null);
		}
		
	System.out.println("==================================================================================");
		}			
	public void askLastName(Person person) {
		System.out.println("Enter the Last Name");
		person.setLastName(console.next());
		try {
			if(person.getLastName()==null|| person.getLastName().trim().equals("")) {
				askLastName(person);
				System.out.println("you have typr invalid");
			}	
		} catch (Exception e) {
			System.out.println("Incorrect data");
		person.setLastName(null);
		}
		
	System.out.println("==================================================================================");
	}
	public void askDateofBirth(Person person) {
		System.out.println("Enter the Date Of Birth");
		person.setDateofbirth(console.nextInt());
		try {
			if(person.getDateofbirth()==0) {
				askDateofBirth(person);
				System.out.println("you have typr invalid");
			}	
		} catch (Exception e) {
			System.out.println("Incorrect data");
		person.setDateofbirth(0);
		}
		
	System.out.println("==================================================================================");
	}
	public void askHomeAddress(Person person) {
		System.out.println("Enter the Home address");
		person.setHomeAddress(console.next());
		try {
			if(person.getHomeAddress()==null|| person.getHomeAddress().trim().equals("")) {
				askHomeAddress(person);
				System.out.println("you have typr invalid");
			}	
		} catch (Exception e) {
			System.out.println("Incorrect data");
		person.setHomeAddress(null);
		}
		
	System.out.println("==================================================================================");
	}
	public void askWorkAddress(Person person) {
		System.out.println("Enter the Work Address");
		person.setWorkAddress(console.next());
		try {
			if(person.getWorkAddress()==null|| person.getWorkAddress().trim().equals("")) {
				askWorkAddress(person);
				System.out.println("you have typr invalid");
			}	
		} catch (Exception e) {
			System.out.println("Incorrect data");
		person.setWorkAddress(null);
		}
		
	System.out.println("==================================================================================");
	}
	
	public void  askRoomNumber(Person person) {
		boolean ans=false;
		List<Address> addresslist= new ArrayList<Address>();
		System.out.println("Listing the address.......");
		AddressService as=new AddressService(null);
		addresslist= as.findAllAddress();
		System.out.println("==================================================================================");
		System.out.println("Enter the Room id");
		adddress.setRoomNumber(console.nextInt());
		int value =adddress.getRoomNumber();
		for(int i=0;i<addresslist.size();i++) {
			ans=(addresslist.get(i).getRoomNumber()==value);
			if(ans==true) {
				break;
			}
		}
		if(ans) {
			System.out.println("RoomNumber is taken in Address.....");
			person.setRoomNumber(adddress);
		}else {
			System.out.println("this room Number is not see the addresslis please add.......");
			ConsolereadAddress consoleread=new ConsolereadAddress();
			DataAccessObject dao=new AddressaccessObject("C:\\Users\\unknown\\eclipse-workspace\\AddressBook\\File\\Address.txt");
			AddressService addressService=new AddressService(dao);
			Address address=consoleread.buildAddress();
			addressService.addAddress(address);
			addressService.findAllAddress();
			person.setRoomNumber(adddress);
		}
	}
//	public void  askCityid(Person person) {
//		boolean ans=false;
//		List<City>citylist =new ArrayList<City>();
//		System.out.println("listing the  citylist");
//		Cityservice cs =new Cityservice(null);
//		citylist=cs.findallcity();
//		System.out.println("==================================================================================");
//		System.out.println("Enter the city id");
//		city.setCityId(console.nextInt());
//		int value=city.getCityId();
//		for(int i=0;i<citylist.size();i++) {
//			ans=(citylist.get(i).getCityId()==value);
//			if(ans==true) {
//				break;
//			}
//		}
//		if(ans) {
//			System.out.println("city id is taken in Address.....");
//			adddress.setCityId(city);
//			person.setRoomNumber(adddress);
//		}else {
//			System.out.println("this city id is not see the Citylist please add.......");
//			Consolereadcity consolereadcity=new Consolereadcity();
//	    	DataAccessObject doa = new CityAccessObject("C:\\Users\\unknown\\eclipse-workspace\\AddressBook\\File\\City.txt");
//			Cityservice citys=new Cityservice(doa);
//			City city=consolereadcity.bildCity();
//			citys.addCity(city);
//			citys.findallcity();
//			adddress.setCityId(city);
//			person.setRoomNumber(adddress);
//		}
//	}
//	public void askCountryid(Person person) {
//		boolean ans = false;
//		List<Country> countrylist=new ArrayList<Country>();
//		System.out.println("listing the Country");
//		Countryservice cos=new Countryservice(null);
//		countrylist=cos.findAllCountry();
//		System.out.println("==================================================================================");
//		System.out.println("Enter the Country id");
//		country.setCountryId(console.nextInt());
//		int value = country.getCountryId();
//		for(int i = 0; i<countrylist.size();i++) {
//			ans=(countrylist.get(i).getCountryId()==value);
//			if(ans==true) {
//				break;
//			}
//		}
//		if(ans) {
//			System.out.println("Country id is taken in Countrylist.....");
//			city.setCountryid(country);
//			adddress.setCityId(city);
//			person.setRoomNumber(adddress);
//		}else {
//			System.out.println("this city id is not see the Citylist please add.......");
//			ConsolereadCountry consolereadcountry= new ConsolereadCountry();
//			DataAccessObject dao =new CountrydataaccessObject("C:\\Users\\unknown\\eclipse-workspace\\AddressBook\\File\\Country.txt");
//			Countryservice cs=new Countryservice(dao);
//			 Country country= consolereadcountry.bildCountry();
//			 cs.addCountry(country);
//			 cs.findAllCountry();
//			 city.setCountryid(country);
//			 adddress.setCityId(city);
//			 person.setRoomNumber(adddress);
//		}
//	}
}