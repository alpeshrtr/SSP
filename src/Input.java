import java.util.Scanner;

public class Input {
    public Student takeInput(Scanner scan) {
        System.out.println("\n****************** ENTER YOUR DETAILS ******************\n");
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.print("Enter your father's name: ");
        final String nameOfFather = scan.nextLine();
        System.out.print("Enter your age: ");
        final int age = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter your course: ");
        final String course = scan.nextLine();
        System.out.print("Enter your course duration: ");
        final int courseDuration = scan.nextInt();
        return new Student(name, nameOfFather, age, course, courseDuration);
    }
}