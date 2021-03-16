package Addressbook_service;

import java.util.ArrayList;
import java.util.List;

import Addressbook_domain.City;
import Addressbook_domain.Country;
import addressbook_data.CityAccessObject;
import addressbook_data.DataAccessObject;

public class Cityservice {
private DataAccessObject dao;

public Cityservice(DataAccessObject dao) {
	super();
	this.dao = dao;
}
public void addCity(City city) {
	dao.insert(city);
}
public List<City> findallcity(){
	Countryservice contryservice=new Countryservice(null);
	List<Object> obj =new ArrayList<Object>();
	List<City> citylist=new ArrayList<City>();
	List<Country> countrylist=contryservice.findAllCountrynotprin();
	DataAccessObject dao2=new CityAccessObject("C:\\Users\\unknown\\eclipse-workspace\\AddressBook\\File\\City.txt");
    obj=dao2.findall();
    for(Object cityobj:obj) {
    	citylist.add((City)cityobj);
    }
    for ( City g:citylist ) {
    	for (Country c:countrylist) {
    		if(g.getCountryid().getCountryId()==c.getCountryId()) {
    			Country cc=new Country();
    			int id =c.getCountryId();
    			String name=c.getCountryNAme();
    			cc.setCountryId(id);
    			cc.setCountryNAme(name);
    			g.setCountryid(cc);
    		}
    	}
    }
    if(citylist.size()==0) {
    	System.out.println("Hey, this list is empty !!");
    }else {
		for(City newCitylist:citylist) {
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println(newCitylist);
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}
	return citylist;
}
public List<City> findallcitynotprint(){
	Countryservice contryservice=new Countryservice(null);
	List<Object> obj =new ArrayList<Object>();
	List<City> citylist=new ArrayList<City>();
	List<Country> countrylist=contryservice.findAllCountrynotprin();
	DataAccessObject dao2=new CityAccessObject("C:\\Users\\unknown\\eclipse-workspace\\AddressBook\\File\\City.txt");
    obj=dao2.findall();
    for(Object cityobj:obj) {
    	citylist.add((City)cityobj);
    }
    for ( City g:citylist ) {
    	for (Country c:countrylist) {
    		if(g.getCountryid().getCountryId()==c.getCountryId()) {
    			Country cc=new Country();
    			int id =c.getCountryId();
    			String name=c.getCountryNAme();
    			cc.setCountryId(id);
    			cc.setCountryNAme(name);
    			g.setCountryid(cc);
    		}
    	}
    }
	return citylist;
}
}
