package Addressbook_main;

import java.util.List;

import Addressbook_domain.Address;
import Addressbook_domain.City;
import Addressbook_domain.Country;
import Addressbook_domain.Person;
import Addressbook_read.ConsolereadAddress;
import Addressbook_read.ConsolereadCountry;
import Addressbook_read.ConsolereadPerson;
import Addressbook_read.Consolereadcity;
import Addressbook_service.AddressService;
import Addressbook_service.Cityservice;
import Addressbook_service.Countryservice;
import Addressbook_service.PersonService;
import addressbook_data.AddressaccessObject;
import addressbook_data.CityAccessObject;
import addressbook_data.CountrydataaccessObject;
import addressbook_data.DataAccessObject;
import addressbook_data.PersondataAccessObject;

public class Addressbookmain {
public static void main(String[] args) {
//	ConsolereadCountry consolereadcountry= new ConsolereadCountry();
//	DataAccessObject dao =new CountrydataaccessObject("C:\\Users\\unknown\\eclipse-workspace\\AddressBook\\File\\Country.txt");
//	Countryservice cs=new Countryservice(dao);
//	 Country country= consolereadcountry.bildCountry();
//	 cs.addCountry(country);
//	 List<Country> countries=cs.findAllCountry();
	 
//	Consolereadcity consolereadcity=new Consolereadcity();
//	DataAccessObject doa = new CityAccessObject("C:\\Users\\unknown\\eclipse-workspace\\AddressBook\\File\\City.txt");
//	Cityservice citys=new Cityservice(doa);
//	City city=consolereadcity.bildCity();
//	citys.addCity(city);
//	citys.findallcity();
	
//	ConsolereadAddress consolereadaddress=new ConsolereadAddress();
//	DataAccessObject dao=new AddressaccessObject("C:\\Users\\unknown\\eclipse-workspace\\AddressBook\\File\\Address.txt");
//	AddressService addressService=new AddressService(dao);
//	Address address=consolereadaddress.buildAddress();
//	addressService.addAddress(address);
//	addressService.findAllAddress();
//	
	ConsolereadPerson cp =new ConsolereadPerson();
	DataAccessObject daoa=new PersondataAccessObject("C:\\Users\\unknown\\eclipse-workspace\\AddressBook\\File\\Person.txt");
	PersonService personalservice =new PersonService(daoa);
	Person person=cp.bildPerson();
	personalservice.addPerson(person);
	personalservice.findAllperson();
}
}
