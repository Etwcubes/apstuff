import java.util.ArrayList;

public class Student {
    public static String name;
    public static int absenceCount;
    public static ArrayList<Student> studentList = new ArrayList<Student>();
    public Student(String name, int absenceCount) {
        this.name = name;
        this.absenceCount = absenceCount;
    }

    public String getName(){
        return name;
    }
    public int getAbsenceCount(){
        return absenceCount;
    }
}