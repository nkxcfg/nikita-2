package addressBook;

/** 
 * @author nikita.kazakov.
 *
 */
public class CountryData {
	private String code;
	private String addressFormat;
	private String name;
	private String mask;
	private int[] inds;
	
	public CountryData (String code, String address, String name, String mask, int ... args){
		this.code = code; 
		this.addressFormat = address;
		this.name = name;
		this.mask = mask;
		int j = 0;
		inds = new int[args.length];
		for (int i: args){
			inds[j] = i;
			j++;
		}
		
	}
	/** country code.
	 * @return code.
	 */
	public String getCode(){
		return this.code;
	}
	
	/** country address format.
	 * @return address format.
	 */
	public String getAddressFormat(){
		return this.addressFormat;
	}
	
	/** Name of person.
	 * @return name.
	 */
	public String getName(){
		return this.name;
	}
	
	/** country phone mask.
	 * @return mask.
	 */
	public String getPhoneMask(){
		return this.mask;
	}
	
	/** phone indexes.
	 * @return indexes.
	 */
	public int[] getPhoneSubIndexes(){
		return this.inds;
	}
}
