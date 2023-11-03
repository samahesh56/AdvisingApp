import java.util.*;
public class Advisor extends People {
    private String advisorTitle;
    private Date hireDate;
    private ArrayList<Student> advisees;
    private double salary;

        public Advisor(String fN, String mN, String lN, String id, Phone phoneNum, Email email, Address address,
                       String advisorTitle, double salary, Date hireDate, ArrayList<Student> advisees) {
            super(fN, mN, lN, id, phoneNum, email, address);

            this.advisorTitle = advisorTitle;
            this.salary = salary;
            this.hireDate = hireDate;
            this.advisees = advisees;
        }


        public String getAdvisorTitle() {
            return advisorTitle;
        }

        public void setAdvisorTitle(String advisorTitle) {
            this.advisorTitle = advisorTitle;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public Date getHireDate() {
            return hireDate;
        }

        public void setHireDate(Date hireDate) {
            this.hireDate = hireDate;
        }

        public ArrayList<Student> getAdvisees() {
            return advisees;
        }

        // sets advisees to new ArrayList
        public void setAdvisees(ArrayList<Student> advisees) {
            this.advisees = advisees;
        }

        // adds new advisee to existing ArrayList
        public void addAdvisee(Student advisee) {
            this.advisees.add(advisee);
        }

        @Override
        public void Payment() {

        }

    @Override
    public String display() {
        String adviseesStr = "";
        for (int i = 0; i < this.advisees.size(); i++) {
            adviseesStr += this.advisees.get(i).display() + "\n";
        }

        return String.format("Advisor:\n" +
                        "Name: %s %s %s\n" +
                        "id: %s\n" +
                        "Phone: %s\n" +
                        "Email: %s\n" +
                        "Address: %s\n" +
                        "Title: %s\n" +
                        "Salary: $%.2f\n" +
                        "Hired Date: %s\n" +
                        "Advisees: \n%s\n", getFirstName(), getMiddleName(), getLastName(), getAcademicId(), getPhoneNum(),
                getEmail(), getAddress(), getAdvisorTitle(), getSalary(), getHireDate(), adviseesStr);
    }
}
