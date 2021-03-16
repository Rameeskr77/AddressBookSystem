package addressbook_data;

import Addressbook_domain.Country;

public class CountrydataaccessObject extends FiledataAccessObject {

	public CountrydataaccessObject(String pathname) {
		super(pathname);
	}


	@Override
	protected String objectToCSVRecord(Object object) {
		Country country =(Country)object;
		StringBuilder bilder =new StringBuilder();
		bilder.append(country.getCountryId());
		bilder.append(",");
		bilder.append(country.getCountryNAme());
		return new String(bilder);
	}

	@Override
	protected Object csvRecordToObject(String cvsRecord) {
		String[] str=cvsRecord.split(",");
		Country newcountry= new Country();
		newcountry.setCountryId(Integer.parseInt(str[0]));
		newcountry.setCountryNAme(str[1]);
		return newcountry;
	}

}
