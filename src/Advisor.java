public class Advisor extends People {
    private String advisorTitle;
    private double salary;
    private Date hireDate;
    private Student[] advisees;

    public Advisor(String firstName, String middleName, String lastName, String academicId, String phoneNum, String email, String address) {
        super(firstName, middleName, lastName, academicId, phoneNum, email, address);

        this.advisorTitle = advisorTitle;
        this.salary = salary;
        this.hireDate = hireDate;
        this.advisees = advisees;
    }

    @Override
    public void Payment() {
        System.out.println("Advisor's annual salary: $" + salary);
    }

    @Override
    public void display() {

    }
}
