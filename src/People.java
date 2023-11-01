public abstract class People implements Payable{
    private String firstName;
    private String middleName;
    private String lastName;
    private String academicId;
    private String phoneNum;
    private String email;
    private String address;

    public People(String firstName, String middleName, String lastName, String academicId, String phoneNum, String email, String address) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.academicId = academicId;
        this.phoneNum = phoneNum;
        this.email = email;
        this.address = address;
    }

    public String getAcademicId() {
        return academicId;
    }

    public void setAcademicId(String academicId) {
        this.academicId = academicId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public double Payment() {
        System.out.println("Payment");
        return 0;
    }

    public abstract void display();
}
