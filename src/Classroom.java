public class Classroom extends TimeTable{
    String classroom;
    String[][] class_timetable=new String[5][6];
    void setClassroom(String classroom) {
        this.classroom = classroom;
    }
    void display() {
        System.out.println(classroom);
        for (String[] strings : class_timetable) {
            for (String string : strings) {
                System.out.print(string + "          ");
            }
            System.out.println();
        }
    }
}
