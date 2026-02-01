import java.util.Random;

class OTR {
    
    private final String oneTimeRegistration;
    private final Student student;

    OTR(Student student) {
        this.student = student;
        this.oneTimeRegistration = OTRNumber();
    }

    private final String OTRNumber() {
        Random random = new Random();
        int randNum = random.nextInt(10000, 99999);
        String initials = (student.name().length() > 3) ? student.name().substring(0, 3).toUpperCase() : student.name().toUpperCase();
        StringBuilder string = new StringBuilder(initials);
        string.append(student.age());
        string.append(randNum);
        return string.toString();
    }

    public String otr() {
        return "OTR Number: "+this.oneTimeRegistration;
    }
}