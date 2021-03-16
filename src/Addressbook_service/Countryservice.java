package Addressbook_service;

import java.util.ArrayList;
import java.util.List;

import Addressbook_domain.Country;
import addressbook_data.CountrydataaccessObject;
import addressbook_data.DataAccessObject;

public class Countryservice {
private DataAccessObject dao;


public Countryservice(DataAccessObject dao) {
	super();
	this.dao = dao;
}
 public void addCountry(Country country) {
	dao.insert(country);
 }
 public List<Country> findAllCountry(){
	 DataAccessObject dao2=new CountrydataaccessObject("C:\\Users\\unknown\\eclipse-workspace\\AddressBook\\File\\Country.txt");
	 List<Country> countrylist=new ArrayList<Country>();
	 List<Object> obj =new ArrayList<Object>();
	obj=dao2.findall();
	for(Object newobj:obj) {
		Country c= (Country)newobj;
		countrylist.add(c);
	}
	if(countrylist.size()==0) {
		System.out.println("Hey, this list is empty !!");
	}else {
		for(Country country:countrylist) {
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println(country);
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}
	return countrylist;
 }
 
 public List<Country> findAllCountrynotprin(){
	 DataAccessObject dao2=new CountrydataaccessObject("C:\\Users\\unknown\\eclipse-workspace\\AddressBook\\File\\Country.txt");
	 List<Country> countrylist=new ArrayList<Country>();
	 List<Object> obj =new ArrayList<Object>();
	obj=dao2.findall();
	for(Object newobj:obj) {
		Country c= (Country)newobj;
		countrylist.add(c);
	}
//	if(countrylist.size()==0) {
//		System.out.println("Hey, this list is empty !!");
//	}else {
//		for(Country country:countrylist) {
//			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//			System.out.println(country);
//		}
//		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//	}
	return countrylist;
 }
}
