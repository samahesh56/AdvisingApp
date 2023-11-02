public abstract class People implements Payable{
    private String firstName;
    private String middleName;
    private String lastName;
    private String academicId;
    private Phone phoneNum;
    private Email email;
    private Address address;

    public People(String fN, String mN, String lN, String id, Phone pN, Email e, Address a) {
        this.firstName = fN;
        this.middleName = mN;
        this.lastName = lN;
        this.academicId = id;
        this.phoneNum = pN;
        this.email = e;
        this.address = a;
    }

    public String getAcademicId() {
        return academicId;
    }

    public void setAcademicId(String academicId) {
        this.academicId = academicId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
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

    public Phone getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(Phone phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public double Payment() {
        System.out.println("Payment");
        return 0;
    }

    public abstract String display();
}
