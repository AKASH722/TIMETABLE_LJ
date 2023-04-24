import java.util.Arrays;
import java.util.Random;
public class TimeTable {
    static Random random=new Random();
    static Course[] courses = new Course[5];
    static Faculty[] faculties = new Faculty[25];
    static Batch[] batches = new Batch[12];
    static Classes[] classes=new Classes[17];
    static void constraint() {
        for(int i=0;i<courses.length;i++) {
            courses[i]=new Course();
        }
        for(int i=0;i<faculties.length;i++) {
            faculties[i]=new Faculty();
        }
        for(int i=0;i<batches.length;i++) {
            batches[i]=new Batch();
        }
        for (int i = 0; i < classes.length; i++) {
            classes[i]=new Classes();
        }
        faculties[0].setFacultyName("DSJ");
        faculties[1].setFacultyName("DSM");
        faculties[2].setFacultyName("DSB");
        faculties[3].setFacultyName("DSV");
        faculties[4].setFacultyName("DSH");
        faculties[5].setFacultyName("JAP");
        faculties[6].setFacultyName("JAB");
        faculties[7].setFacultyName("JAD");
        faculties[8].setFacultyName("JAH");
        faculties[9].setFacultyName("DBN");
        faculties[10].setFacultyName("DBI");
        faculties[11].setFacultyName("DBK");
        faculties[12].setFacultyName("DBS");
        faculties[13].setFacultyName("DBA");
        faculties[14].setFacultyName("DBU");
        faculties[15].setFacultyName("MAH");
        faculties[16].setFacultyName("MAD");
        faculties[17].setFacultyName("MAP");
        faculties[18].setFacultyName("MAK");
        faculties[19].setFacultyName("MAV");
        faculties[20].setFacultyName("FEI");
        faculties[21].setFacultyName("FES");
        faculties[22].setFacultyName("FED");
        faculties[23].setFacultyName("FEV");
        faculties[24].setFacultyName("FEH");
        //computer labs
        classes[0].setClassName("519A ");
        classes[1].setClassName("519B ");
        classes[2].setClassName("519C ");
        classes[3].setClassName("519D ");
        classes[4].setClassName("519E ");
        classes[5].setClassName("519F ");
        classes[6].setClassName("527C ");
        classes[7].setClassName("527D ");
        classes[8].setClassName("306-2");
        //classRooms
        classes[9].setClassName("513  ");
        classes[10].setClassName("514  ");
        classes[11].setClassName("517  ");
        classes[12].setClassName("521  ");
        classes[13].setClassName("524  ");
        classes[14].setClassName("525  ");
        //fee labs
        classes[15].setClassName("526  ");
        classes[16].setClassName("606  ");
        courses[0].setCourse("DS  ",6, new int[]{0, 1, 2, 3, 4});
        courses[1].setCourse("JAVA",6, new int[]{5, 6, 7, 8});
        courses[2].setCourse("DBMS",5, new int[]{9, 10, 11, 12, 13, 14});
        courses[3].setCourse("MATH",6, new int[]{15, 16, 17, 18, 19});
        courses[4].setCourse("FEE ",5, new int[]{20, 21, 22, 23, 24});
        batches[0].createBatch("B1",new int[]{0, 1, 2, 3, 4},new int[]{0, 5, 9, 15, 20});
        batches[1].createBatch("B2",new int[]{0, 1, 2, 3, 4},new int[]{1, 6, 10, 16, 21});
        batches[2].createBatch("B3",new int[]{0, 1, 2, 3, 4},new int[]{0, 7, 11, 17, 22});
        batches[3].createBatch("B4",new int[]{0, 1, 2, 3, 4},new int[]{2, 8, 12, 18, 23});
        batches[4].createBatch("B5",new int[]{0, 1, 2, 3, 4},new int[]{3, 5, 14, 15, 24});
        batches[5].createBatch("B6",new int[]{0, 1, 2, 3, 4},new int[]{1, 6, 9, 16, 20});
        batches[6].createBatch("B7",new int[]{0, 1, 2, 3, 4},new int[]{2, 7, 11, 17, 22});
        batches[7].createBatch("B8",new int[]{0, 1, 2, 3, 4},new int[]{1, 6, 12, 18, 21});
        batches[8].createBatch("B9",new int[]{0, 1, 2, 3, 4},new int[]{0, 5, 10, 19, 24});
        batches[9].createBatch("B10",new int[]{0, 1, 2, 3, 4},new int[]{4, 8, 13, 18, 23});
        batches[10].createBatch("B11",new int[]{0, 1, 2, 3, 4},new int[]{3, 7, 14, 17, 24});
        batches[11].createBatch("B12",new int[]{0, 1, 2, 3, 4},new int[]{2, 8, 9, 15, 20});
        String javaB10= batches[9].course[0] + " [" + faculties[4].facultyName + "]"+ "{"+ classes[0].className+"}";
        batches[9].timetable[0][1]=javaB10;
        faculties[4].faculty_timetable[0][1]="B10";
        classes[0].timetable[0][1] = batches[9].batchName;
        batches[9].timetable[1][1]=javaB10;
        faculties[4].faculty_timetable[1][1]="B10";
        classes[0].timetable[1][1] = batches[9].batchName;
        batches[9].timetable[2][3]=javaB10;
        faculties[4].faculty_timetable[2][3]="B10";
        classes[0].timetable[2][3] = batches[9].batchName;
        batches[9].timetable[3][3]=javaB10;
        faculties[4].faculty_timetable[3][3]="B10";
        classes[0].timetable[3][3] = batches[9].batchName;
        batches[9].timetable[0][5]=javaB10;
        faculties[4].faculty_timetable[0][5]="B10";
        classes[0].timetable[0][5] = batches[9].batchName;
        batches[9].timetable[1][5]=javaB10;
        faculties[4].faculty_timetable[1][5]="B10";
        classes[0].timetable[1][5] = batches[9].batchName;
    }
    static void run() {
        constraint();
        count=0;
        count_2=0;
        Arrays.fill(skipDBMS,0);
        Arrays.fill(skipFEE,0);
        Arrays.fill(batchCounter,0);
        for (int batchID = 0; batchID < 12; batchID++) {
            assignLab(0,batchID,6);
            assignLab(1,batchID,6);
            assignLab(2,batchID,2);
            assignFeeLab(batchID);
            assignClass(batchID);//maths
            assignLabClass(batchID);//DBMS
            assignClassLab(batchID);//fee
            displayBatchTimeTable(batchID);
        }
        displayTimeTAble();
    }

    static int[] skipDBMS=new int[12];
    static int[] skipFEE=new int[12];
    public static void main(String[] args) {
        run();
    }
    static void assignLab(int courseID , int batchID , int no_of_lectures) {
        if (courseID == 0 && batchID == 9) {
            //skips this because it is already assigned
            return;
        }
        int facID = batches[batchID].faculty[courseID];
        int[] x = new int[12];
        int[] y = new int[12];
        Arrays.fill(x, 401);
        int[] pos = new int[12];
        int labId=0;
        int counter = 0;
        int[] yStored =new int[3];
        Arrays.fill(yStored,401);
        int yStoredCount=0;
        do {
            if(counter==no_of_lectures) {
                break;
            }
            int rem = (no_of_lectures - counter) / 2;
            for (int a = 0; a < 4; a+=2) {
                for (int b = 0; b < batches[batchID].timetable[a].length; b++) {
                    if(batches[batchID].timetable[a][b].equals("    ")) {
                        if(faculties[facID].faculty_timetable[a][b].equals("    ")) {
                            if(classes[labId].timetable[a][b].equals("    ")) {
                                for (int c = 0; c < x.length; c++) {
                                    if(x[c] == 401) {
                                        x[c] = a;
                                        y[c] = b;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            for (int i = 0; i < 12; i++) {
                if(x[i]!=401) {
                    pos[i]=x[i]*10+y[i];
                }
                if(x[i]==401) {
                    pos[i]=401;
                }
            }
            for (int d = 0; d < rem; d++) {
                int count=0;
                for(int p:pos) {
                    if(p==401) {
                        count++;
                    }
                }
                if(count==12) {
                    break;
                }
                int pos2;
                do {
                    pos2 = random.nextInt(11);
                } while (pos[pos2] == 401);
                int temp=pos[pos2];
                int b = temp%10;
                int a = temp/10;
                for(int o=0;o<12;o++) {
                    int temp_2=pos[o];
                    if(temp_2==pos[pos2]+20 || temp_2==pos[pos2]-20)  {
                        pos[o]=401;
                    }
                }
                pos[pos2]=401;
                if(b==yStored[0] || b==yStored[1] || b==yStored[2]) {
                    continue;
                }
                faculties[facID].faculty_timetable[a][b] = batches[batchID].batchName;
                classes[labId].timetable[a][b] = batches[batchID].batchName;
                batches[batchID].timetable[a][b] = batches[batchID].course[courseID] + " [" + faculties[facID].facultyName + "]"+ "{"+classes[labId].className+"}";
                faculties[facID].faculty_timetable[a+1][b] = batches[batchID].batchName;
                classes[labId].timetable[a+1][b] = batches[batchID].batchName;
                batches[batchID].timetable[a + 1][b] = batches[batchID].course[courseID] + " [" + faculties[facID].facultyName + "]" + "{"+classes[labId].className+"}";
                yStored[yStoredCount++]=b;
                if(courseID==2) {
                    skipDBMS[batchID]=b;
                }
            }
            for (int a = 0; a < batches[batchID].timetable.length; a++) {
                for (int b = 0; b < batches[batchID].timetable[a].length; b++) {
                    if (batches[batchID].timetable[a][b].equals("    ")) {
                        continue;
                    }
                    if (batches[batchID].timetable[a][b].equals(batches[batchID].course[courseID] + " [" + faculties[facID].facultyName + "]" + "{" + classes[labId].className + "}")) {
                        counter++;
                    }
                }
            }
            Arrays.fill(x, 401);
            labId++;
        } while(labId<9);
    }
    static void assignFeeLab(int batchID) {
        int facID = batches[batchID].faculty[4];
        int[] x = new int[12];
        int[] y = new int[12];
        Arrays.fill(x, 401);
        int[] pos = new int[12];
        int labId=15;
        int counter = 0;
        do {
            if(counter== 2) {
                break;
            }
            int rem = (2 - counter) / 2;
            for (int a = 0; a < 4; a+=2) {
                for (int b = 0; b < batches[batchID].timetable[a].length; b++) {
                    if(batches[batchID].timetable[a][b].equals("    ")) {
                        if(faculties[facID].faculty_timetable[a][b].equals("    ")) {
                            if(classes[labId].timetable[a][b].equals("    ")) {
                                for (int c = 0; c < x.length; c++) {
                                    if(x[c] == 401) {
                                        x[c] = a;
                                        y[c] = b;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            for (int i = 0; i < 12; i++) {
                if(x[i]!=401) {
                    pos[i]=x[i]*10+y[i];
                }
                if(x[i]==401) {
                    pos[i]=401;
                }
            }
            for (int d = 0; d < rem; d++) {
                int count=0;
                for(int p:pos) {
                    if(p==401) {
                        count++;
                    }
                }
                if(count==12) {
                    break;
                }
                int pos2;
                do {
                    pos2 = random.nextInt(11);
                } while (pos[pos2] == 401);
                int temp=pos[pos2];
                int b = temp%10;
                int a = temp/10;
                pos[pos2]=401;
                faculties[facID].faculty_timetable[a][b] = batches[batchID].batchName;
                classes[labId].timetable[a][b] = batches[batchID].batchName;
                batches[batchID].timetable[a][b] = batches[batchID].course[4] + " [" + faculties[facID].facultyName + "]"+ "{"+classes[labId].className+"}";
                faculties[facID].faculty_timetable[a+1][b] = batches[batchID].batchName;
                classes[labId].timetable[a+1][b] = batches[batchID].batchName;
                batches[batchID].timetable[a + 1][b] = batches[batchID].course[4] + " [" + faculties[facID].facultyName + "]" + "{"+classes[labId].className+"}";
                skipFEE[batchID]=b;
            }
            for (int a = 0; a < batches[batchID].timetable.length; a++) {
                for (int b = 0; b < batches[batchID].timetable[a].length; b++) {
                    if (batches[batchID].timetable[a][b] .equals("    ")) {
                        continue;
                    }
                    if (batches[batchID].timetable[a][b].equals(batches[batchID].course[4] + " [" + faculties[facID].facultyName + "]" + "{" + classes[labId].className + "}")) {
                        counter++;
                    }
                }
            }
            Arrays.fill(x, 401);
            labId++;
        } while(labId<17);
    }
    static void assignClass(int batchID) {
        int facID=batches[batchID].faculty[3];
        int[] yStored =new int[6];
        Arrays.fill(yStored,401);
        int yStoredCount=0;
        int[] x=new int[30];
        int[] y=new int[30];
        int[] pos =new int[30];
        Arrays.fill(x,401);
        int counter=0;
        int classID=9;
        do {
            if(counter== 6) {
                break;
            }
            int rem = (6 - counter);
            for (int a = 0; a < batches[batchID].timetable.length; a++) {
                for (int b = 0; b < batches[batchID].timetable[a].length; b++) {
                    if(batches[batchID].timetable[a][b].equals("    ")) {
                        if(faculties[facID].faculty_timetable[a][b].equals("    ")) {
                            if(classes[classID].timetable[a][b].equals("    ")) {
                                for (int c = 0; c < x.length; c++) {
                                    if(x[c] == 401) {
                                        x[c] = a;
                                        y[c] = b;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            for (int i = 0; i < pos.length; i++) {
                if(x[i]!=401) {
                    pos[i]=x[i]*10+y[i];
                }
                if(x[i]==401) {
                    pos[i]=401;
                }
            }
            for (int d = 0; d < rem; d++) {
                int count=0;
                for(int p:pos) {
                    if(p==401) {
                        count++;
                    }
                }
                if(count== pos.length) {
                    break;
                }
                int pos2;
                do {
                    pos2 = random.nextInt(pos.length-1);
                } while (pos[pos2] == 401);
                int temp=pos[pos2];
                int b = temp%10;
                int a = temp/10;
                pos[pos2]=401;
                if((b==yStored[0] && b==yStored[1]) || (b==yStored[0] && b==yStored[2])|| (b==yStored[0] && b==yStored[3]) || (b==yStored[0] && b==yStored[4]) || (b==yStored[0] && b==yStored[5])||(b==yStored[1] && b==yStored[2]) ||(b==yStored[1] && b==yStored[3]) ||(b==yStored[1] && b==yStored[4])||(b==yStored[1] && b==yStored[5])||(b==yStored[2] && b==yStored[3]) ||(b==yStored[2] && b==yStored[4]) ||(b==yStored[2] && b==yStored[5]) ||(b==yStored[3] && b==yStored[4])||(b==yStored[3] && b==yStored[5]) || (b==yStored[4] && b==yStored[5])) {
                    continue;
                }
                faculties[facID].faculty_timetable[a][b] = batches[batchID].batchName;
                classes[classID].timetable[a][b] = batches[batchID].batchName;
                batches[batchID].timetable[a][b] = batches[batchID].course[3] + " [" + faculties[facID].facultyName + "]"+ "{"+classes[classID].className+"}";
                yStored[yStoredCount++]=b;
            }
            for (int a = 0; a < batches[batchID].timetable.length; a++) {
                for (int b = 0; b < batches[batchID].timetable[a].length; b++) {
                    if (batches[batchID].timetable[a][b] .equals("    ")) {
                        continue;
                    }
                    if (batches[batchID].timetable[a][b].equals(batches[batchID].course[3] + " [" + faculties[facID].facultyName + "]" + "{"+classes[classID].className+"}")) {
                        counter++;
                    }
                }
            }
            classID++;
            Arrays.fill(x,401);
        } while(classID<15);
    }
    static void assignLabClass(int batchID) {
        int facID=batches[batchID].faculty[2];
        int[] yStored =new int[4];
        yStored[0]=skipDBMS[batchID];
        Arrays.fill(yStored,401);
        int yStoredCount=1;
        int[] x=new int[30];
        int[] y=new int[30];
        int[] pos =new int[30];
        Arrays.fill(x,401);
        int counter=0;
        int classID=0;
        do {
            if(counter== 3) {
                break;
            }
            int rem = (3 - counter);
            for (int a = 0; a < batches[batchID].timetable.length; a++) {
                for (int b = 0; b < batches[batchID].timetable[a].length; b++) {
                    if(batches[batchID].timetable[a][b].equals("    ")) {
                        if(faculties[facID].faculty_timetable[a][b].equals("    ")) {
                            if(classes[classID].timetable[a][b].equals("    ")) {
                                for (int c = 0; c < x.length; c++) {
                                    if(x[c] == 401) {
                                        x[c] = a;
                                        y[c] = b;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            for (int i = 0; i < pos.length; i++) {
                if(x[i]!=401) {
                    pos[i]=x[i]*10+y[i];
                }
                if(x[i]==401) {
                    pos[i]=401;
                }
            }
            for (int d = 0; d < rem; d++) {
                int count=0;
                for(int p:pos) {
                    if(p==401) {
                        count++;
                    }
                }
                if(count== pos.length) {
                    break;
                }
                int pos2;
                do {
                    pos2 = random.nextInt(pos.length-1);
                } while (pos[pos2] == 401);
                int temp=pos[pos2];
                int b = temp%10;
                int a = temp/10;
                pos[pos2]=401;
                if(b==yStored[0] ||(b==yStored[1] && b==yStored[2]) ||(b==yStored[1] && b==yStored[3]) ||(b==yStored[2] && b==yStored[3])) {
                    continue;
                }
                faculties[facID].faculty_timetable[a][b] = batches[batchID].batchName;
                classes[classID].timetable[a][b] = batches[batchID].batchName;
                batches[batchID].timetable[a][b] = batches[batchID].course[2] + " [" + faculties[facID].facultyName + "]"+ "{"+classes[classID].className+"}";
                yStored[yStoredCount++]=b;
            }
            for (int a = 0; a < batches[batchID].timetable.length; a++) {
                for (int b = 0; b < batches[batchID].timetable[a].length; b++) {
                    if (batches[batchID].timetable[a][b] .equals("    ")) {
                        continue;
                    }
                    if (batches[batchID].timetable[a][b].equals(batches[batchID].course[2] + " [" + faculties[facID].facultyName + "]" + "{"+classes[classID].className+"}")) {
                        counter++;
                    }
                }
            }
            classID++;
            Arrays.fill(x,401);
        } while(classID<15);
    }
    static void assignClassLab(int batchID) {
        int facID=batches[batchID].faculty[4];
        int[] yStored =new int[4];
        yStored[0]=skipFEE[batchID];
        Arrays.fill(yStored,401);
        int yStoredCount=1;
        int[] x=new int[30];
        int[] y=new int[30];
        int[] pos =new int[30];
        Arrays.fill(x,401);
        int counter=0;
        int classID=9;
        do {
            if(counter== 3) {
                break;
            }
            int rem = (3 - counter);
            for (int a = 0; a < batches[batchID].timetable.length; a++) {
                for (int b = 0; b < batches[batchID].timetable[a].length; b++) {
                    if(batches[batchID].timetable[a][b].equals("    ")) {
                        if(faculties[facID].faculty_timetable[a][b].equals("    ")) {
                            if(classes[classID].timetable[a][b].equals("    ")) {
                                for (int c = 0; c < x.length; c++) {
                                    if(x[c] == 401) {
                                        x[c] = a;
                                        y[c] = b;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            for (int i = 0; i < pos.length; i++) {
                if(x[i]!=401) {
                    pos[i]=x[i]*10+y[i];
                }
                if(x[i]==401) {
                    pos[i]=401;
                }
            }
            for (int d = 0; d < rem; d++) {
                int count=0;
                for(int p:pos) {
                    if(p==401) {
                        count++;
                    }
                }
                if(count== pos.length) {
                    break;
                }
                int pos2;
                do {
                    pos2 = random.nextInt(pos.length-1);
                } while (pos[pos2] == 401);
                int temp=pos[pos2];
                int b = temp%10;
                int a = temp/10;
                pos[pos2]=401;
                if(b==yStored[0] ||(b==yStored[1] && b==yStored[2]) ||(b==yStored[1] && b==yStored[3]) ||(b==yStored[2] && b==yStored[3])) {
                    continue;
                }
                faculties[facID].faculty_timetable[a][b] = batches[batchID].batchName;
                classes[classID].timetable[a][b] = batches[batchID].batchName;
                batches[batchID].timetable[a][b] = batches[batchID].course[4] + " [" + faculties[facID].facultyName + "]"+ "{"+classes[classID].className+"}";
                yStored[yStoredCount++]=b;
            }
            for (int a = 0; a < batches[batchID].timetable.length; a++) {
                for (int b = 0; b < batches[batchID].timetable[a].length; b++) {
                    if (batches[batchID].timetable[a][b] .equals("    ")) {
                        continue;
                    }
                    if (batches[batchID].timetable[a][b].equals(batches[batchID].course[4] + " [" + faculties[facID].facultyName + "]" + "{"+classes[classID].className+"}")) {
                        counter++;
                    }
                }
            }
            classID++;
            Arrays.fill(x,401);
        } while(classID<17);
    }
    static int count=0;
    static int count_2=0;
    static void displayBatchTimeTable(int batchId) {
        int counter=0;
        for (int i = 0; i < batches[batchId].timetable.length; i++) {
            for(int j=0; j< batches[batchId].timetable[i].length;j++) {
                if(batches[batchId].timetable[i][j].equals("    ")) {
                    batches[batchId].timetable[i][j]="     -------     ";
                    counter++;
                }
            }
        }
        batches[batchId].display();
        if(counter==2) {
            count++;
            System.out.println("All fine");
        } else {
            System.out.println("Not Fine "+(counter-2));
            count_2+=counter-2;
        }
        System.out.println();
    }
    static int[] batchCounter=new int[12];
    static void displayTimeTAble () {
        int[] sub_count=new int[5];
        Arrays.fill(sub_count,0);
        int sc;
        System.out.println("faculties\n");
        for (int facId = 0; facId < faculties.length; facId++) {
            if(facId<5) {
                sc=0;
            } else if(facId<9) {
                sc=1;
            } else if(facId<15) {
                sc=2;
            } else if(facId<20) {
                sc=3;
            } else {
                sc=4;
            }
            int count=0;
            if(faculties[facId].facultyName .equals("    ")) {
                continue;
            }
            for (int i = 0; i < faculties[facId].faculty_timetable.length; i++) {
                for(int j=0; j<faculties[facId].faculty_timetable[i].length;j++) {
                    if(faculties[facId].faculty_timetable[i][j].equals("    ")) {
                        faculties[facId].faculty_timetable[i][j]="--";
                        count++;
                    }
                }
            }
            faculties[facId].display();
            System.out.println(30-count);
            sub_count[sc]+=30-count;
            System.out.println();
        }
        System.out.println("class and labs \n");
        for (Classes c : classes) {
            for (int i = 0; i < c.timetable.length; i++) {
                for (int j = 0; j < c.timetable[i].length; j++) {
                    if(c.timetable[i][j].equals("    ")) {
                        c.timetable[i][j]="--";
                    } else {
                        String s=c.timetable[i][j];
                        for (int k = 0; k < 12; k++) {
                            String batch="B"+(k+1);
                            if(batch.equals(s)) {
                                batchCounter[k]++;
                            }
                        }
                    }
                }
            }
            c.display();
            System.out.println();
        }
        System.out.println("No of correct Batches  : "+count);
        System.out.println("No of Missing lectures : "+count_2);
        System.out.println();
        System.out.println("Total no of assigned lectures");
        System.out.println("DS   : "+sub_count[0]);
        System.out.println("JAVA : "+sub_count[1]);
        System.out.println("DBMS : "+sub_count[2]);
        System.out.println("MATH : "+sub_count[3]);
        System.out.println("FEE  : "+sub_count[4]);
        System.out.println();
        double count2=0.0;
        for (int x:sub_count) {
            count2+=x;
        }
        count2*=100;
        System.out.println();
        int sum12=0,sum13=0;
        for(int x:sub_count) {
            sum13+=x;
        }
        for(int x:batchCounter) {
            System.out.println(x);
            sum12+=x;
        }
        System.out.println();
        System.out.println(336-sum12);
        System.out.println("Accuracy Of the TimeTable : "+((count2)/336.0)+"%");
        System.out.println("Accuracy Of the TimeTable : "+((count*100)/12.0)+"%");
        if((336-sum12) == count_2 && count_2 == (336-sum13)) {
            System.out.println("No overwriting");
        } else {
            System.out.println("overwritten");
        }
        boolean access=sub_count[0] == 72 && sub_count[1] == 72 && sub_count[2] == 60 && sub_count[3] == 72 && sub_count[4] == 60 && (336-sum12) == count_2 && count_2 == (336-sum13);
        if (!access) {
            run();
        }
    }
}