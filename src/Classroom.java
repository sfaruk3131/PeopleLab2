public class Classroom {
    private Student[] students;
    private Teacher teacher;

    public Classroom(Student[] students, Teacher teacher)
    {
        this.students = students;
        this.teacher = teacher;
    }

    public String getSubject()
    {
        return teacher.getSubject();
    }

    public double classAverage()
    {
        double sum = 0.0;
        for(int i = 0; i < students.length;i++)
        {
             sum = sum + students[i].getGPA();
        }
        return (sum / students.length-1);
    }

    public void printClass()
    {
        System.out.println("Teacher: " + this.teacher + " " + getSubject());
        for(int i = 0; i <students.length;i++)
        {
            System.out.println(students[i].getFirstName() + students[i].getFamilyName());
        }
        System.out.println("Class Average " + classAverage());
    }

}
