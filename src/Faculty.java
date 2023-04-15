public class Faculty extends TimeTable {
    String facultyName;
    String[][] faculty_timetable=new String[5][6];
    void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }
    void display() {
        System.out.println(facultyName);
        for (String[] strings : faculty_timetable) {
            for (String string : strings) {
                System.out.print(string + "          ");
            }
            System.out.println();
        }
    }
}