/*********************************************************
 * file name: AdviseeTester.java
 * programmer names: Sankeerth Mahesh, Brian Tran
 * date created: 10/22/23
 * date of last revision: 11/2/23
 * details of the revision: Change array data
 * short description: Demonstrates a data management system focused on organizing academic advisor and advisee’s information through OOP  and OOD.
 **********************************************************/

import java.util.ArrayList;
import java.util.Scanner;

public class AdviseeTester {
    public static void main(String[] args) {
        // Hire date objects
        Date hireDate1 = new Date(15, 10, 2004);
        Date hireDate2 = new Date(1, 9, 2009);
        Date hireDate3 = new Date(5, 8, 2014);

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
        advisors[0] = new Advisor("John", "James", "Doe", "jjd5028", phone7, email7, address7, "Professor", 75000.0, hireDate1, new ArrayList<Student>());
        advisors[1] = new Advisor("Jane", "William", "Smith", "jws3015", phone8, email8, address8, "Head Professor", 60000.0, hireDate2, new ArrayList<Student>());
        advisors[2] = new Advisor("Robert", "David", "Johnson", "rdj4052", phone9, email9, address9, "Assistant Professor", 55000.0, hireDate3, new ArrayList<Student>());

        // Student arrays (6, 2 per advisor)
        Student[] students = new Student[6];
        students[0] = new Student("Alice", "David", "Doe", "add7012", phone1, email1, address1, "Computer Science", 8000.0, new Date(1, 9, 2015), new ArrayList<Course>());
        students[1] = new Student("Bob", "Peter", "Smith", "bps8245", phone2, email2, address2, "Engineering", 9000.0, new Date(20, 3, 2003), new ArrayList<Course>());
        students[2] = new Student("Charlie", "Noah", "Johnson", "cnj9421", phone3, email3, address3, "Mathematics", 7500.0, new Date(4, 11, 2010), new ArrayList<Course>());
        students[3] = new Student("David", "Luke", "Lee", "dll7069", phone4, email4, address4, "Biology", 8500.0, new Date(12, 2, 2018), new ArrayList<Course>());
        students[4] = new Student("Eve", "Myles", "Brown", "emb1092", phone5, email5, address5, "Physics", 8200.0, new Date(15, 3, 2020), new ArrayList<Course>());
        students[5] = new Student("Frank", "Gabe", "Clark", "fgc5527", phone6, email6, address6, "Chemistry", 7800.0, new Date(26, 4, 2022), new ArrayList<Course>());

        //uses Set method to assign 2 students to 1 advisor
        ArrayList<Student> advisees1 = new ArrayList<>();
        advisees1.add(students[0]);
        advisees1.add(students[1]);

        ArrayList<Student> advisees2 = new ArrayList<>();
        advisees2.add(students[2]);
        advisees2.add(students[3]);

        ArrayList<Student> advisees3 = new ArrayList<>();
        advisees3.add(students[4]);
        advisees3.add(students[5]);

        advisors[0].setAdvisees(advisees1);
        advisors[1].setAdvisees(advisees2);
        advisors[2].setAdvisees(advisees3);

        // Uses get method, and add implement method to assign courses to students.
        students[0].getCourseList().add(course1);
        students[0].getCourseList().add(course2);
        students[0].getCourseList().add(course3);
        students[0].Payment();

        students[1].getCourseList().add(course1);
        students[1].getCourseList().add(course2);
        students[1].getCourseList().add(course3);
        students[1].Payment();

        students[2].getCourseList().add(course1);
        students[2].getCourseList().add(course1);
        students[2].getCourseList().add(course3);
        students[2].Payment();

        students[3].getCourseList().add(course1);
        students[3].getCourseList().add(course2);
        students[3].getCourseList().add(course3);
        students[3].Payment();

        students[4].getCourseList().add(course1);
        students[4].getCourseList().add(course1);
        students[4].getCourseList().add(course2);
        students[4].Payment();

        students[5].getCourseList().add(course1);
        students[5].getCourseList().add(course1);
        students[5].getCourseList().add(course3);
        students[5].Payment();

        /* Display information
        for (Advisor advisorsList : advisors) {
            System.out.println(advisor.display());
        }

        for (Student student : students) {
            System.out.println(student.display());
        }
         */

        ArrayList<Advisor> advisorsList = new ArrayList<>(); // initializes new advisorList array to add/delete advisors as needed.

        // Copy elements from the array to the ArrayList
        for (Advisor advisor : advisors) {
            advisorsList.add(advisor);
        }
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Advisor Menu:");
            System.out.println("a. Add an advisor");
            System.out.println("b. Edit an advisor");
            System.out.println("c. Delete an advisor");
            System.out.println("d. Display an advisor's information");
            System.out.println("e. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.next();

            switch (choice) {
                case "a":
                    // Add an advisor
                    addAdvisor(advisorsList);
                    break;
                case "b":
                    // Edit an advisor
                    editAdvisor(advisorsList);
                    break;
                case "c":
                    // Delete an advisor
                    deleteAdvisor(advisorsList);
                    break;
                case "d":
                    // Display an advisor's information
                    displayAdvisor(advisorsList);
                    break;
                case "e":
                    // Exit the application
                    System.out.println("Exiting the application.");
                    System.exit(0); //ends the program
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // addAdvisor function prompts a new advisor with 2 empty advisees (students)
    public static void addAdvisor(ArrayList<Advisor> advisorsList) {
        Advisor newAdvisor = new Advisor("NewAdvisorFirstName", "", "NewAdvisorLastName", "", new Phone("", "", ""),
                new Email("", ""), new Address("","","",""), "", 0.0, new Date(0, 0, 0), new ArrayList<Student>());
        newAdvisor.setAdvisees(new ArrayList<>());
        advisorsList.add(newAdvisor);
        System.out.println("Advisor successfully created");
    }

    private static void editAdvisor(ArrayList<Advisor> advisorsList) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select which advisor to edit:");

        for (int i = 0; i < advisorsList.size(); i++) {
            Advisor advisor = advisorsList.get(i);
            System.out.println((i + 1) + ". " + advisor.getFirstName() + " " + advisor.getLastName());
        }

        int advisorIndex = scanner.nextInt() - 1;

        // iterates through advisor list index to choose advisor.
        if (advisorIndex >= 0 && advisorIndex < advisorsList.size()) {
            Advisor selectedAdvisor = advisorsList.get(advisorIndex); //selects advisor of given index from list and assigns to selectedAdvisor
            boolean editing = true;

            while (editing) {
                System.out.println("Select an attribute to edit:");
                System.out.println("1. Name");
                System.out.println("2. Id");
                System.out.println("3. Phone");
                System.out.println("4. Email");
                System.out.println("5. Address");
                System.out.println("6. Advisor Title");
                System.out.println("7. Annual Salary");
                System.out.println("8. Hire Date");
                System.out.println("9. Advisees");
                System.out.println("10. Exit Editing Menu");

                int choice = scanner.nextInt();
                scanner.nextLine();


                switch (choice) {
                    case 1:
                        // Submenu for editing name
                        boolean nameEditing = true;
                        while (nameEditing) {
                            System.out.println("Select which part of the name to edit:");
                            System.out.println("1. First Name");
                            System.out.println("2. Middle Name");
                            System.out.println("3. Last Name");
                            System.out.println("4. Exit Submenu");
                            int nameChoice = scanner.nextInt();
                            scanner.nextLine();

                            if (nameChoice == 1) {
                                System.out.println("Enter the new first name: ");
                                String firstName = scanner.nextLine();
                                selectedAdvisor.setFirstName(firstName);
                            } else if (nameChoice == 2) {
                                System.out.println("Enter the new middle name: ");
                                String middleName = scanner.nextLine();
                                selectedAdvisor.setMiddleName(middleName);
                            } else if (nameChoice == 3) {
                                System.out.println("Enter the new last name: ");
                                String lastName = scanner.nextLine();
                                selectedAdvisor.setLastName(lastName);
                            } else if (nameChoice == 4) {
                                nameEditing = false; // Exit the submenu
                            } else {
                                System.out.println("Invalid choice. Please enter a valid option.");
                            }
                        }
                        break;
                    case 2:
                        // ID changing
                        System.out.println("Enter the new academic ID: ");
                        String id = scanner.nextLine();
                        selectedAdvisor.setAcademicId(id);
                        break;
                    case 3:
                        // Submenu for editing phone
                        boolean phoneEditing = true;
                        while (phoneEditing) {
                            System.out.println("Select which part of the phone to edit:");
                            System.out.println("1. Brand");
                            System.out.println("2. Model");
                            System.out.println("3. Number");
                            System.out.println("4. Exit Submenu");
                            int phoneChoice = scanner.nextInt();
                            scanner.nextLine();

                            if (phoneChoice == 1) {
                                System.out.println("Enter the new phone brand: ");
                                String brand = scanner.nextLine();
                                selectedAdvisor.getPhoneNum().setBrand(brand);
                            } else if (phoneChoice == 2) {
                                System.out.println("Enter the new phone model: ");
                                String model = scanner.nextLine();
                                selectedAdvisor.getPhoneNum().setModel(model);
                            } else if (phoneChoice == 3) {
                                System.out.println("Enter the new phone number: ");
                                String number = scanner.nextLine();
                                selectedAdvisor.getPhoneNum().setNumber(number);
                            } else if (phoneChoice == 4) {
                                phoneEditing = false; // Exit the submenu
                            } else {
                                System.out.println("Invalid choice. Please enter a valid option.");
                            }
                        }
                        break;

                    case 4:
                        // Submenu for editing Email
                        boolean emailEditing = true;
                        while (emailEditing) {
                            System.out.println("Select which part of the email to edit:");
                            System.out.println("1. Email Type");
                            System.out.println("2. Email Address");
                            System.out.println("3. Exit Submenu");
                            int emailChoice = scanner.nextInt();
                            scanner.nextLine();

                            if (emailChoice == 1) {
                                System.out.println("Enter the new email type: ");
                                String type = scanner.nextLine();
                                selectedAdvisor.getEmail().setType(type);
                            } else if (emailChoice == 2) {
                                System.out.println("Enter the new email address: ");
                                String address = scanner.nextLine();
                                selectedAdvisor.getEmail().setAddress(address);
                            }
                            else if (emailChoice == 3) {
                                emailEditing = false; // Exit the submenu
                            } else {
                                System.out.println("Invalid choice. Please enter a valid option.");
                            }
                        }
                        break;
                    case 5:
                        // Submenu for editing address
                        boolean addressEditing = true;
                        while (addressEditing) {
                            System.out.println("Select which part of the address to edit:");
                            System.out.println("1. Street Number");
                            System.out.println("2. City");
                            System.out.println("3. State");
                            System.out.println("4. Zipcode");
                            System.out.println("5. Exit Submenu");
                            int addressChoice = scanner.nextInt();
                            scanner.nextLine();

                            if (addressChoice == 1) {
                                System.out.println("Enter the new street number: ");
                                String streetNo = scanner.next();
                                selectedAdvisor.getAddress().setStreetNo(streetNo);
                            } else if (addressChoice == 2) {
                                System.out.println("Enter the new city: ");
                                String city = scanner.nextLine();
                                selectedAdvisor.getAddress().setCity(city);
                            } else if (addressChoice == 3) {
                                System.out.println("Enter the new state: ");
                                String state = scanner.nextLine();
                                selectedAdvisor.getAddress().setState(state);
                            } else if (addressChoice == 4) {
                                System.out.println("Enter the new zipcode: ");
                                String zipcode = scanner.nextLine();
                                selectedAdvisor.getAddress().setZipcode(zipcode);
                            } else if (addressChoice == 5) {
                                addressEditing = false; // Exit the submenu
                            } else {
                                System.out.println("Invalid choice. Please enter a valid option.");
                            }
                        }
                        break;
                    case 6:
                        // title changing
                        System.out.println("Enter the new advisor title: ");
                        String title = scanner.nextLine();
                        selectedAdvisor.setAdvisorTitle(title);
                        break;
                    case 7:
                        // title changing
                        System.out.println("Enter the new annual salary: ");
                        double salary = scanner.nextDouble();
                        selectedAdvisor.setSalary(salary);
                        break;
                    case 8:
                        // Submenu for editing hire Date
                        boolean dateEditing = true;
                        while (dateEditing) {
                            System.out.println("Select which part of the hire date to edit:");
                            System.out.println("1. Day");
                            System.out.println("2. Month");
                            System.out.println("3. Year");
                            System.out.println("4. Exit Submenu");
                            int dateChoice = scanner.nextInt();
                            scanner.nextLine();

                            switch (dateChoice) {
                                case 1:
                                    System.out.println("Enter the new day: ");
                                    int day = scanner.nextInt();
                                    selectedAdvisor.getHireDate().setDay(day);
                                    break;
                                case 2:
                                    System.out.println("Enter the new month: ");
                                    int month = scanner.nextInt();
                                    selectedAdvisor.getHireDate().setMonth(month);
                                    break;
                                case 3:
                                    System.out.println("Enter the new year: ");
                                    int year = scanner.nextInt();
                                    selectedAdvisor.getHireDate().setYear(year);
                                    break;
                                case 4:
                                    dateEditing = false;
                                    break;
                                default:
                                    System.out.println("Invalid choice. Please enter a valid option.");
                            }
                        }
                        break;
                    case 9:
                        // edit the list of advisees
                        boolean adviseeEditing = true;
                        while (adviseeEditing) {
                            System.out.println("1. Add advisee");
                            System.out.println("2. Remove advisee");
                            System.out.println("3. Edit advisee");
                            System.out.println("4. Exit submenu");
                            int option = scanner.nextInt();
                            scanner.nextLine();

                            if (option == 1) {
                                Student newStudent = new Student("NewAdviseeFirstName", "", "NewAdviseeLastName", "", new Phone("", "", ""),
                                        new Email("", ""), new Address("","","",""), "", 0.0, new Date(0, 0, 0), new ArrayList<Course>());
                                selectedAdvisor.getAdvisees().add(newStudent);
                                System.out.println("Advisee successfully created");
                            }
                            else if (option == 2) {
                                if (selectedAdvisor.getAdvisees().isEmpty()) {
                                    System.out.println("There are no advisees to delete.");
                                    return;
                                }

                                System.out.println("Select which student to delete:");

                                for (int i = 0; i < selectedAdvisor.getAdvisees().size(); i++) {
                                    Student student = selectedAdvisor.getAdvisees().get(i);
                                    System.out.println((i + 1) + ". " + student.getFirstName() + " " + student.getLastName());
                                }

                                int studentIndex = scanner.nextInt();

                                if (studentIndex >= 0 && studentIndex < selectedAdvisor.getAdvisees().size()) {
                                    Student deletedStudent = selectedAdvisor.getAdvisees().get(studentIndex);

                                    // Display the students name before being deleted
                                    System.out.println("Advisee to be deleted:");
                                    System.out.println(deletedStudent.getFirstName() + " " + deletedStudent.getLastName());
                                    selectedAdvisor.getAdvisees().remove(studentIndex); // Remove the advisor from the list
                                    System.out.println("Advisee deleted successfully.\n");

                                } else {
                                    System.out.println("Invalid advisee index. Please select a valid student.");
                                }
                            } else if (option == 3) {
                                System.out.println("Select a student to modify:");
                                for (int i = 0; i < selectedAdvisor.getAdvisees().size(); i++) {
                                    Student modifyStudent = selectedAdvisor.getAdvisees().get(i);
                                    System.out.println((i + 1) + ". " + modifyStudent.getFirstName() + " " + modifyStudent.getLastName());

                                }
                                System.out.println((selectedAdvisor.getAdvisees().size() + 1) + ". Exit Submenu");

                                int studentIndex = scanner.nextInt() - 1;

                                if (studentIndex >= 0 && studentIndex < selectedAdvisor.getAdvisees().size()){
                                    Student selectedStudent = selectedAdvisor.getAdvisees().get(studentIndex);

                                    boolean studentEditing = true;
                                    while (studentEditing) {
                                        System.out.println("Select which student attribute to modify:");
                                        System.out.println("1. Major");
                                        System.out.println("2. Tuition Per Semester");
                                        System.out.println("3. Admit Date");
                                        System.out.println("4. Course Information");
                                        System.out.println("5. Exit Advisee Editor");

                                        int studentChoice = scanner.nextInt();
                                        scanner.nextLine();

                                        if (studentChoice == 1) {
                                            System.out.println("Enter the new major: ");
                                            String major = scanner.nextLine();
                                            selectedStudent.setMajor(major);
                                        } else if (studentChoice == 2) {
                                            System.out.println("Enter the new tuition per semester: ");
                                            double tuition = scanner.nextDouble();
                                            scanner.nextLine();
                                            selectedStudent.setTuitionPerSem(tuition);
                                        } else if (studentChoice == 3) {
                                            System.out.print("Enter day: ");
                                            int newDay = scanner.nextInt();
                                            System.out.print("Enter month: ");
                                            int newMonth = scanner.nextInt();
                                            System.out.print("Enter Year: ");
                                            int newYear = scanner.nextInt();

                                            scanner.nextLine();

                                            selectedStudent.setAdmitDate(new Date(newDay, newMonth, newYear));
                                        } else if (studentChoice == 4) {
                                            // ADD SUBMENU FOR COURSE MODIFICATION
                                            // REMEMBER TO CALL PAYMENT AFTER COURSE MODIFICATION

                                        } else if (studentChoice == 5) {
                                            studentEditing = false; // Exit the submenu
                                        }else {
                                            System.out.println("Invalid choice. Please enter a valid option.");
                                        }
                                    }
                                }
                            }
                            else if (option == 4) {
                                adviseeEditing = false;
                            }
                            else {
                                System.out.println("Invalid choice. Please enter a valid option.");
                            }
                        }

                        break;
                    case 10:
                        editing = false; // Exit the editing loop
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        break;
                }
            }
        } else {
            System.out.println("Invalid advisor index. Please select a valid advisor.");
        }
    }

    public static void changeDate(Advisor selectedAdvisor, Scanner scanner) {
        boolean dateEditing = true;
        while (dateEditing) {
            System.out.println("Select which part of the hire date to edit:");
            System.out.println("1. Day");
            System.out.println("2. Month");
            System.out.println("3. Year");
            System.out.println("4. Exit Submenu");
            int dateChoice = scanner.nextInt();
            scanner.nextLine();

            switch (dateChoice) {
                case 1:
                    System.out.println("Enter the new day: ");
                    int day = scanner.nextInt();
                    selectedAdvisor.getHireDate().setDay(day);
                    break;
                case 2:
                    System.out.println("Enter the new month: ");
                    int month = scanner.nextInt();
                    selectedAdvisor.getHireDate().setMonth(month);
                    break;
                case 3:
                    System.out.println("Enter the new year: ");
                    int year = scanner.nextInt();
                    selectedAdvisor.getHireDate().setYear(year);
                    break;
                case 4:
                    dateEditing = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }


    private static void deleteAdvisor(ArrayList<Advisor> advisorsList) {
        if (advisorsList.isEmpty()) {
            System.out.println("There are no advisors to delete.");
            return;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select which advisor to delete:");

        for (int i = 0; i < advisorsList.size(); i++) {
            Advisor advisor = advisorsList.get(i);
            System.out.println((i + 1) + ". " + advisor.getFirstName() + " " + advisor.getLastName());
        }

        int advisorIndex = scanner.nextInt() - 1;

        if (advisorIndex >= 0 && advisorIndex < advisorsList.size()) {
            Advisor deletedAdvisor = advisorsList.get(advisorIndex);

            // Display the advisor's name before being deleted
            System.out.println("Advisor to be deleted:");
            System.out.println(deletedAdvisor.getFirstName() + " " + deletedAdvisor.getLastName());
            advisorsList.remove(advisorIndex); // Remove the advisor from the list
            System.out.println("Advisor deleted successfully.\n");

        } else {
            System.out.println("Invalid advisor index. Please select a valid advisor.");
        }

    }

    private static void displayAdvisor(ArrayList<Advisor> advisorsList) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select which advisor to display:");

        for (int i = 0; i < advisorsList.size(); i++) {
            Advisor advisor = advisorsList.get(i);
            System.out.println((i + 1) + ". " + advisor.getFirstName() + " " + advisor.getLastName());
        }

        int advisorIndex = scanner.nextInt() - 1;

        if (advisorIndex >= 0 && advisorIndex < advisorsList.size()) {
            Advisor selectedAdvisor = advisorsList.get(advisorIndex);

            System.out.println("Advisor Info");
            System.out.println(selectedAdvisor.display());

        }
        else {
            System.out.println("Invalid advisor number. Please select a valid advisor");
        }
    }

}

//benchmark data