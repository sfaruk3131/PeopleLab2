public class Runner {
    private static String[] firstNames = {"Billy", "John", "Karen", "Joan", "Jennifer"};
    private static String[] familyNames = {"Johnson", "Baker", "Candy", "Giant", "Crystal"};

    public static void main(String []args)
    {
        Teacher teacher = new Teacher("Math", "Mr", "David", "Bradshaw");
        Student[] student = new Student[5];

        for(int i = 0; i < student.length;i++)
        {
            student[i] = new Student(Math.random()*4,true,true,firstNames[i],familyNames[i]);
            System.out.println(student[i]);
        }
        Classroom classroom = new Classroom(student, teacher);
        classroom.printClass();

    }
}
