package Addressbook_read;

import java.util.Scanner;

import Addressbook_domain.Country;

public class ConsolereadCountry {
	private Scanner consoleread;
public Country  bildCountry() {
	consoleread=new Scanner(System.in);
	Country country= new Country();
	askCountryId(country);
	askCountryName(country);
	return country;
}
public void askCountryId(Country country) {
	System.out.println("Enter the CountryId");
	country.setCountryId(consoleread.nextInt());
	
	try {
		if(country.getCountryId()==0) {
			askCountryId(country);
			System.out.println("you have typr invalid");
		}	
	} catch (Exception e) {
		System.out.println("Incorrect data");
	country.setCountryId(0);
	}
	
System.out.println("==================================================================================");
}
public void askCountryName(Country country) {
	System.out.println("Enter the CountryName");
	country.setCountryNAme(consoleread.next());
	try {
		if(country.getCountryNAme()==null|| country.getCountryNAme().trim().equals("")) {
			askCountryName(country);
			System.out.println("you have typr invalid");
		}	
	} catch (Exception e) {
		System.out.println("Incorrect data");
	country.setCountryNAme(null);
	}
	
System.out.println("==================================================================================");
}
}
