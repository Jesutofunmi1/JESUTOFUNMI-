package PhoneBook;

public class UserInfo {
    private String Phone_Number;
    private String Name;
    private String fullName;
    private String address;
    private String SecurityNumber;
    private String email;

    public UserInfo(String Name, String Phone_Number) {
        this.Name = Name;
        this.Phone_Number = Phone_Number ;

    }

    public String getFullName() {
        return fullName;
    }

    public void setAddress(String Address) {
        this.address = address;

    }

    public String getAddress() {
        return address;
    }

    public String getPhone_Number() {
        return Phone_Number;
    }

    public void setSecurityNumber(String Security_Number) {
        this.SecurityNumber = Security_Number;
    }

    public String getSecurityNumber() {
        return SecurityNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;

    }
}
