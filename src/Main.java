import java.util.Scanner;

public class Main {    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Home home = new Home();
        int choice = home.showMenu(scan);
        scan.nextLine();
        switch (choice) {
            case 1 -> {
                Input input = new Input();
                Student student = input.takeInput(scan);
                OTR otr = new OTR(student);
                SaveData save = new SaveData(student, otr);
                save.pushData();
                System.out.println("OTR Generated Successfully!");
                System.out.println(otr.otr());
            }
            case 2 -> {
                OTRValidation validate = new OTRValidation();
                Registration register = validate.userOTR(scan);
                SaveRegistration saveRegistration = new SaveRegistration(register);
                saveRegistration.finalPushData();
                System.out.println(register.getRegistration());
            }
            case 3 -> {
                UserBankDetailInput bankDetailInput = new UserBankDetailInput();
                BankDetails bankDetails = bankDetailInput.userDetails(scan);
                bankDetails.writebankDetails();
            }
        }
        scan.close();
    }
}