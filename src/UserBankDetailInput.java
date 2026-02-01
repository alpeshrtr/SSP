import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class UserBankDetailInput {
    public BankDetails userDetails(Scanner scan) {
        System.out.print("Enter your OTR: ");
        String userOTR = scan.nextLine();
        Path filePath = Paths.get("Data", "OTR", userOTR + ".txt");
        if (Files.exists(filePath)) {
            System.out.println("ENTER YOU BANKING DETAILS");
            System.out.print("Enter you name: ");
            String name = scan.nextLine();
            System.out.print("Enter you bank account number: ");
            String bankAccount = scan.nextLine();
            System.out.print("Enter your IFSC Code: ");
            String ifsc = scan.nextLine();
            return new BankDetails(userOTR, name, bankAccount, ifsc);
        }
        return null; 
    }
}