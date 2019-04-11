public class Teacher extends Person {
    private String subject;
    private String title;

    public Teacher(String subject, String title, String firstName, String familyName)
    {
        this.subject = subject;
        this.title = title;
        super(firstName, familyName);
    }

    public String getSubject()
    {
        return subject;
    }

    public String toString()
    {
        return title + ". " + getFamilyName();
    }

}
