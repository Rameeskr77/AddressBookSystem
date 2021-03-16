package addressbook_data;

import Addressbook_domain.City;
import Addressbook_domain.Country;

public class CityAccessObject extends FiledataAccessObject {

	public CityAccessObject(String pathname) {
		super(pathname);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String objectToCSVRecord(Object object) {
		StringBuilder bilder=new StringBuilder();
		City city=(City)object;
		bilder.append(city.getCityId());
		bilder.append(",");
		bilder.append(city.getCityName());
		bilder.append(",");
		bilder.append(city.getCountryid().getCountryId());
		return new String(bilder);
	}

	@Override
	protected Object csvRecordToObject(String cvsRecord) {
		String[] str=cvsRecord.split(",");
		City newcity=new City();
		Country cy =new Country();
		newcity.setCityId(Integer.parseInt(str[0]));
		newcity.setCityName(str[1]);
		cy.setCountryId(Integer.parseInt(str[2]));
		newcity.setCountryid(cy);
		return newcity;
	}

}
