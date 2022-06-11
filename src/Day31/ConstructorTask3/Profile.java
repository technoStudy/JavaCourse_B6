package Day31.ConstructorTask3;

public class Profile {

    String firstName;
    String lastName;
    String address;
    String birthDate;
    String phone;
    String email;
    String nickName;

    // in Constructor body "this()" should be the first statement

    // Constructor 1
    public Profile(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Constructor 2
    public Profile(String firstName, String lastName, String birthDate) {
        this(firstName, lastName); // calling Constructor 1
        this.birthDate = birthDate;
    }

    // Constructor 3
    public Profile(String firstName, String lastName, String address, String birthDate,
                   String phone, String email, String nickName) {

        this(firstName, lastName, birthDate); // calling Constructor 2
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.nickName = nickName;

    }

}
