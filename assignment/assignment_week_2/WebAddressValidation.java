package assignment_week_2;

public class WebAddressValidation {

	public static boolean checkWebAddressValidity(String webAddress) 
	{
		boolean flag=false;
		String regex="^(http|https)(://)(www.)?[A-Za-z0-9]{2,8}\\.(com|org|net)$";
		if(webAddress.matches(regex))
		{
			flag=true;
		}
		  return flag; 
	 }
			 
	public static void main(String[] args) {

		String webAddress = "http://www.company.com";
		System.out.println("The web address is "+ (checkWebAddressValidity(webAddress) ? "valid!" : "invalid!"));
	}
}