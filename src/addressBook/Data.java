package addressBook;

public class Data {
	String countryCode;
	String name;
	String phoneNumber;
	Address address;
	
	public Data(String name, String phoneNumber, String countryCode, String postalCode, String street, String house, String city) {
	    this.name = name; this.phoneNumber = phoneNumber;
	    address = new Address(countryCode, postalCode, street, house, city);
	}
	
	class Address{
	    String data[];
	    private Address(String country, String postalCode, String street, String house, String city){
		data = new String[5];
				data[0] = postalCode;
				data[1] = street;
				data[2] = house;
				data[3] = country;
				data[4] = city;
		}
	}
	
	/** Name data output to console.
	 * 
	 */
	public void printName(){
	    System.out.println("Name: " +this.name);
	}
	
	/**Phone data output to console. 
	 * String phoneFormat - Phone Mask for displaying phone number according country rules. 
	 * int inds - counter of digits in blosk for phoneFormat.
	 * 
	 */
	public void printPhone(){
		String phoneFormat = "%s-%s-%s-%s-%s";
		int inds[] = {0, 1, 4, 7, 9};
		for (CountryData c: CountryFormat.countries){
			if (c.getCode().compareTo(this.address.data[3])==0){
				phoneFormat = c.getPhoneMask();
				inds =c.getPhoneSubIndexes();
				break;
			}
		}
		System.out.println(PhoneDataConverter.convert(phoneFormat, this.phoneNumber, inds));
	}
		
	/** Address data output to console.
	 * 
	 */
	public void printAddress(){
		String countryFormat = "01234";
		for (CountryData c: CountryFormat.countries){
            if (c.getCode().compareTo(this.address.data[3])==0){
			    countryFormat = c.getAddressFormat();
				break;
			}
		}
		int arg1 = Integer.parseInt(countryFormat.substring(0, 1));
		int arg2 = Integer.parseInt(countryFormat.substring(1, 2));
		int arg3 = Integer.parseInt(countryFormat.substring(2, 3));
		int arg4 = Integer.parseInt(countryFormat.substring(3, 4));
		int arg5 = Integer.parseInt(countryFormat.substring(4, 5));
		StringBuilder a1 = new StringBuilder();
		a1.append(CountryFormat.fields[arg1]);
		a1.append(this.address.data[arg1]);
		System.out.println(a1);
		StringBuilder a2 = new StringBuilder();
		a2.append(CountryFormat.fields[arg2]);
		a2.append(this.address.data[arg2]);
		System.out.println(a2);
		StringBuilder a3 = new StringBuilder();
		a3.append(CountryFormat.fields[arg3]);
		a3.append(this.address.data[arg3]);
		System.out.println(a3);
		StringBuilder a4 = new StringBuilder();
		a4.append(CountryFormat.fields[arg4]);
		a4.append(this.address.data[arg4]);
		System.out.println(a4);
		StringBuilder a5 = new StringBuilder();
		a5.append(CountryFormat.fields[arg5]);
		a5.append(this.address.data[arg5]);
		System.out.println(a5);
	}
	
	/** country code.
	 * @return code.
	 */
	public String getCode(){
		return this.countryCode;
	}
}