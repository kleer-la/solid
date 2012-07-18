
public class ContactInformationMailMessageBuilder implements
		IMailMessageBuilder<ContactInformation> {

    private final MailMessage mailMessage;
    private final StringBuilder body = new StringBuilder();
    
    public ContactInformationMailMessageBuilder()
    {
        this.mailMessage = new MailMessage();
    }
   
	@Override
	public IMailMessageBuilder<ContactInformation> WithTo(String to) {
        this.mailMessage.ToAddress = to; 
        return this;
	}

	@Override
	public IMailMessageBuilder<ContactInformation> WithSubject(String subject) {
        this.mailMessage.Subject = subject; 
        return this;
	}

	@Override
	public IMailMessageBuilder<ContactInformation> WithFrom(String from) {
        this.mailMessage.FromAddress = from; 
        return this;
	}

	@Override
	public MailMessage BuildMessage() {
        this.mailMessage.Body = this.body.toString();
        return this.mailMessage;
	}

	@Override
	public IMailMessageBuilder<ContactInformation> WithEntity(ContactInformation contactInformation) {
        parseContactInformation(contactInformation);
        if (contactInformation instanceof ContactInformationSubsidiary)
        {
        	ContactInformationSubsidiary contact = (ContactInformationSubsidiary)contactInformation;
            parseContactInformationSubsidiary(contact);
        }
        else if (contactInformation instanceof ContactInformationAuction)
        {
        	ContactInformationAuction contact = (ContactInformationAuction)contactInformation;
            parseContactInformationAuction(contact);
        }
        return this;
	}
	
    private void parseContactInformation(ContactInformation contact)
    {
        addBodyLine("Nombre: %s", contact.FirstName);
        addBodyLine("Apellido: %s", contact.LastName);
    }

    private void parseContactInformationSubsidiary(ContactInformationSubsidiary contact)
    {
        addBodyLine("Sucursal: %s", contact.Subsidiary);
    }

    private void parseContactInformationAuction(ContactInformationAuction contact)
    {
        addBodyLine("Autor: %s", contact.Author);
        addBodyLine("Dimensiones: %s", contact.Dimensions);
    }

    private void addBodyLine(String line, Object... args)
    {
        this.body.append(String.format(line, args));
        this.body.append('\n');
    }
}