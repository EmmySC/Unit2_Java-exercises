package exercises;


public class UsersName {

    public static void main(String[] args) {
        UsersName myFirstUsersName = new UsersName();
        myFirstUsersName.myFirstMethod();
    }

    private String myFirstClassVariable = "This is a string";

    public UsersName() {

    }

    public void myFirstMethod() {
        System.out.println("Hello User!");
    }

}
