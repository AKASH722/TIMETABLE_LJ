import java.util.Arrays;

public class Classes{
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
        System.out.println("MONDAY |   TUESDAY  |  WEDNESDAY |  THURSDAY  |   FRIDAY   |  SATURDAY  |");
        for (String[] strings : timetable) {
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
