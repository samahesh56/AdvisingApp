public class Course {
    private String courseNum;
    private double numCredits;
    private double pricePerCredit;

    public Course(String courseNumber, double numCredits, double pricePerCredit) {
        this.courseNum = courseNumber;
        this.numCredits = numCredits;
        pricePerCredit = 500.0;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNum = courseNumber;
    }

    public void setNumCredits(double numCredits) {
        this.numCredits = numCredits;
    }

    public String getCourseNumber() {
        return courseNum;
    }

    public double getNumCredits() {
        return numCredits;
    }

    public double getPricePerCredit() {
        return pricePerCredit;
    }

    public void setPricePerCredit(double pricePerCredit) {
        this.pricePerCredit = pricePerCredit;
    }

    // course info
    public void displayCourseInfo() {
        System.out.println("Course Information:");
        System.out.println("Course Number: " + courseNum);
        System.out.println("Number of Credits: " + numCredits);
        System.out.println("Price per Credit: $" + pricePerCredit);
    }


}
