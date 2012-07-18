
public class ContactInformationAuction extends ContactInformation {

	public String Author;
	public String Dimensions;
	
	public ContactInformationAuction(String firstName, String lastName, String author, String dimensions) {
		super(firstName, lastName);
		Author = author;
		Dimensions = dimensions;
	}

}
