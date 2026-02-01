import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SaveData {

    private final Student student;
    private final OTR otr;
    Path filePath;

    SaveData(Student student, OTR otr) {
        this.student = student;
        this.otr = otr;
        this.filePath = Paths.get("Data", "OTR", otr.otr().substring(12) + ".txt");
    }

    public final void pushData() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(this.filePath.toString()))) {
            writer.write(student.studentDetails());
            writer.write(otr.otr());
        }
        catch (FileNotFoundException e) {
            
        }
        catch (IOException e) {
            
        }
        
    }
}