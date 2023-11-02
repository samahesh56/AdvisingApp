    public class Advisor extends People {
    private String advisorTitle;
    private double salary;
    private Date hireDate;
    private Student[] advisees;

        public Advisor(String fN, String mN, String lN, String id, Phone phoneNum, Email email, Address address,
                       String advisorTitle, double salary, Date hireDate, Student[] advisees) {
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

        public Student[] getAdvisees() {
            return advisees;
        }

        public void setAdvisees(Student[] advisees) {
            this.advisees = advisees;
        }

        @Override
    public double Payment() {
        return getSalary();
    }

    @Override
    public void display() {
        System.out.println("this is a test display of advisor");
    }
}
