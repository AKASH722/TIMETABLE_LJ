import java.util.Arrays;
import java.util.Random;
public class TimeTable {
    static Random random=new Random();
    static Course[] courses = new Course[5];
    static Faculty[] faculties = new Faculty[25];
    static Batch[] batches = new Batch[12];
    static Lab[] lab= new Lab[9];
    static FeeLab[] feeLabs=new FeeLab[2];
    static Classroom[] classrooms=new Classroom[7];
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
        for(int i=0;i<lab.length;i++) {
            lab[i]=new Lab();
        }
        for(int i=0;i<feeLabs.length;i++) {
            feeLabs[i]=new FeeLab();
        }
        for (int i = 0; i < classrooms.length; i++) {
            classrooms[i]=new Classroom();
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
        lab[0].setLabName("519A ");
        lab[1].setLabName("519B ");
        lab[2].setLabName("519C ");
        lab[3].setLabName("519D ");
        lab[4].setLabName("519E ");
        lab[5].setLabName("519F ");
        lab[6].setLabName("527C ");
        lab[7].setLabName("527D ");
        lab[8].setLabName("306-2");
        feeLabs[0].setFEE_labName("526  ");
        feeLabs[1].setFEE_labName("606  ");
        classrooms[0].setClassroom("513  ");
        classrooms[1].setClassroom("514  ");
        classrooms[2].setClassroom("517  ");
        classrooms[3].setClassroom("521  ");
        classrooms[4].setClassroom("524  ");
        classrooms[5].setClassroom("525  ");
        classrooms[6].setClassroom("extra");
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
        String javaB10= batches[9].course[0] + " [" + faculties[4].facultyName + "]"+ "{"+lab[3].labName+"}";
        batches[9].timetable[0][1]=javaB10;
        faculties[4].faculty_timetable[0][1]="B10";
        lab[3].lab_timetable[0][1] = batches[9].batchName;
        batches[9].timetable[1][1]=javaB10;
        faculties[4].faculty_timetable[1][1]="B10";
        lab[3].lab_timetable[1][1] = batches[9].batchName;
        batches[9].timetable[2][3]=javaB10;
        faculties[4].faculty_timetable[2][3]="B10";
        lab[3].lab_timetable[2][3] = batches[9].batchName;
        batches[9].timetable[3][3]=javaB10;
        faculties[4].faculty_timetable[3][3]="B10";
        lab[3].lab_timetable[3][3] = batches[9].batchName;
        batches[9].timetable[0][5]=javaB10;
        faculties[4].faculty_timetable[0][5]="B10";
        lab[3].lab_timetable[0][5] = batches[9].batchName;
        batches[9].timetable[1][5]=javaB10;
        faculties[4].faculty_timetable[1][5]="B10";
        lab[3].lab_timetable[1][5] = batches[9].batchName;
    }
    static int[][] yStored =new int[12][4];
    static int[] skip=new int[12];
    public static void main(String[] args) {
        constraint();
        for (int[] ints : yStored) {
            Arrays.fill(ints, 401);
        }
        Arrays.fill(skip, 401);
        for(int batchID=0 ;batchID<batches.length;batchID++) {
            generateDS_JAVA(0,batchID);
            generateDS_JAVA(1,batchID);
        }
        generateDBMSLab();
        generateFEELab();
        for(int batchID=0 ;batchID<batches.length;batchID++) {
            generateMaths(batchID);
            generateFEE(batchID,3);
            generateDBMS(batchID,3);
//            int[] skip=new int[3];
//            Arrays.fill(skip,401);
//            for(int i=0;i<3;i++) {
//                int choice;
//                boolean all;
//                do {
//                    choice = random.nextInt(3);
//                    all= (choice == skip[0] || choice == skip[1] || choice == skip[2]);
//                } while(all);
//                switch (choice) {
//                    case 0 -> generateFEE(batchID);
//                    case 1 -> generateDBMS(batchID);
//                    case 2 -> generateMaths(batchID);
//                }
//                skip[i]=choice;
//            }
            displayBatchTimeTable(batchID);
        }
        displayTimeTAble();
    }
    static  void generateDS_JAVA(int courseID , int batchID) {
                if (courseID == 0 && batchID == 9) {
                    return;
                }
                int facID = batches[batchID].faculty[courseID];
                int[] x = new int[12];
                int[] y = new int[12];
                Arrays.fill(x, 401);
                int[] pos = new int[12];
                int no_of_lectures = 6;
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
                    if(batches[batchID].timetable[a][b]==null) {
                        if(faculties[facID].faculty_timetable[a][b]==null) {
                            if(lab[labId].lab_timetable[a][b]==null) {
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
                lab[labId].lab_timetable[a][b] = batches[batchID].batchName;
                batches[batchID].timetable[a][b] = batches[batchID].course[courseID] + " [" + faculties[facID].facultyName + "]"+ "{"+lab[labId].labName+"}";
                faculties[facID].faculty_timetable[a+1][b] = batches[batchID].batchName;
                lab[labId].lab_timetable[a+1][b] = batches[batchID].batchName;
                batches[batchID].timetable[a + 1][b] = batches[batchID].course[courseID] + " [" + faculties[facID].facultyName + "]" + "{"+lab[labId].labName+"}";
                yStored[yStoredCount++]=b;
            }
            for (int a = 0; a < batches[batchID].timetable.length; a++) {
                for (int b = 0; b < batches[batchID].timetable[a].length; b++) {
                    if (batches[batchID].timetable[a][b] == null) {
                        continue;
                    }
                    if (batches[batchID].timetable[a][b].equals(batches[batchID].course[courseID] + " [" + faculties[facID].facultyName + "]" + "{" + lab[labId].labName + "}")) {
                        counter++;
                    }
                }
            }
            Arrays.fill(x, 401);
            labId++;
        } while(labId<lab.length);
    }
    static void generateFEELab() {
        for (int batchID = 0; batchID < batches.length; batchID++) {
            int facID=batches[batchID].faculty[4];
            int no_of_lectures=2;
            int[] x_class=new int[30];
            int[] y_class=new int[30];
            int[] pos_class =new int[30];
            Arrays.fill(x_class,401);
            int counter_LAb=0;
            int labID=0;
            do {
                if(counter_LAb==no_of_lectures) {
                    break;
                }
                int rem = (no_of_lectures - counter_LAb)/2;
                for (int a = 0; a < 4; a+=2) {
                    for (int b = 0; b < batches[batchID].timetable[a].length; b++) {
                        if(batches[batchID].timetable[a][b]==null) {
                            if(faculties[facID].faculty_timetable[a][b]==null) {
                                if(feeLabs[labID].fee_lab_timetable[a][b]==null) {
                                    for (int c = 0; c < x_class.length; c++) {
                                        if(x_class[c] == 401) {
                                            x_class[c] = a;
                                            y_class[c] = b;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                for (int i = 0; i < pos_class.length; i++) {
                    if(x_class[i]!=401) {
                        pos_class[i]=x_class[i]*10+y_class[i];
                    }
                    if(x_class[i]==401) {
                        pos_class[i]=401;
                    }
                }
                for (int d = 0; d < rem; d++) {
                    int count=0;
                    for(int p:pos_class) {
                        if(p==401) {
                            count++;
                        }
                    }
                    if(count== pos_class.length) {
                        break;
                    }
                    int pos2;
                    do {
                        pos2 = random.nextInt(pos_class.length-1);
                    } while (pos_class[pos2] == 401);
                    int temp=pos_class[pos2];
                    int b = temp%10;
                    int a = temp/10;
                    pos_class[pos2]=401;
                    faculties[facID].faculty_timetable[a][b] = batches[batchID].batchName;
                    feeLabs[labID].fee_lab_timetable[a][b] = batches[batchID].batchName;
                    batches[batchID].timetable[a][b] = batches[batchID].course[4] + " [" + faculties[facID].facultyName + "]" + "{" + feeLabs[labID].FEE_labName + "}";
                    faculties[facID].faculty_timetable[a+1][b] = batches[batchID].batchName;
                    feeLabs[labID].fee_lab_timetable[a+1][b] = batches[batchID].batchName;
                    batches[batchID].timetable[a+1][b] = batches[batchID].course[4] + " [" + faculties[facID].facultyName + "]" + "{" + feeLabs[labID].FEE_labName + "}";
                    skip[batchID]=b;
                }
                for (int a = 0; a < batches[batchID].timetable.length; a++) {
                    for (int b = 0; b < batches[batchID].timetable[a].length; b++) {
                        if (batches[batchID].timetable[a][b] == null) {
                            continue;
                        }
                        if (batches[batchID].timetable[a][b].equals(batches[batchID].course[4] + " [" + faculties[facID].facultyName + "]" + "{" + feeLabs[labID].FEE_labName + "}")) {
                            counter_LAb++;
                        }
                    }
                }
                labID++;
                Arrays.fill(x_class,401);
            } while(labID <feeLabs.length);
        }
    }
    static void generateFEE(int batchID, int no_of_lectures) {
        int[] x_class=new int[30];
        int[] y_class=new int[30];
        int[] pos_class =new int[30];
        int[] yStored =new int[3];
        int counter=0;
        int yStoredCount=0;
        Arrays.fill(yStored,401);
        Arrays.fill(x_class,401);
        int classID=0;
        int facID=batches[batchID].faculty[4];
        do {
            if(counter==no_of_lectures) {
                break;
            }
            int rem = (no_of_lectures - counter);
            for (int a = 0; a < batches[batchID].timetable.length; a++) {
                for (int b = 0; b < batches[batchID].timetable[a].length; b++) {
                    if(batches[batchID].timetable[a][b]==null) {
                        if(faculties[facID].faculty_timetable[a][b]==null) {
                            if(classrooms[classID].class_timetable[a][b]==null) {
                                for (int c = 0; c < x_class.length; c++) {
                                    if(x_class[c] == 401) {
                                        x_class[c] = a;
                                        y_class[c] = b;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            for (int i = 0; i < pos_class.length; i++) {
                if(x_class[i]!=401) {
                    pos_class[i]=x_class[i]*10+y_class[i];
                }
                if(x_class[i]==401) {
                    pos_class[i]=401;
                }
            }
            for (int d = 0; d < rem; d++) {
                int count=0;
                for(int p:pos_class) {
                    if(p==401) {
                        count++;
                    }
                }
                if(count== pos_class.length) {
                    break;
                }
                int pos2;
                do {
                    pos2 = random.nextInt(pos_class.length-1);
                } while (pos_class[pos2] == 401);
                int temp=pos_class[pos2];
                int b = temp%10;
                int a = temp/10;
                pos_class[pos2]=401;
                if(b==skip[batchID] || (b==yStored[0] && b==yStored[1]) || (b==yStored[0] && b==yStored[2])||(b==yStored[1] && b==yStored[2])) {
                    continue;
                }
                faculties[facID].faculty_timetable[a][b] = batches[batchID].batchName;
                classrooms[classID].class_timetable[a][b] = batches[batchID].batchName;
                batches[batchID].timetable[a][b] = batches[batchID].course[4] + " [" + faculties[facID].facultyName + "]"+ "{"+classrooms[classID].classroom+"}";
                yStored[yStoredCount++]=b;
            }
            for (int a = 0; a < batches[batchID].timetable.length; a++) {
                for (int b = 0; b < batches[batchID].timetable[a].length; b++) {
                    if (batches[batchID].timetable[a][b] == null) {
                        continue;
                    }
                    if (batches[batchID].timetable[a][b].equals(batches[batchID].course[4] + " [" + faculties[facID].facultyName + "]" + "{"+classrooms[classID].classroom+"}")) {
                        counter++;
                    }
                }
            }
            classID++;
            Arrays.fill(x_class,401);
        } while(classID<classrooms.length);
        {
            facID=batches[batchID].faculty[4];
            int[] x=new int[30];
            int[] y=new int[30];
            int[] pos =new int[30];
            Arrays.fill(x,401);
            int labID=0;
            do {
                if(counter==no_of_lectures) {
                    break;
                }
                int rem = (no_of_lectures - counter);
                for (int a = 0; a < 5; a++) {
                    for (int b = 0; b < batches[batchID].timetable[a].length; b++) {
                        if(batches[batchID].timetable[a][b]==null) {
                            if(faculties[facID].faculty_timetable[a][b]==null) {
                                if(feeLabs[labID].fee_lab_timetable[a][b]==null) {
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
                    if(b==skip[batchID] || (b==yStored[0] && b==yStored[1]) || (b==yStored[0] && b==yStored[2])||(b==yStored[1] && b==yStored[2])) {
                        continue;
                    }
                    faculties[facID].faculty_timetable[a][b] = batches[batchID].batchName;
                    feeLabs[labID].fee_lab_timetable[a][b] = batches[batchID].batchName;
                    batches[batchID].timetable[a][b] = batches[batchID].course[4] + " [" + faculties[facID].facultyName + "]" + "{" + feeLabs[labID].FEE_labName + "}";
                    yStored[yStoredCount++]=b;
                }
                for (int a = 0; a < batches[batchID].timetable.length; a++) {
                    for (int b = 0; b < batches[batchID].timetable[a].length; b++) {
                        if (batches[batchID].timetable[a][b] == null) {
                            continue;
                        }
                        if (batches[batchID].timetable[a][b].equals(batches[batchID].course[4] + " [" + faculties[facID].facultyName + "]" + "{" + feeLabs[labID].FEE_labName + "}")) {
                            counter++;
                        }
                    }
                }
                labID++;
                Arrays.fill(x,401);
            } while(labID <feeLabs.length);
        }
    }
    static void generateMaths(int batchID) {
        int facID=batches[batchID].faculty[3];
        int no_of_lectures=6;
        int[] yStored =new int[6];
        Arrays.fill(yStored,401);
        int yStoredCount=0;
        int[] x_class=new int[30];
        int[] y_class=new int[30];
        int[] pos_class =new int[30];
        Arrays.fill(x_class,401);
        int counter_class=0;
        int classID=0;
        do {
            if(counter_class==no_of_lectures) {
                break;
            }
            int rem = (no_of_lectures - counter_class);
            for (int a = 0; a < batches[batchID].timetable.length; a++) {
                for (int b = 0; b < batches[batchID].timetable[a].length; b++) {
                    if(batches[batchID].timetable[a][b]==null) {
                        if(faculties[facID].faculty_timetable[a][b]==null) {
                            if(classrooms[classID].class_timetable[a][b]==null) {
                                for (int c = 0; c < x_class.length; c++) {
                                    if(x_class[c] == 401) {
                                        x_class[c] = a;
                                        y_class[c] = b;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            for (int i = 0; i < pos_class.length; i++) {
                if(x_class[i]!=401) {
                    pos_class[i]=x_class[i]*10+y_class[i];
                }
                if(x_class[i]==401) {
                    pos_class[i]=401;
                }
            }
            for (int d = 0; d < rem; d++) {
                int count=0;
                for(int p:pos_class) {
                    if(p==401) {
                        count++;
                    }
                }
                if(count== pos_class.length) {
                    break;
                }
                int pos2;
                do {
                    pos2 = random.nextInt(pos_class.length-1);
                } while (pos_class[pos2] == 401);
                int temp=pos_class[pos2];
                int b = temp%10;
                int a = temp/10;
                pos_class[pos2]=401;
                if((b==yStored[0] && b==yStored[1]) || (b==yStored[0] && b==yStored[2])|| (b==yStored[0] && b==yStored[3]) || (b==yStored[0] && b==yStored[4]) || (b==yStored[0] && b==yStored[5])||(b==yStored[1] && b==yStored[2]) ||(b==yStored[1] && b==yStored[3]) ||(b==yStored[1] && b==yStored[4])||(b==yStored[1] && b==yStored[5])||(b==yStored[2] && b==yStored[3]) ||(b==yStored[2] && b==yStored[4]) ||(b==yStored[2] && b==yStored[5]) ||(b==yStored[3] && b==yStored[4])||(b==yStored[3] && b==yStored[5]) || (b==yStored[4] && b==yStored[5])) {
                    continue;
                }
                faculties[facID].faculty_timetable[a][b] = batches[batchID].batchName;
                classrooms[classID].class_timetable[a][b] = batches[batchID].batchName;
                batches[batchID].timetable[a][b] = batches[batchID].course[3] + " [" + faculties[facID].facultyName + "]"+ "{"+classrooms[classID].classroom+"}";
                yStored[yStoredCount++]=b;
            }
            for (int a = 0; a < batches[batchID].timetable.length; a++) {
                for (int b = 0; b < batches[batchID].timetable[a].length; b++) {
                    if (batches[batchID].timetable[a][b] == null) {
                        continue;
                    }
                    if (batches[batchID].timetable[a][b].equals(batches[batchID].course[3] + " [" + faculties[facID].facultyName + "]" + "{"+classrooms[classID].classroom+"}")) {
                        counter_class++;
                    }
                }
            }
            classID++;
            Arrays.fill(x_class,401);
        } while(classID<classrooms.length);
    }
    static void generateDBMSLab() {
        for (int batchID = 0; batchID < batches.length; batchID++) {
            int facID = batches[batchID].faculty[2];
            int[] x = new int[12];
            int[] y = new int[12];
            int[] pos = new int[12];
            Arrays.fill(x, 401);
            int no_of_lectures = 2;
            int labId = 0;
            int counter = 0;
            do {
                if (counter == no_of_lectures) {
                    break;
                }
                int rem = (no_of_lectures - counter) / 2;
                for (int a = 0; a < 4; a += 2) {
                    for (int b = 0; b < batches[batchID].timetable[a].length; b++) {
                        if (batches[batchID].timetable[a][b] == null) {
                            if (faculties[facID].faculty_timetable[a][b] == null) {
                                if (lab[labId].lab_timetable[a][b] == null) {
                                    for (int c = 0; c < x.length; c++) {
                                        if (x[c] == 401) {
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
                    if (x[i] != 401) {
                        pos[i] = x[i] * 10 + y[i];
                    }
                    if (x[i] == 401) {
                        pos[i] = 401;
                    }
                }
                for (int d = 0; d < rem; d++) {
                    int count = 0;
                    for (int p : pos) {
                        if (p == 401) {
                            count++;
                        }
                    }
                    if (count == 12) {
                        break;
                    }
                    int pos2;
                    do {
                        pos2 = random.nextInt(11);
                    } while (pos[pos2] == 401);
                    int temp = pos[pos2];
                    int b = temp % 10;
                    int a = temp / 10;
                    for (int o = 0; o < 12; o++) {
                        int temp_2 = pos[o];
                        if (temp_2 == pos[pos2] + 20 || temp_2 == pos[pos2] - 20) {
                            pos[o] = 401;
                        }
                    }
                    if (b == yStored[batchID][0]) {
                        continue;
                    }
                    pos[pos2] = 401;
                    faculties[facID].faculty_timetable[a][b] = batches[batchID].batchName;
                    lab[labId].lab_timetable[a][b] = batches[batchID].batchName;
                    batches[batchID].timetable[a][b] = batches[batchID].course[2] + " [" + faculties[facID].facultyName + "]" + "{" + lab[labId].labName + "}";
                    faculties[facID].faculty_timetable[a + 1][b] = batches[batchID].batchName;
                    lab[labId].lab_timetable[a + 1][b] = batches[batchID].batchName;
                    batches[batchID].timetable[a + 1][b] = batches[batchID].course[2] + " [" + faculties[facID].facultyName + "]" + "{" + lab[labId].labName + "}";
                    yStored[batchID][0] = b;
                }
                for (int a = 0; a < batches[batchID].timetable.length; a++) {
                    for (int b = 0; b < batches[batchID].timetable[a].length; b++) {
                        if (batches[batchID].timetable[a][b] == null) {
                            continue;
                        }
                        if (batches[batchID].timetable[a][b].equals(batches[batchID].course[2] + " [" + faculties[facID].facultyName + "]" + "{" + lab[labId].labName + "}")) {
                            counter++;
                        }
                    }
                }
                Arrays.fill(x, 401);
                labId++;
            } while (labId < lab.length);
        }
    }
    static void generateDBMS(int batchID, int no_of_lectures) {
        int counter = 0;
        int yStoredCount = 1;
        int[] x_class=new int[30];
        int[] y_class=new int[30];
        int[] pos_class =new int[30];
        Arrays.fill(x_class,401);
        int classID=0;
        int facID = batches[batchID].faculty[2];
        do {
            if(counter==no_of_lectures) {
                break;
            }
            int rem = (no_of_lectures - counter);
            for (int a = 0; a < batches[batchID].timetable.length; a++) {
                for (int b = 0; b < batches[batchID].timetable[a].length; b++) {
                    if(batches[batchID].timetable[a][b]==null) {
                        if(faculties[facID].faculty_timetable[a][b]==null) {
                            if(classrooms[classID].class_timetable[a][b]==null) {
                                for (int c = 0; c < x_class.length; c++) {
                                    if(x_class[c] == 401) {
                                        x_class[c] = a;
                                        y_class[c] = b;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            for (int i = 0; i < pos_class.length; i++) {
                if(x_class[i]!=401) {
                    pos_class[i]=x_class[i]*10+y_class[i];
                }
                if(x_class[i]==401) {
                    pos_class[i]=401;
                }
            }
            for (int d = 0; d < rem; d++) {
                int count=0;
                for(int p:pos_class) {
                    if(p==401) {
                        count++;
                    }
                }
                if(count== pos_class.length) {
                    break;
                }
                int pos2;
                do {
                    pos2 = random.nextInt(pos_class.length-1);
                } while (pos_class[pos2] == 401);
                int temp=pos_class[pos2];
                int b = temp%10;
                int a = temp/10;
                pos_class[pos2]=401;
                if(b==yStored[batchID][0] ||(b==yStored[batchID][1] && b==yStored[batchID][2]) ||(b==yStored[batchID][1] && b==yStored[batchID][3]) ||(b==yStored[batchID][2] && b==yStored[batchID][3])) {
                    continue;
                }
                faculties[facID].faculty_timetable[a][b] = batches[batchID].batchName;
                classrooms[classID].class_timetable[a][b] = batches[batchID].batchName;
                batches[batchID].timetable[a][b] = batches[batchID].course[2] + " [" + faculties[facID].facultyName + "]"+ "{"+classrooms[classID].classroom+"}";
                yStored[batchID][yStoredCount++]=b;
            }
            for (int a = 0; a < batches[batchID].timetable.length; a++) {
                for (int b = 0; b < batches[batchID].timetable[a].length; b++) {
                    if (batches[batchID].timetable[a][b] == null) {
                        continue;
                    }
                    if (batches[batchID].timetable[a][b].equals(batches[batchID].course[2] + " [" + faculties[facID].facultyName + "]" + "{"+classrooms[classID].classroom+"}")) {
                        counter++;
                    }
                }
            }
            classID++;
            Arrays.fill(x_class,401);
        } while(classID<classrooms.length);
        {
            facID = batches[batchID].faculty[2];
            int[] x = new int[30];
            int[] y = new int[30];
            int[] pos = new int[30];
            Arrays.fill(x, 401);
            int labId = 0;
            do {
                if (counter == no_of_lectures) {
                    break;
                }
                int rem =no_of_lectures - counter ;
                for (int a = 0; a < batches[batchID].timetable.length; a ++) {
                    for (int b = 0; b < batches[batchID].timetable[a].length; b++) {
                        if (batches[batchID].timetable[a][b] == null) {
                            if (faculties[facID].faculty_timetable[a][b] == null) {
                                if (lab[labId].lab_timetable[a][b] == null) {
                                    for (int c = 0; c < x.length; c++) {
                                        if (x[c] == 401) {
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
                for (int i = 0; i < 30; i++) {
                    if (x[i] != 401) {
                        pos[i] = x[i] * 10 + y[i];
                    }
                    if (x[i] == 401) {
                        pos[i] = 401;
                    }
                }
                for (int d = 0; d < rem; d++) {
                    int count = 0;
                    for (int p : pos) {
                        if (p == 401) {
                            count++;
                        }
                    }
                    if (count == 30) {
                        break;
                    }
                    int pos2;
                    do {
                        pos2 = random.nextInt(11);
                    } while (pos[pos2] == 401);
                    int temp = pos[pos2];
                    int b = temp % 10;
                    int a = temp / 10;
                    for (int o = 0; o < 30; o++) {
                        int temp_2 = pos[o];
                        if (temp_2 == pos[pos2] + 20 || temp_2 == pos[pos2] - 20) {
                            pos[o] = 401;
                        }
                    }
                    if (b == yStored[batchID][0]) {
                        continue;
                    }
                    pos[pos2] = 401;
                    if(b==yStored[batchID][0] ||(b==yStored[batchID][1] && b==yStored[batchID][2]) ||(b==yStored[batchID][1] && b==yStored[batchID][3]) ||(b==yStored[batchID][2] && b==yStored[batchID][3])) {
                        continue;
                    }
                    faculties[facID].faculty_timetable[a][b] = batches[batchID].batchName;
                    lab[labId].lab_timetable[a][b] = batches[batchID].batchName;
                    batches[batchID].timetable[a][b] = batches[batchID].course[2] + " [" + faculties[facID].facultyName + "]" + "{" + lab[labId].labName + "}";
                    yStored[batchID][yStoredCount++]=b;
                }
                for (int a = 0; a < batches[batchID].timetable.length; a++) {
                    for (int b = 0; b < batches[batchID].timetable[a].length; b++) {
                        if (batches[batchID].timetable[a][b] == null) {
                            continue;
                        }
                        if (batches[batchID].timetable[a][b].equals(batches[batchID].course[2] + " [" + faculties[facID].facultyName + "]" + "{" + lab[labId].labName + "}")) {
                            counter++;
                        }
                    }
                }
                Arrays.fill(x, 401);
                labId++;
            } while (labId < lab.length);
        }
    }
    static int count=0;
    static int count_2=0;
    static void displayBatchTimeTable(int batchId) {
        int counter=0;
        for (int i = 0; i < batches[batchId].timetable.length; i++) {
            for(int j=0; j< batches[batchId].timetable[i].length;j++) {
                if(batches[batchId].timetable[i][j]==null) {
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
    static int[] batchCounter =new int[12];
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
            if(faculties[facId].facultyName == null) {
                continue;
            }
            for (int i = 0; i < faculties[facId].faculty_timetable.length; i++) {
                for(int j=0; j<faculties[facId].faculty_timetable[i].length;j++) {
                    if(faculties[facId].faculty_timetable[i][j]==null) {
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
        for (Lab lab1 : lab) {
            if(lab1.labName == null) {
                continue;
            }
            for (int i = 0; i < lab1.lab_timetable.length; i++) {
                for(int j=0; j<lab1.lab_timetable[i].length;j++) {
                    if(lab1.lab_timetable[i][j]==null) {
                        lab1.lab_timetable[i][j]="--";
                    }
                    counter(lab1.lab_timetable[i][j]);
                }
            }
            lab1.display();
            System.out.println();
        }
        for (FeeLab lab1 : feeLabs) {
            if(lab1.FEE_labName == null) {
                continue;
            }
            for (int i = 0; i < lab1.fee_lab_timetable.length; i++) {
                for(int j = 0; j<lab1.fee_lab_timetable[i].length; j++) {
                    if(lab1.fee_lab_timetable[i][j]==null) {
                        lab1.fee_lab_timetable[i][j]="--";
                    }
                    counter(lab1.fee_lab_timetable[i][j]);
                }
            }
            lab1.display();
            System.out.println();
        }
        for (Classroom c : classrooms) {
            if(c.classroom == null) {
                continue;
            }
            for (int i = 0; i < c.class_timetable.length; i++) {
                for(int j=0; j<c.class_timetable[i].length;j++) {
                    if(c.class_timetable[i][j]==null) {
                        c.class_timetable[i][j]="--";
                    }
                    counter(c.class_timetable[i][j]);
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
        System.out.println("If this is equal to 72 --> Only maths lecture missing and no overriding");
        System.out.println(count_2+sub_count[3]);
        System.out.println();
        double count2=0.0;
        for (int x:sub_count) {
            count2+=x;
        }
        count2*=100;
        System.out.println();
        int sum12=0;
        for(int x:batchCounter) {
            System.out.println(x);
            sum12+=x;
        }
        System.out.println();
        System.out.println(336-sum12);
        System.out.println("Accuracy Of the TimeTable : "+((count2)/336.0)+"%");
        System.out.println("Accuracy Of the TimeTable : "+((count*100)/12.0)+"%");
    }
    static void counter(String s) {
        for (int i = 0; i < 12; i++) {
            String batch="B"+(i+1);
            if(batch.equals(s)) {
                batchCounter[i]++;
            }
        }
    }
}