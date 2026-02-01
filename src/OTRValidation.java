import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class OTRValidation {

    public Registration userOTR(Scanner scan) {
        System.out.print("Enter your OTR: ");
        String userOTR = scan.nextLine();
        Path filePath = Paths.get("Data", "OTR", userOTR + ".txt");
        if (Files.exists(filePath)) {
            return new Registration(userOTR);
        }
        return null;
    }
}