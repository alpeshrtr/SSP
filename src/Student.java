public class Student {
    private final String name;
    private final String nameOfFather;
    private final int age;
    private final String course;
    private final int courseDuration;

    Student(String name, String nameOfFather, int age, String course, int courseDuration) {
        this.name = name;
        this.nameOfFather = nameOfFather;
        this.age = age;
        this.course = course;
        this.courseDuration = courseDuration;
    }

    public String studentDetails() {
        return "Name: " + this.name + "\nFather's Name: " + this.nameOfFather + "\nAge: " + this.age + "\nCourse: "
                + this.course + "\nCourse Duration (in years): " + this.courseDuration + "\n";
    }

    public String name() {
        return this.name;
    }

    public int age() {
        return this.age;
    }
    
    public String father() {
        return this.nameOfFather;
    }

    public String course() {
        return this.course;
    }

    public int duration() {
        return this.courseDuration;
    }
}