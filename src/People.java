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

    @Override
    public void Payment() {
        System.out.println("Payment");
    }

    public abstract void display();
}
