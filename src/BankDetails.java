import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BankDetails {

    private final String otr;
    private final String bankAccount;
    private final String accountHolder;
    private final String IFSC_Code;
    Path filePath;


    BankDetails(String otr, String accountHolder, String bankAccount, String ifsc_Code) {
        this.otr = otr;
        this.accountHolder = accountHolder;
        this.bankAccount = bankAccount;
        this.IFSC_Code = ifsc_Code;
        this.filePath = Paths.get("Data", "BankDetails", this.bankAccount + ".txt");
    }
    
    private String getBankDetails() {

        return String.format(
                "========== BANK DETAILS ==========%n" +
                "OTR            : %s%n" +
                "Account Holder : %s%n" +
                "Account Number : %s%n" +
                "IFSC Code      : %s%n" +
                "==================================%n",
                otr,
                accountHolder,
                bankAccount,
                IFSC_Code
        );
    }
    


    void writebankDetails(){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(this.filePath.toString()))) {
            writer.write(getBankDetails());
            writer.write("OTR: Linked");
            System.out.println("Bank details updated successfully!");
        }
        catch (FileNotFoundException e) {

        }
        catch (IOException e) {
            
        }
    }
}