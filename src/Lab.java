public class Lab extends TimeTable{
    String labName;
    String[][] lab_timetable=new String[5][6];
    void setLabName(String labName) {
        this.labName = labName;
    }
    void display() {
        System.out.println(labName);
        for (String[] strings : lab_timetable) {
            for (String string : strings) {
                System.out.print(string + "          ");
            }
            System.out.println();
        }
    }
}
