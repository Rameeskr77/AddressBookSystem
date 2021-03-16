package addressbook_data;
import Addressbook_domain.Address;
import Addressbook_domain.City;
import Addressbook_domain.Country;

public class AddressaccessObject extends FiledataAccessObject {

	public AddressaccessObject(String pathname) {
		super(pathname);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String objectToCSVRecord(Object object) {
		StringBuilder builder=new StringBuilder();
		Address address=(Address)object;
		builder.append(address.getRoomNumber());
		builder.append(",");
		builder.append(address.getBuilding());
		builder.append(",");
		builder.append(address.getStreet());
		builder.append(",");
		builder.append(address.getCity());
		builder.append(",");
		builder.append(address.getPhone());
		builder.append(",");
		builder.append(address.getEmail());
		builder.append(",");
		builder.append(address.getCityId().getCityId());
//		builder.append(",");
//		builder.append(address.getCityId().getCountryid().getCountryId());
		return new String(builder);
	}

	@Override
	protected Object csvRecordToObject(String cvsRecord) {
		String[] str = cvsRecord.split(",");
		Address address=new Address();
		City city=new City();
		Country country=new Country();
		address.setRoomNumber(Integer.parseInt(str[0]));
		address.setBuilding(str[1]);
		address.setStreet(str[2]);
		address.setCity(str[3]);
		address.setPhone(Integer.parseInt(str[4]));
		address.setEmail(str[5]);
		city.setCityId(Integer.parseInt(str[6]));
		address.setCityId(city);
//		country.setCountryId(Integer.parseInt(str[7]));
//		city.setCountryid(country);
//		address.setCityId(city);
		return address;
	}

}
