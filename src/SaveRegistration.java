import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SaveRegistration {
    private final Registration register;
    Path filePath;

    SaveRegistration(Registration register) {
        this.register = register;
        this.filePath = Paths.get("Data", "Registrations", register.getRegistration().substring(20) + ".txt");
    }
    
    String getDate() {
        LocalDate date = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = date.format(format);
        return formattedDate;
    }

    public final void finalPushData() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(this.filePath.toString()))) {
            writer.write("Registration done on: "+getDate()+"\n");
            writer.write(register.getRegistration());
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
        }
    }
}