import java.util.ArrayList;

public class Student extends People {
    private String major;
    private double tuitionPerSem;
    private Date admitDate;
    private ArrayList<Course> courseList;
    public Student(String firstName, String middleName, String lastName, String academicId, String phoneNum, String email, String address, String major, double tuitionPerSem, Date admitDate, ArrayList<Course> courseList) {
        super(firstName, middleName, lastName, academicId, phoneNum, email, address);

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
    public void display() { //change this
        System.out.println("This is a test display of student");
    }
}
