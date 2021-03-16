package Addressbook_service;

import java.util.ArrayList;
import java.util.List;

import Addressbook_domain.Address;
import Addressbook_domain.City;
import Addressbook_domain.Person;
import addressbook_data.DataAccessObject;
import addressbook_data.PersondataAccessObject;

public class PersonService {
private DataAccessObject dao;

public PersonService(DataAccessObject dao) {
	super();
	this.dao = dao;
}
public void addPerson(Person person) {
	dao.insert(person);
}
public List<Person> findAllperson(){
	AddressService as=new AddressService(null);
	List<Object> personobj=new ArrayList<Object>();
	List<Person> personlist=new ArrayList<Person>();
	List<Address> addresslist=as.findAllAddressnotprint();
	DataAccessObject dao2=new PersondataAccessObject("C:\\Users\\unknown\\eclipse-workspace\\AddressBook\\File\\Person.txt");
	personobj=dao.findall();
	for(Object objectlist:personobj) {
		personlist.add((Person)objectlist);
	}
	for(Person p : personlist) {
		for(Address a : addresslist) {
			if(p.getRoomNumber().getRoomNumber()==a.getRoomNumber()) {
				Address address=new Address();
				int id =a.getRoomNumber();
				String bilding=a.getBuilding();
				String streat=a.getStreet();
				String city=a.getCity();
				int number=a.getPhone();
				String email=a.getEmail();
				City cit=a.getCityId();
				address.setRoomNumber(id);
				address.setBuilding(bilding);
				address.setStreet(streat);
				address.setCity(city);
				address.setPhone(number);
				address.setEmail(email);
				address.setCityId(cit);
				
				p.setRoomNumber(address);
			}
		}
	}
	for(Person personlistnew:personlist) {
		System.out.println(personlistnew);
	}
	return personlist;
	
	
}
}
