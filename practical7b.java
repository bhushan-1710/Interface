import java.util.Scanner;

interface College {
    void showCollege(String collegeName);
}

interface Staff {
    void showStaff(String staffName);
}

class Student implements College, Staff {
    public void showCollege(String collegeName) {
        System.out.println("College: " + collegeName);
    }

    public void showStaff(String staffName) {
        System.out.println("Staff: " + staffName);
    }

    void showStudent(String studentName) {
        System.out.println("Student: " + studentName);
    }
}

public class practical7b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter College Name: ");
        String college = sc.nextLine();

        System.out.print("Enter Staff Name: ");
        String staff = sc.nextLine();

        System.out.print("Enter Student Name: ");
        String student = sc.nextLine();

        College c = new Student();
        Staff s = new Student();
        Student st = new Student();

        c.showCollege(college);
        s.showStaff(staff);
        st.showStudent(student);

        sc.close();
    }
}