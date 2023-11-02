public class Course {
    private String courseNum;
    private double numCredits;
    private double pricePerCredit;

    public Course(String courseNumber, double numCredits, double pricePerCredit) {
        this.courseNum = courseNumber;
        this.numCredits = numCredits;
        this.pricePerCredit = pricePerCredit;
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
    public String displayCourseInfo() {
        return "Course Number: " + courseNum + "\n" +
                "Number of Credits: " + numCredits + "\n" +
                "Price per Credit: $" + pricePerCredit + "\n";
    }


}
