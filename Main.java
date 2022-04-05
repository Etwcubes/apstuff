public class Main {
    public static void main(String[] args) {

        Student ericW = new Student("ericW", 3);
        Student ericL = new Student("ericL", 1);
        Student ericZ = new Student("ericZ", 2);
        Student ericX = new Student("ericX", 6);
        Student ericC = new Student("ericC", 4);
        Student ericT = new Student("ericT", 0);

        Student.studentList.add(ericW);
        Student.studentList.add(ericL);
        Student.studentList.add(ericZ);
        Student.studentList.add(ericX);
        Student.studentList.add(ericC);
        Student.studentList.add(ericT);



        System.out.print(ericW.getAbsenceCount());
    }
}
