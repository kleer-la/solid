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
        assertTrue(message.Body.contains("Nombre: Homero"));
        assertTrue(message.Body.contains("Apellido: Simpson"));
    }

    public void testContactInformationSubsidiary() {
        // arrange
    	ContactInformation contactInformation = 
    		new ContactInformationSubsidiary("Homero", "Simpson", "Retiro");
    	
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
        assertTrue(message.Body.contains("Nombre: Homero"));
        assertTrue(message.Body.contains("Apellido: Simpson"));
        assertTrue(message.Body.contains("Sucursal: Retiro"));
    }

    public void testContactInformationAuctionSaleArtWork() {
        // arrange
    	ContactInformation contactInformation = 
    		new ContactInformationAuction("Homero", "Simpson", "Picasso", "3x3");
    	
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
        assertTrue(message.Body.contains("Nombre: Homero"));
        assertTrue(message.Body.contains("Apellido: Simpson"));
        assertTrue(message.Body.contains("Autor: Picasso"));
        assertTrue(message.Body.contains("Dimensiones: 3x3"));
    }
}