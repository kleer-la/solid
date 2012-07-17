public interface IMailMessageBuilder<T> {
    IMailMessageBuilder<T> WithTo(String to);
    IMailMessageBuilder<T> WithSubject(String subject);
    IMailMessageBuilder<T> WithFrom(String from);
    MailMessage BuildMessage();
    IMailMessageBuilder<T> WithEntity(T entity);
}