package Addressbook_service;

import java.util.ArrayList;
import java.util.List;

import Addressbook_domain.Address;
import Addressbook_domain.City;
import Addressbook_domain.Country;
import addressbook_data.AddressaccessObject;
import addressbook_data.DataAccessObject;

public class AddressService {
private DataAccessObject dao;

public AddressService(DataAccessObject dao) {
	super();
	this.dao = dao;
}
public void addAddress(Address address) {
	dao.insert(address);
}
public List<Address> findAllAddress(){
	Cityservice cs=new Cityservice(null);
	List<Object> objlist=new ArrayList<Object>();
	List<Address> addresslist=new ArrayList<Address>();
	List<City> citylist =cs.findallcitynotprint();
	DataAccessObject dao2=new AddressaccessObject("C:\\Users\\unknown\\eclipse-workspace\\AddressBook\\File\\Address.txt");
	objlist= dao2.findall();
	for(Object addressobj:objlist) {
		addresslist.add((Address)addressobj);
	}
	for(Address a : addresslist) {
		for(City c: citylist) {
			if(a.getCityId().getCityId()==c.getCityId()) {
				City city=new City();
				int i=c.getCityId();
				Country ctry=c.getCountryid();
				String name=c.getCityName();
				city.setCityId(i);
				city.setCityName(name);
				city.setCountryid(ctry);
				a.setCityId(city);
			}
		}
	}
	for(Address addressnewlist:addresslist) {
		System.out.println(addressnewlist);
	}
	return addresslist;
	
}
public List<Address> findAllAddressnotprint(){
	Cityservice cs=new Cityservice(null);
	List<Object> objlist=new ArrayList<Object>();
	List<Address> addresslist=new ArrayList<Address>();
	List<City> citylist =cs.findallcitynotprint();
	DataAccessObject dao2=new AddressaccessObject("C:\\Users\\unknown\\eclipse-workspace\\AddressBook\\File\\Address.txt");
	objlist= dao2.findall();
	for(Object addressobj:objlist) {
		addresslist.add((Address)addressobj);
	}
	for(Address a : addresslist) {
		for(City c: citylist) {
			if(a.getCityId().getCityId()==c.getCityId()) {
				City city=new City();
				int i=c.getCityId();
				Country ctry=c.getCountryid();
				String name=c.getCityName();
				city.setCityId(i);
				city.setCityName(name);
				city.setCountryid(ctry);
				a.setCityId(city);
			}
		}
	}
	return addresslist;
	
}
}
