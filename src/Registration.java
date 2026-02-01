import java.time.LocalDate;
import java.util.Random;

public class Registration {
    private final String otr;
    private final String registrationNumber;

    Registration(String otr) {
        this.otr = otr;
        this.registrationNumber = registrationGenerator();
    }

    private final String registrationGenerator() {
        int date = LocalDate.now().getYear();
        Random random = new Random();
        int randInt = random.nextInt(10000,100000);
        String getOTR = this.otr.substring(6);
        StringBuilder string = new StringBuilder(String.valueOf(date));
        string.append(randInt);
        string.append(getOTR);
        return string.toString();
    }
    public String getRegistration() {
        return "Registration Number: " + registrationNumber;
    }
}