package addressBook;

public class CountryFormat {
	
	public static CountryData [] countries = {
		new CountryData("US", "21430", "United States", "%s-%s-%s-%s-%s", 0, 1, 4, 7, 9),
		new CountryData("BR", "03412", "Brazil", "%s-%s-%s", 0, 5, 9)
	};
	
	public static String[] fields = {
			"Postal code: ", "Street: ", "House: ", "Country: ", "City: "
	};
}