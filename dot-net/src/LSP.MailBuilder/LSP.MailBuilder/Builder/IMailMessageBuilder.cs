using System.Net.Mail;

namespace LSP.MailBuilder.Builder
{
    public interface IMailMessageBuilder<in T>
    {
        IMailMessageBuilder<T> WithTo(string to);
        IMailMessageBuilder<T> WithSubject(string subject);
        IMailMessageBuilder<T> WithFrom(string from);
        MailMessage BuildMessage();
        IMailMessageBuilder<T> WithEntity(T entity);
    }
}
