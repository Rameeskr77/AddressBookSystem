package addressbook_data;
import Addressbook_domain.Address;
import Addressbook_domain.City;
import Addressbook_domain.Country;
import Addressbook_domain.Person;

public class PersondataAccessObject extends FiledataAccessObject {

	public PersondataAccessObject(String pathname) {
		super(pathname);
		
	}

	@Override
	protected String objectToCSVRecord(Object object) {
		StringBuilder bilder = new StringBuilder();
		Person person=(Person)object;
		bilder.append(person.getFirstName());
		bilder.append(",");
		bilder.append(person.getLastName());
		bilder.append(",");
		bilder.append(person.getDateofbirth());
		bilder.append(",");
		bilder.append(person.getHomeAddress());
		bilder.append(",");
		bilder.append(person.getWorkAddress());
		bilder.append(",");
		bilder.append(person.getRoomNumber().getRoomNumber());
//		bilder.append(",");
//		bilder.append(person.getRoomNumber().getCityId().getCityId());
//		bilder.append(",");
//		bilder.append(person.getRoomNumber().getCityId().getCountryid().getCountryId());
		return new String(bilder);
	}

	@Override
	protected Object csvRecordToObject(String cvsRecord) {
		String[] str=cvsRecord.split(",");
		Person peron=new Person();
		Address addres=new Address();
//		City city=new City();
//		Country country= new Country();
		peron.setFirstName(str[0]);
		peron.setLastName(str[1]);
		peron.setDateofbirth(Integer.parseInt(str[2]));
		peron.setHomeAddress(str[3]);
		peron.setWorkAddress(str[4]);
		addres.setRoomNumber(Integer.parseInt(str[5]));
		peron.setRoomNumber(addres);
//		addres.setBuilding(str[6]);
//		peron.setRoomNumber(addres);
//		addres.setStreet(str[7]);
//		peron.setRoomNumber(addres);
//		addres.setCity(str[8]);
//		peron.setRoomNumber(addres);
//		addres.setPhone(Integer.parseInt(str[9]));
//		peron.setRoomNumber(addres);
//		addres.setEmail(str[10]);
//		city.setCityId(Integer.parseInt(str[11]));
//		addres.setCityId(city);
//		peron.setRoomNumber(addres);
//		city.setCityName(str[12]);
//		addres.setCityId(city);
//		peron.setRoomNumber(addres);
//		
//		country.setCountryId(Integer.parseInt(str[13]));
//		city.setCountryid(country);
//		addres.setCityId(city);
//		peron.setRoomNumber(addres);
//		country.setCountryNAme(str[14]);
//		city.setCountryid(country);
//		addres.setCityId(city);
//		peron.setRoomNumber(addres);
		return peron;
	}

}
