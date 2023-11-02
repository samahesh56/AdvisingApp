/*********************************************************
 * file name: AdviseeTester.java
 * programmer names: Sankeerth Mahesh, Brian Tran
 * date created: 10/22/23
 * date of last revision: 11/2/23
 * details of the revision: Change array data
 * short description: Demonstrates a data management system focused on organizing academic advisor and advisee’s information through OOP  and OOD.
 **********************************************************/

import java.util.ArrayList;

public class AdviseeTester {
    public static void main(String[] args) {
        // Hire date objects
        Date hireDate1 = new Date(15, 10, 2023);
        Date hireDate2 = new Date(1, 9, 2023);
        Date hireDate3 = new Date(5, 8, 2022);

        // Phone
        Phone phone1 = new Phone("Apple", "iPhone 7 plus", "555-555-5555");
        Phone phone2 = new Phone("Samsung", "Galaxy S22", "666-666-6666");
        Phone phone3 = new Phone("Google", "Pixel 7", "777-777-7777");
        Phone phone4 = new Phone("Apple", "iPhone 15 pro", "888-888-8888");
        Phone phone5 = new Phone("Xiaomi", "Xiaomi 13", "999-999-9999");
        Phone phone6 = new Phone("Huawei", "P50 pro", "000-000-0000");
        Phone phone7 = new Phone("Nokia", "Blackberry", "111-111-1111");
        Phone phone8 = new Phone("Samsung", "Galaxy Z Flip", "222-222-2222");
        Phone phone9 = new Phone("Google", "Pixel 6", "333-333-3333");

        // Email
        Email email1 = new Email("Academic", "alicedoe@psu.edu");
        Email email2 = new Email("Academic", "bobsmith@psu.edu");
        Email email3 = new Email("Academic", "charliejohnson@psu.edu");
        Email email4 = new Email("Academic", "davidlee@psu.edu");
        Email email5 = new Email("Academic", "evebrown@psu.edu");
        Email email6 = new Email("Academic", "frankclark@psu.edu");
        Email email7 = new Email("Academic", "johndoe@psu.edu");
        Email email8 = new Email("Academic", "janesmith@psu.edu");
        Email email9 = new Email("Academic", "robertjohnson@psu.edu");


        // Address
        Address address1 = new Address("972 Timothy Mission", "Antoineport", "NM", "62149");
        Address address2 = new Address("58060 Mohr Curve", "Schowaltershire", "MT", "60849");
        Address address3 = new Address("13766 Larkin Ford", "Leanorafurt", "MI", "99988");
        Address address4 = new Address("73348 Rocco Bypass", "Morarton", "NM", "90274");
        Address address5 = new Address("15645 Fanny Expressway", "Marchelleburgh", "NH", "38455");
        Address address6 = new Address("394 Gleichner Parkway", "Wiltonchester", "LA", "98677");
        Address address7 = new Address("9367 Morissette Cove", "Patview", "CO", "47224");
        Address address8 = new Address("6081 Champlin Glens", "Lake Byron", "IN", "69474");
        Address address9 = new Address("392 Roberto Club", "Rockyport", "MN", "67300");



        // Course objects
        Course course1 = new Course("CMPSC132", 3, 500.0);
        Course course2 = new Course("MATH220", 4, 500.0);
        Course course3 = new Course("PHYS212", 4, 500.0);

        // Advisor arrays (3)
        Advisor[] advisors = new Advisor[3];
        advisors[0] = new Advisor("John", "James", "Doe", "xmt5028", phone7, email7, address7, "Professor", 75000.0, hireDate1, new Student[2]);
        advisors[1] = new Advisor("Jane", "William", "Smith", "ysk3015", phone8, email8, address8, "Associate Professor", 60000.0, hireDate2, new Student[2]);
        advisors[2] = new Advisor("Robert", "Robert", "Johnson", "zlw4052", phone9, email9, address9, "Assistant Professor", 55000.0, hireDate3, new Student[2]);

        // Student arrays (6, 2 per advisor)
        Student[] students = new Student[6];
        students[0] = new Student("Alice", "David", "Doe", "xsa7012", phone1, email1, address1, "Computer Science", 8000.0, new Date(2023, 9, 1), new ArrayList<Course>());
        students[1] = new Student("Bob", "Peter", "Smith", "zmb8245", phone2, email2, address2, "Engineering", 9000.0, new Date(2023, 9, 1), new ArrayList<Course>());
        students[2] = new Student("Charlie", "Noah", "Johnson", "xct9421", phone3, email3, address3, "Mathematics", 7500.0, new Date(2023, 9, 1), new ArrayList<Course>());
        students[3] = new Student("David", "Luke", "Lee", "xdl7069", phone4, email4, address4, "Biology", 8500.0, new Date(2023, 9, 1), new ArrayList<Course>());
        students[4] = new Student("Eve", "Myles", "Brown", "xee1092", phone5, email5, address5, "Physics", 8200.0, new Date(2023, 9, 1), new ArrayList<Course>());
        students[5] = new Student("Frank", "Gabe", "Clark", "xfr5527", phone6, email6, address6, "Chemistry", 7800.0, new Date(2023, 9, 1), new ArrayList<Course>());

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
            System.out.println(advisor.display());
        }

        for (Student student : students) {
            System.out.println(student.display());
        }
    }
}

//benchmark data
/*
Advisor:
Name: John James Doe
id: xmt5028
Phone: Brand: Nokia | Model: Blackberry | Number: 111-111-1111
Email: Email{type='Academic', address='johndoe@psu.edu'}
Address: 9367 Morissette Cove Patview, CO 47224
Title: Professor
Salary: $75000.00
Hired Date: 15/10/2023
Advisees:
Student:
Name: Alice David Doe
id: xsa7012
Phone: Brand: Apple | Model: iPhone 7 plus | Number: 555-555-5555
Email: Email{type='Academic', address='alicedoe@psu.edu'}
Address: 972 Timothy Mission Antoineport, NM 62149
Major: Computer Science
TuitionPerSem: $8000.00
Admit Date: 2023/9/1
Course List:
Course Number: CMPSC132
Number of Credits: 3.0
Price per Credit: $500.0

Course Number: MATH220
Number of Credits: 4.0
Price per Credit: $500.0

Course Number: PHYS212
Number of Credits: 4.0
Price per Credit: $500.0



Student:
Name: Bob Peter Smith
id: zmb8245
Phone: Brand: Samsung | Model: Galaxy S22 | Number: 666-666-6666
Email: Email{type='Academic', address='bobsmith@psu.edu'}
Address: 58060 Mohr Curve Schowaltershire, MT 60849
Major: Engineering
TuitionPerSem: $9000.00
Admit Date: 2023/9/1
Course List:
Course Number: MATH220
Number of Credits: 4.0
Price per Credit: $500.0

Course Number: PHYS212
Number of Credits: 4.0
Price per Credit: $500.0





Advisor:
Name: Jane William Smith
id: ysk3015
Phone: Brand: Samsung | Model: Galaxy Z Flip | Number: 222-222-2222
Email: Email{type='Academic', address='janesmith@psu.edu'}
Address: 6081 Champlin Glens Lake Byron, IN 69474
Title: Associate Professor
Salary: $60000.00
Hired Date: 1/9/2023
Advisees:
Student:
Name: Charlie Noah Johnson
id: xct9421
Phone: Brand: Google | Model: Pixel 7 | Number: 777-777-7777
Email: Email{type='Academic', address='charliejohnson@psu.edu'}
Address: 13766 Larkin Ford Leanorafurt, MI 99988
Major: Mathematics
TuitionPerSem: $7500.00
Admit Date: 2023/9/1
Course List:
Course Number: CMPSC132
Number of Credits: 3.0
Price per Credit: $500.0

Course Number: PHYS212
Number of Credits: 4.0
Price per Credit: $500.0



Student:
Name: David Luke Lee
id: xdl7069
Phone: Brand: Apple | Model: iPhone 15 pro | Number: 888-888-8888
Email: Email{type='Academic', address='davidlee@psu.edu'}
Address: 73348 Rocco Bypass Morarton, NM 90274
Major: Biology
TuitionPerSem: $8500.00
Admit Date: 2023/9/1
Course List:
Course Number: MATH220
Number of Credits: 4.0
Price per Credit: $500.0

Course Number: PHYS212
Number of Credits: 4.0
Price per Credit: $500.0





Advisor:
Name: Robert Robert Johnson
id: zlw4052
Phone: Brand: Google | Model: Pixel 6 | Number: 333-333-3333
Email: Email{type='Academic', address='robertjohnson@psu.edu'}
Address: 392 Roberto Club Rockyport, MN 67300
Title: Assistant Professor
Salary: $55000.00
Hired Date: 5/8/2022
Advisees:
Student:
Name: Eve Myles Brown
id: xee1092
Phone: Brand: Xiaomi | Model: Xiaomi 13 | Number: 999-999-9999
Email: Email{type='Academic', address='evebrown@psu.edu'}
Address: 15645 Fanny Expressway Marchelleburgh, NH 38455
Major: Physics
TuitionPerSem: $8200.00
Admit Date: 2023/9/1
Course List:
Course Number: CMPSC132
Number of Credits: 3.0
Price per Credit: $500.0

Course Number: MATH220
Number of Credits: 4.0
Price per Credit: $500.0



Student:
Name: Frank Gabe Clark
id: xfr5527
Phone: Brand: Huawei | Model: P50 pro | Number: 000-000-0000
Email: Email{type='Academic', address='frankclark@psu.edu'}
Address: 394 Gleichner Parkway Wiltonchester, LA 98677
Major: Chemistry
TuitionPerSem: $7800.00
Admit Date: 2023/9/1
Course List:
Course Number: CMPSC132
Number of Credits: 3.0
Price per Credit: $500.0

Course Number: PHYS212
Number of Credits: 4.0
Price per Credit: $500.0





Student:
Name: Alice David Doe
id: xsa7012
Phone: Brand: Apple | Model: iPhone 7 plus | Number: 555-555-5555
Email: Email{type='Academic', address='alicedoe@psu.edu'}
Address: 972 Timothy Mission Antoineport, NM 62149
Major: Computer Science
TuitionPerSem: $8000.00
Admit Date: 2023/9/1
Course List:
Course Number: CMPSC132
Number of Credits: 3.0
Price per Credit: $500.0

Course Number: MATH220
Number of Credits: 4.0
Price per Credit: $500.0

Course Number: PHYS212
Number of Credits: 4.0
Price per Credit: $500.0



Student:
Name: Bob Peter Smith
id: zmb8245
Phone: Brand: Samsung | Model: Galaxy S22 | Number: 666-666-6666
Email: Email{type='Academic', address='bobsmith@psu.edu'}
Address: 58060 Mohr Curve Schowaltershire, MT 60849
Major: Engineering
TuitionPerSem: $9000.00
Admit Date: 2023/9/1
Course List:
Course Number: MATH220
Number of Credits: 4.0
Price per Credit: $500.0

Course Number: PHYS212
Number of Credits: 4.0
Price per Credit: $500.0



Student:
Name: Charlie Noah Johnson
id: xct9421
Phone: Brand: Google | Model: Pixel 7 | Number: 777-777-7777
Email: Email{type='Academic', address='charliejohnson@psu.edu'}
Address: 13766 Larkin Ford Leanorafurt, MI 99988
Major: Mathematics
TuitionPerSem: $7500.00
Admit Date: 2023/9/1
Course List:
Course Number: CMPSC132
Number of Credits: 3.0
Price per Credit: $500.0

Course Number: PHYS212
Number of Credits: 4.0
Price per Credit: $500.0



Student:
Name: David Luke Lee
id: xdl7069
Phone: Brand: Apple | Model: iPhone 15 pro | Number: 888-888-8888
Email: Email{type='Academic', address='davidlee@psu.edu'}
Address: 73348 Rocco Bypass Morarton, NM 90274
Major: Biology
TuitionPerSem: $8500.00
Admit Date: 2023/9/1
Course List:
Course Number: MATH220
Number of Credits: 4.0
Price per Credit: $500.0

Course Number: PHYS212
Number of Credits: 4.0
Price per Credit: $500.0



Student:
Name: Eve Myles Brown
id: xee1092
Phone: Brand: Xiaomi | Model: Xiaomi 13 | Number: 999-999-9999
Email: Email{type='Academic', address='evebrown@psu.edu'}
Address: 15645 Fanny Expressway Marchelleburgh, NH 38455
Major: Physics
TuitionPerSem: $8200.00
Admit Date: 2023/9/1
Course List:
Course Number: CMPSC132
Number of Credits: 3.0
Price per Credit: $500.0

Course Number: MATH220
Number of Credits: 4.0
Price per Credit: $500.0



Student:
Name: Frank Gabe Clark
id: xfr5527
Phone: Brand: Huawei | Model: P50 pro | Number: 000-000-0000
Email: Email{type='Academic', address='frankclark@psu.edu'}
Address: 394 Gleichner Parkway Wiltonchester, LA 98677
Major: Chemistry
TuitionPerSem: $7800.00
Admit Date: 2023/9/1
Course List:
Course Number: CMPSC132
Number of Credits: 3.0
Price per Credit: $500.0

Course Number: PHYS212
Number of Credits: 4.0
Price per Credit: $500.0

 */
