using System;
using System.Net.Mail;
using System.Text;
using LSP.MailBuilder.Model;

namespace LSP.MailBuilder.Builder
{
    public class ContactInformationMailMessageBuilder : IMailMessageBuilder<ContactInformation>
    {
        private readonly MailMessage _mailMessage;
        private readonly StringBuilder _body = new StringBuilder();
        
        public ContactInformationMailMessageBuilder()
        {
            _mailMessage = new MailMessage();
        }

        public IMailMessageBuilder<ContactInformation> WithTo(string to)
        {
            _mailMessage.To.Add(to); 
            return this;
        }

        public IMailMessageBuilder<ContactInformation> WithSubject(string subject)
        {
            _mailMessage.Subject = subject;
            return this;
        }

        public IMailMessageBuilder<ContactInformation> WithFrom(string from)
        {
            _mailMessage.From = new MailAddress(from);
            return this;
        }

        public MailMessage BuildMessage()
        {
            _mailMessage.Body = _body.ToString();
            return _mailMessage;
        }

        public IMailMessageBuilder<ContactInformation> WithEntity(ContactInformation contactInformation)
        {
            ParseContactInformation(contactInformation);
            if (contactInformation is ContactInformationSubsidiary)
            {
                var contact = contactInformation as ContactInformationSubsidiary;
                ParseContactInformationSubsidiary(contact);
            }
            else if (contactInformation is ContactInformationAuction)
            {
                var contact = contactInformation as ContactInformationAuction;
                ParseContactInformationAuction(contact);
            }
            return this;
        }

        private void ParseContactInformation(ContactInformation contact)
        {
            AddBodyLine("Nombre: {0}", contact.FirstName);
            AddBodyLine("Apellido: {0}", contact.LastName);
        }

        private void ParseContactInformationSubsidiary(ContactInformationSubsidiary contact)
        {
            AddBodyLine("Sucursal: {0}", contact.Subsidiary);
        }

        private void ParseContactInformationAuction(ContactInformationAuction contact)
        {
            AddBodyLine("Autor: {0}", contact.Author);
            AddBodyLine("Dimensiones: {0}", contact.Dimensions);
        }

        private void AddBodyLine(String line, params object[] args)
        {
            _body.AppendLine(String.Format(line, args));
        }
    }
}