import java.util.ArrayList;

public class Student extends People {
    private String major;
    private Date admitDate;
    private ArrayList<Course> courseList;
    private double tuitionPerSem;

    public Student(String fN, String mN, String lN, String id, Phone pN, Email e, Address a, String major,
                   Date admitDate, ArrayList<Course> courseList) {
        super(fN, mN, lN, id, pN, e, a);

        this.major = major;
        this.admitDate = admitDate;
        this.courseList = courseList;

        // calculates payment when constructing the object

        double payment = 0;
        for (int i = 0; i < courseList.size(); i++) {
            payment += courseList.get(i).getNumCredits() * courseList.get(i).getPricePerCredit();
        }
        this.tuitionPerSem = payment;
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
    public void Payment() {

        // calculates payment again
        double payment = 0;
        for (int i = 0; i < courseList.size(); i++) {
            payment += courseList.get(i).getNumCredits() * courseList.get(i).getPricePerCredit();
        }
        this.tuitionPerSem = payment;
    }

    @Override
    public String display() {
        String courseListString = "";
        for (Course course : getCourseList()) {
            courseListString += course.displayCourseInfo() + "\n";
        }

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
                getEmail(), getAddress(), getMajor(), getTuitionPerSem(), getAdmitDate(), courseListString);
    }
}
