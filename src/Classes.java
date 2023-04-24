import java.util.Arrays;

public class Classes extends TimeTable {
    String className;
    String[][] timetable =new String[5][6];
    Classes() {
        for (String[] strings : timetable) {
            Arrays.fill(strings,"    ");
        }
    }
    void setClassName(String className) {
        this.className = className;
    }
    void display() {
        System.out.println(className);
        for (String[] strings : timetable) {
            for (String string : strings) {
                System.out.print(string + "          ");
            }
            System.out.println();
        }
    }
}
