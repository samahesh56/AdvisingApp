import java.util.ArrayList;

public class AdviseeTester {
    public static void main(String[] args) {
        // Hire date objects
        Date hireDate1 = new Date(2023, 10, 15);
        Date hireDate2 = new Date(2023, 9, 1);
        Date hireDate3 = new Date(2022, 8, 5);

        // Course objects
        Course course1 = new Course("CMPSC132", 3, 500.0);
        Course course2 = new Course("MATH220", 4, 500.0);
        Course course3 = new Course("PHYS212", 4, 500.0);

        // Advisor arrays (3)
        Advisor[] advisors = new Advisor[3];
        advisors[0] = new Advisor("John", "Doe", "Professor", "xmt5028", "123-456-7890", "johndoe@psu.edu", "InsertAddressHere", "Professor", 75000.0, hireDate1, new Student[2]);
        advisors[1] = new Advisor("Jane", "Smith", "Associate Professor", "ysk3015", "987-654-3210", "janesmith@psu.edu", "InsertAddressHere", "Associate Professor", 60000.0, hireDate2, new Student[2]);
        advisors[2] = new Advisor("Robert", "Johnson", "Assistant Professor", "zlw4052", "111-222-3333", "robertjohnson@psu.edu", "InsertAddressHere", "Assistant Professor", 55000.0, hireDate3, new Student[2]);

        // Student arrays (6, 2 per advisor)
        Student[] students = new Student[6];
        students[0] = new Student("Alice", "Doe", "Computer Science", "xsa7012", "555-555-5555", "alicedoe@psu.edu", "InsertAddressHere", "Computer Science", 8000.0, new Date(2023, 9, 1), new ArrayList<Course>());
        students[1] = new Student("Bob", "Smith", "Engineering", "zmb8245", "666-666-6666", "bobsmith@psu.edu", "InsertAddressHere", "Engineering", 9000.0, new Date(2023, 9, 1), new ArrayList<Course>());
        students[2] = new Student("Charlie", "Johnson", "Mathematics", "xct9421", "777-777-7777", "charliejohnson@psu.edu", "InsertAddressHere", "Mathematics", 7500.0, new Date(2023, 9, 1), new ArrayList<Course>());
        students[3] = new Student("David", "Lee", "Biology", "xdl7069", "888-888-8888", "davidlee@psu.edu", "InsertAddressHere", "Biology", 8500.0, new Date(2023, 9, 1), new ArrayList<Course>());
        students[4] = new Student("Eve", "Brown", "Physics", "xee1092", "999-999-9999", "evebrown@psu.edu", "InsertAddressHere", "Physics", 8200.0, new Date(2023, 9, 1), new ArrayList<Course>());
        students[5] = new Student("Frank", "Clark", "Chemistry", "xfr5527", "000-000-0000", "frankclark@psu.edu", "InsertAddressHere", "Chemistry", 7800.0, new Date(2023, 9, 1), new ArrayList<Course>());

        //uses Set method to assign 2 students to 1 advisor
        advisors[0].setAdvisees(new Student[]{students[0], students[1]});
        advisors[1].setAdvisees(new Student[]{students[2], students[3]});
        advisors[2].setAdvisees(new Student[]{students[4], students[5]});

        // Uses get method, and add implement method to assign courses to students.
        students[0].getCourseList().add(course1);
        students[0].getCourseList().add(course2);
        students[0].getCourseList().add(course3);

        students[1].getCourseList().add(course2);
        students[1].getCourseList().add(course3);

        students[2].getCourseList().add(course1);
        students[2].getCourseList().add(course3);

        students[3].getCourseList().add(course2);
        students[3].getCourseList().add(course3);

        students[4].getCourseList().add(course1);
        students[4].getCourseList().add(course2);

        students[5].getCourseList().add(course1);
        students[5].getCourseList().add(course3);

        // Display information
        for (Advisor advisor : advisors) {
            advisor.display();
            System.out.println();
        }

        for (Student student : students) {
            student.display();
            System.out.println();
        }
    }
}
