import junit.framework.TestCase;

public class MailBuilderTests extends TestCase {
	
    public void testContactInformation() {
        // arrange
    	ContactInformation contactInformation = 
    		new ContactInformation("Homero", "Simpson");
    	
        IMailMessageBuilder<ContactInformation> mailBuilder = 
			new ContactInformationMailMessageBuilder();

        // act
    	MailMessage message = mailBuilder
    		.WithFrom("cliente@gmail.com")
    		.WithTo("empresa@gmail.com")
    		.WithSubject("Hola")
    		.WithEntity(contactInformation).BuildMessage();

        // assert
    	assertEquals("cliente@gmail.com", message.FromAddress);
    	assertEquals("empresa@gmail.com", message.ToAddress);
        assertEquals("Hola", message.Subject);
//        assertContains("Nombre: Homero", message.Body);
//        assertContains("Apellido: Simpson", message.Body);
    }

    public void testContactInformationSubsidiary() {
        // arrange
    	ContactInformation contactInformation = 
    		new ContactInformation("Homero", "Simpson", "Retiro");
    	
        IMailMessageBuilder<ContactInformation> mailBuilder = 
			new ContactInformationMailMessageBuilder();

        // act
        MailMessage message = mailBuilder
    		.WithFrom("cliente@gmail.com")
    		.WithTo("empresa@gmail.com")
    		.WithSubject("Hola")
    		.WithEntity(contactInformation).BuildMessage();

        // assert
    	assertEquals("cliente@gmail.com", message.FromAddress);
    	assertEquals("empresa@gmail.com", message.ToAddress);
        assertEquals("Hola", message.Subject);
//        assertContains("Nombre: Homero", message.Body);
//        assertContains("Apellido: Simpson", message.Body);
//        assertContains("Sucursal: Retiro", message.Body);
    }

    public void testContactInformationAuctionSaleArtWork() {
        // arrange
    	ContactInformation contactInformation = 
    		new ContactInformation("Homero", "Simpson", "Retiro", "3x3");
    	
        IMailMessageBuilder<ContactInformation> mailBuilder = 
			new ContactInformationMailMessageBuilder();

        // act
        MailMessage message = mailBuilder
    		.WithFrom("cliente@gmail.com")
    		.WithTo("empresa@gmail.com")
    		.WithSubject("Hola")
    		.WithEntity(contactInformation).BuildMessage();

        // assert
    	assertEquals("cliente@gmail.com", message.FromAddress);
    	assertEquals("empresa@gmail.com", message.ToAddress);
        assertEquals("Hola", message.Subject);
//        assertContains("Nombre: Homero", message.Body);
//        assertContains("Apellido: Simpson", message.Body);
//        assertContains("Sucursal: Retiro", message.Body);
//        assertContains("Dimensiones: 3x3", message.Body);
    }
}