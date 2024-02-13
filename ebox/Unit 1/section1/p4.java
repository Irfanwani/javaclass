import java.util.*;

class Student {
    private String studentName;
    private int registerNumber;
    private static int noOfStudents = 0;

    public Student(String sn, int rn ) {
        noOfStudents++;
        this.studentName = sn;
        this.registerNumber = rn;
    }

public String getStudentName() {
    return studentName;
}

public int getRegisterNumber() {
    return registerNumber;
}

public static int getNoOfStudents() {
    return noOfStudents;
}
};

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the student details:");
        String sn;
        int rn;

        List<Student> students = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the register number:");
            rn = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the name: ");
            sn = sc.nextLine();
            Student st  = new Student(sn, rn);
            students.add(st);
            System.out.println("Do you want to continue[Yes/No]:");
        }while(sc.nextLine().equalsIgnoreCase("yes"));
        System.out.println("Number of Students are : " + Student.getNoOfStudents());

        for(int i = 0; i < students.size(); i++) {
            System.out.println("Details of student " +( i+1 )+ ":");
            System.out.println("Register Number: " + students.get(i).getRegisterNumber());
            System.out.println("Name: " + students.get(i).getStudentName());
        }
    }
}