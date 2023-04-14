public class Course extends TimeTable {
    String courseName;
    String[] faculty =new String[50];
    int no_of_lecture;
    void setCourse(String courseName, int no_of_lecture, int[] faculty) {
        this.courseName=courseName;
        this.no_of_lecture=no_of_lecture;
        for(int i=0;i<faculty.length;i++) {
            this.faculty[i]=faculties[faculty[i]].facultyName;
        }
    }

}
