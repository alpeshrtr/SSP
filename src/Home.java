
import java.util.Scanner;
public class Home {

    public int showMenu(Scanner scan) {
        System.out.println();
        System.out.println("****************** WELCOME TO STUDENT SCHOLARSHIP PORTAL ******************");
        System.out.println();
        System.out.println("1. Generate OTR");
        System.out.println("2. Generate Registration Number");
        System.out.println("3. Update Banking Details");
        System.out.println();
        System.out.print("Enter your choice: ");
        return scan.nextInt();
    }
}