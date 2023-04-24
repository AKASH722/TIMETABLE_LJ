import java.util.Arrays;

public class Faculty {
    String facultyName;
    String[][] faculty_timetable=new String[5][6];
    Faculty(){
        for (String[] strings : faculty_timetable) {
            Arrays.fill(strings,"    ");
        }
    }
    void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }
    void display() {
        System.out.println(facultyName);
        System.out.println("MONDAY |   TUESDAY  |  WEDNESDAY |  THURSDAY  |   FRIDAY   |  SATURDAY  |");
        for (String[] strings : faculty_timetable) {
            for (String string : strings) {
                if(string.equals("B10") || string.equals("B11") || string.equals("B12")) {
                    System.out.print(string + "    |     ");
                } else {
                    System.out.print(string + "     |     ");
                }
            }
            System.out.println();
        }
    }
}
