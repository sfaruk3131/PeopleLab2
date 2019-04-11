public abstract class Person {
    private String firstName;
    private String familyName;

    public Person(String firstName, String familyName)
    {
        this.firstName = firstName;
        this.familyName = familyName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getFamilyName()
    {
        return familyName;
    }

    public boolean equals(Person p)
    {
        if(firstName.equals(familyName))
        {
            return true;
        }
        return false;
    }

}
