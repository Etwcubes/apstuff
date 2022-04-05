import java.util.List;
import java.util.ArrayList;
public class SeatingChart {
    private Student[][] seats;

    public SeatingChart(List<Student> studentList, int rows, int cols){
        seats = new Student[rows][cols];
        int index = 0;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = studentList.get(index);
                index++;
            }
        }
    }
    public int removeAbsentStudent(int givenAbs){
        int count = 0;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                int abs = seats[i][j].getAbsenceCount();
                if (abs > givenAbs) {
                    seats[i][j] = null;
                    count++;
                }
            }
        } return count;
    }
}