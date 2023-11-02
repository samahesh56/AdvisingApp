import java.util.ArrayList;

public class Student extends People {
    private String major;
    private double tuitionPerSem;
    private Date admitDate;
    private ArrayList<Course> courseList;
    public Student(String fN, String mN, String lN, String id, Phone pN, Email e, Address a, String major,
                   double tuitionPerSem, Date admitDate, ArrayList<Course> courseList) {
        super(fN, mN, lN, id, pN, e, a);

        this.major = major;
        this.tuitionPerSem = tuitionPerSem;
        this.admitDate = admitDate;
        this.courseList = courseList;
    }


    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getTuitionPerSem() {
        return tuitionPerSem;
    }

    public void setTuitionPerSem(double tuitionPerSem) {
        this.tuitionPerSem = tuitionPerSem;
    }

    public Date getAdmitDate() {
        return admitDate;
    }

    public void setAdmitDate(Date admitDate) {
        this.admitDate = admitDate;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public double Payment() {
        System.out.println("Payment");
        return 0; // change this
    }

    @Override
    public String display() { //change this
        return String.format("Student:\n" +
                        "Name: %s %s %s\n" +
                        "id: %s\n" +
                        "Phone: %s\n" +
                        "Email: %s\n" +
                        "Address: %s\n" +
                        "Major: %s\n" +
                        "TuitionPerSem: $%.2f\n" +
                        "Admit Date: %s\n" +
                        "Course List: \n%s\n", getFirstName(), getMiddleName(), getLastName(), getAcademicId(), getPhoneNum(),
                getEmail(), getAddress(), getMajor(), getTuitionPerSem(), getAdmitDate(), getCourseList());
    }
}
