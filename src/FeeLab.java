public class FeeLab extends TimeTable{
    String FEE_labName;
    String[][] fee_lab_timetable =new String[5][6];
    void setFEE_labName(String FEE_labName) {
        this.FEE_labName = FEE_labName;
    }
    void display() {
        System.out.println(FEE_labName);
        for (String[] strings : fee_lab_timetable) {
            for (String string : strings) {
                System.out.print(string + "          ");
            }
            System.out.println();
        }
    }
}
