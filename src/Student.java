public class Student extends Person {
    private double GPA;
    private boolean Male;
    private boolean Obese;

    public Student(double GPA, boolean Male, boolean Obese, String firstName, String familyName) {
        super(firstName, familyName);
        this.GPA = GPA;
        this.Male = Male;
        this.Obese = Obese;
    }

    public double getGPA() {
        return GPA;
    }

    public boolean isMale() {
        return Male;
    }


    public boolean isObese()
    {
        return Obese;
    }

    public String toString()
    {
        return getFamilyName() + ", " + getFirstName();
    }

}
