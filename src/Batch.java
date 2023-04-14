public class Batch extends TimeTable{
    String batchName;
    String[][] timetable=new String[5][6];
    String[] course=new String[50];
    int[] faculty;
    void createBatch(String batchName,int[] course,int[] faculty) {
        this.batchName = batchName;
        this.faculty=faculty;
        for (int i = 0; i < course.length; i++) {
            this.course[i] = courses[course[i]].courseName;
        }
    }
    void display() {
        System.out.println(batchName);
        for (String[] strings : timetable) {
            for (String string : strings) {
                System.out.print(string + "          ");
            }
            System.out.println();
        }
    }
}
