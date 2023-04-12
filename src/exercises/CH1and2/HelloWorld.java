package exercises.CH1and2;
import java.util.Scanner;

public class HelloWorld {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Hello, what is your name: ");
//
//        String name = input.nextLine();
//        System.out.println("Hello " + name);
//    }

    //OR//

    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        hello.askUserForTheirName();
    }

    public void askUserForTheirName() {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello, what is your name: ");

        String name = input.nextLine();

        System.out.println("Hello " + name);
    }
}
