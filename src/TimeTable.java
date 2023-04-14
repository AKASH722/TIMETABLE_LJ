import java.util.Arrays;
import java.util.Random;
public class TimeTable {
    static Random random=new Random();
    static Course[] courses = new Course[50];
    static Faculty[] faculties = new Faculty[50];
    static Batch[] batches = new Batch[50];
    static Lab[] lab= new Lab[9];
    static FeeLab[] feeLabs=new FeeLab[2];
    static Classroom[] classrooms=new Classroom[8];
    static boolean assignLab(int courseID, int batchID, int facID, int labId, int[] pos) {
        int count=0;
        for(int p:pos) {
            if(p==401) {
                count++;
            }
        }
        if(count==12) {
            return true;
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
        faculties[facID].faculty_timetable[a][b] = batches[batchID].batchName;
        lab[labId].lab_timetable[a][b] = batches[batchID].batchName;
        batches[batchID].timetable[a][b] = batches[batchID].course[courseID] + " [" + faculties[facID].facultyName + "]"+ "{"+lab[labId].labName+"}";
        faculties[facID].faculty_timetable[a+1][b] = batches[batchID].batchName;
        lab[labId].lab_timetable[a+1][b] = batches[batchID].batchName;
        batches[batchID].timetable[a + 1][b] = batches[batchID].course[courseID] + " [" + faculties[facID].facultyName + "]" + "{"+lab[labId].labName+"}";
        return false;
    }
    static void checkLab(int batchID, int facID, int[] x, int[] y, int labId, int[] pos) {
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
        generatePosition(x, y, pos);
    }
    static void assignDifferentLab(int courseID, int batchID, int facID, int[] x, int[] y, int[] pos, int labId, int no_of_lectures) {
        int remLabID=0;
        int counter = 0;
        counter = getCounter(courseID, batchID, facID, labId, counter);
        do {
            if(counter==no_of_lectures) {
                break;
            }
            int rem = (no_of_lectures - counter) / 2;
            checkLab(batchID, facID, x, y, remLabID, pos);
            for (int d = 0; d < rem; d++) {
                if (assignLab(courseID, batchID, facID, remLabID, pos)) break;
            }
            counter = getCounter(courseID, batchID, facID, remLabID, counter);
            remLabID++;
        } while(remLabID<9);
    }
    private static int getCounter(int courseID, int batchID, int facID, int labId, int counter) {
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
        return counter;
    }
    static void generatePosition(int[] x, int[] y, int[] pos) {
        for (int i = 0; i < 12; i++) {
            if(x[i]!=401) {
                pos[i]=x[i]*10+y[i];
            }
            if(x[i]==401) {
                pos[i]=401;
            }
        }
    }
    static boolean assignClassroom5th(int courseID, int batchID, int[] pos, int classID, int facID, int[] pos_2) {
        int count=0;
        for(int p:pos_2) {
            if(p==401) {
                count++;
            }
        }
        if(count==6) {
            return true;
        }
        int pos2;
        do {
            pos2 = random.nextInt(6);
        } while (pos_2[pos2] == 401);
        int temp=pos_2[pos2];
        int b = temp%10;
        int a = temp/10;
        pos[pos2]=401;
        faculties[facID].faculty_timetable[a][b] = batches[batchID].batchName;
        classrooms[classID].class_timetable[a][b] = batches[batchID].batchName;
        batches[batchID].timetable[a][b] = batches[batchID].course[courseID] + " [" + faculties[facID].facultyName + "]"+ "{"+classrooms[classID].classroom+"}";
        return false;
    }
    static void checkClassroom5th(int batchID, int[] x, int[] storedY, int facID, int classID, int g, int[] j, int[] pos_2) {
        for (int b = 0; b < batches[batchID].timetable[g].length; b++) {
            if(batches[batchID].timetable[g][b]==null) {
                if(faculties[facID].faculty_timetable[g][b]==null) {
                    if(classrooms[classID].class_timetable[g][b]==null) {
                        for (int c = 0; c < x.length; c++) {
                            if(j[c] == 401) {
                                j[c] = b;
                                break;
                            }
                        }
                    }
                }
            }
        }
        for(int o=0;o<6;o++) {
            int temp=j[o];
            temp%=10;
            for(int q=0;q<2;q++) {
                if(temp==storedY[q]) {
                    j[o]=401;
                    break;
                }
            }
        }
        for (int m = 0; m < 6; m++) {
            if(j[m]!=401) {
                pos_2[m]=g*10+j[m];
            }
            if(j[m]==401) {
                pos_2[m]=401;
            }
        }
    }
    static boolean assignClassRoom(int courseID, int batchID, int[] storedY, int[] pos, int facID, int classID, int d) {
        int count=0;
        for(int p:pos) {
            if(p==401) {
                count++;
            }
        }
        if(count==12) {
            return true;
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
        faculties[facID].faculty_timetable[a][b] = batches[batchID].batchName;
        classrooms[classID].class_timetable[a][b] = batches[batchID].batchName;
        batches[batchID].timetable[a][b] = batches[batchID].course[courseID] + " [" + faculties[facID].facultyName + "]"+ "{"+classrooms[classID].classroom+"}";
        faculties[facID].faculty_timetable[a+1][b] = batches[batchID].batchName;
        classrooms[classID].class_timetable[a+1][b] = batches[batchID].batchName;
        batches[batchID].timetable[a + 1][b] = batches[batchID].course[courseID] + " [" + faculties[facID].facultyName + "]" + "{"+classrooms[classID].classroom+"}";
        storedY[d]=b;
        return false;
    }
    static void checkClassroom(int batchID, int[] x, int[] y, int[] pos, int facID, int classID) {
        for (int a = 0; a < 4; a+=2) {
            for (int b = 0; b < batches[batchID].timetable[a].length; b++) {
                if(batches[batchID].timetable[a][b]==null) {
                    if(faculties[facID].faculty_timetable[a][b]==null) {
                        if(classrooms[classID].class_timetable[a][b]==null) {
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
        generatePosition(x, y, pos);
    }
    static  void generateDS_JAVA() {
        for(int courseID=0 ;courseID<2;courseID++) {
            for(int batchID=0 ;batchID<12;batchID++) {
                if (courseID == 0 && batchID == 9) {
                    continue;
                }
                int facID = batches[batchID].faculty[courseID];
                int[] x = new int[12];
                int[] y = new int[12];
                Arrays.fill(x, 401);
                int labId;
                int[] pos = new int[12];
                if (batchID < 6) {
                    labId = batchID;
                } else {
                    labId = batchID - 6;
                }
                checkLab(batchID, facID, x, y, labId, pos);
                for (int d = 0; d < 3; d++) {
                    if (assignLab(courseID, batchID, facID, labId, pos)) break;
                }
                int no_of_lectures=6;
                assignDifferentLab(courseID, batchID, facID, x, y, pos, labId, no_of_lectures);
            }
        }
    }
    static void generateFEE() {
        int courseID=4;
        for(int batchID=0 ;batchID<12;batchID++) {
            int[] x=new int[12];
            int[] y=new int[12];
            int[] storedY=new int[2];
            int[] pos =new int[12];
            int facID=batches[batchID].faculty[courseID];
            Arrays.fill(x,401);
            int classID;
            int labId;
            if(batchID<6) {
                classID=batchID;
                labId=0;
            } else {
                classID=batchID-6;
                labId=1;
            }
            checkClassroom(batchID, x, y, pos, facID, classID);
            for (int d = 0; d < 2; d++) {
                if (assignClassRoom(courseID, batchID, storedY, pos, facID, classID, d)) break;
            }
            int[] j=new int[6];//y
            Arrays.fill(j,401);
            int[] pos_2 =new int[6];
            int g=4;//x
            for (int b = 0; b < batches[batchID].timetable[g].length; b++) {
                if(batches[batchID].timetable[g][b]==null) {
                    if(faculties[facID].faculty_timetable[g][b]==null) {
                        if(feeLabs[labId].fee_lab_timetable[g][b]==null) {
                            for (int c = 0; c < x.length; c++) {
                                if(j[c] == 401) {
                                    j[c] = b;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            for(int o=0;o<6;o++) {
                int temp=j[o];
                temp%=10;
                for(int q=0;q<2;q++) {
                    if(temp==storedY[q]) {
                        j[o]=401;
                        break;
                    }
                }
            }
            for (int m = 0; m < 6; m++) {
                if(j[m]!=401) {
                    pos_2[m]=g*10+j[m];
                }
                if(j[m]==401) {
                    pos_2[m]=401;
                }
            }
            for (int d = 0; d < 1; d++) {
                int count=0;
                for(int p:pos_2) {
                    if(p==401) {
                        count++;
                    }
                }
                if(count==6) {
                    break;
                }
                int pos2;
                do {
                    pos2 = random.nextInt(6);
                } while (pos_2[pos2] == 401);
                int temp=pos_2[pos2];
                int b = temp%10;
                int a = temp/10;
                pos[pos2]=401;
                faculties[facID].faculty_timetable[a][b] = batches[batchID].batchName;
                feeLabs[labId].fee_lab_timetable[a][b] = batches[batchID].batchName;
                batches[batchID].timetable[a][b] = batches[batchID].course[courseID] + " [" + faculties[facID].facultyName + "]"+ "{"+ feeLabs[labId].FEE_labName +"}";
            }
        }
    }
    static void generateMaths() {
        int courseID=3;
        for(int batchID=0 ;batchID<12;batchID++) {
            int[] x=new int[12];
            int[] y=new int[12];
            int[] storedY=new int[2];
            int[] pos =new int[12];
            Arrays.fill(x,401);
            int classID;
            if(batchID<6) {
                classID=batchID;
            } else {
                classID=batchID-6;
            }
            int facID=batches[batchID].faculty[courseID];
            checkClassroom(batchID, x, y, pos, facID, classID);
            int[] pos_2 =new int[6];
            for (int d = 0; d < 2; d++) {
                if (assignClassRoom(courseID, batchID, storedY, pos, facID, classID, d)) break;
            }
            int no_of_lectures=4;
            assignExtraClass2(courseID, batchID, x, y, facID, pos, storedY, classID, no_of_lectures);
            int[] j=new int[6];//y
            Arrays.fill(j,401);
            int g=4;//x
            checkClassroom5th(batchID, x, storedY, facID, classID, g, j, pos_2);
            for (int d = 0; d < 2; d++) {
                if (assignClassroom5th(courseID, batchID, pos, classID, facID, pos_2)) break;
            }
            no_of_lectures=6;
            assignExtraClass5(courseID, batchID, x, storedY, pos, classID, facID, pos_2, no_of_lectures, j, g);
        }
    }
    private static void assignExtraClass5(int courseID, int batchID, int[] x, int[] storedY, int[] pos, int classID, int facID, int[] pos_2, int no_of_lectures, int[] j, int g) {
        int counter=0;
        counter = getCounter2(courseID, batchID, facID, classID, counter);
        int remClassId=0;
        do {
            if(counter==no_of_lectures) {
                break;
            }
            int rem = (no_of_lectures - counter);
            Arrays.fill(j,401);
            Arrays.fill(pos_2,401);
            checkClassroom5th(batchID, x, storedY, facID, remClassId, g, j, pos_2);
            for (int d = 0; d < rem; d++) {
                if (assignClassroom5th(courseID, batchID, pos, remClassId, facID, pos_2)) break;
            }
            counter = getCounter2(courseID, batchID, facID, remClassId, counter);
            remClassId++;
        } while(remClassId<7);
    }

    static void generateDBMS() {
        int courseID=2;
        for(int batchID=0 ;batchID<12;batchID++) {
            int facID=batches[batchID].faculty[courseID];
            int[] x=new int[12];
            int[] y=new int[12];
            int[] pos =new int[12];
            Arrays.fill(x,401);
            int labId;
            if(batchID<6) {
                labId=6;
            } else {
                labId=7;
            }
            checkLab(batchID, facID, x, y, labId, pos);
            for (int d = 0; d < 1; d++) {
                if (assignLab(courseID, batchID, facID, labId, pos)) break;
            }
            int no_of_lectures=2;
            assignDifferentLab(courseID, batchID, facID, x, y, pos, labId, no_of_lectures);
        }
        for(int batchID=0 ;batchID<12;batchID++) {
            int[] x=new int[12];
            int[] y=new int[12];
            int facID=batches[batchID].faculty[courseID];
            int[] pos =new int[12];
            int[] storedY=new int[2];
            Arrays.fill(x,401);
            int classID;
            if(batchID<6) {
                classID=batchID;
            } else {
                classID=batchID-6;
            }
            checkClassroom(batchID, x, y, pos, facID, classID);
            for (int d = 0; d < 1; d++) {
                if (assignClassRoom(courseID, batchID, storedY, pos, facID, classID, d)) break;
            }
            int no_of_lectures=2;
            assignExtraClass2(courseID, batchID, x, y, facID, pos, storedY, classID, no_of_lectures);
            int g=4;//x
            int[] j=new int[6];//y
            Arrays.fill(j,401);
            int[] pos_2 =new int[6];
            checkClassroom5th(batchID, x, storedY, facID, classID, g, j, pos_2);
            for (int d = 0; d < 1; d++) {
                if (assignClassroom5th(courseID, batchID, pos, classID, facID, pos_2)) break;
            }
            no_of_lectures+=1;
            assignExtraClass5(courseID, batchID, x, storedY, pos, classID, facID, pos_2, no_of_lectures, j, g);
        }
    }
    private static void assignExtraClass2(int courseID, int batchID, int[] x, int[] y, int facID, int[] pos, int[] storedY, int classID, int no_of_lectures) {
        int counter=0;
        counter = getCounter2(courseID, batchID, facID, classID, counter);
        int remClassId=0;
        do {
            if(counter==no_of_lectures) {
                break;
            }
            int rem = (no_of_lectures - counter)/2;
            checkClassroom(batchID, x, y, pos, facID, remClassId);
            for (int d = 0; d < rem; d++) {
                if (assignClassRoom(courseID, batchID, storedY, pos, facID, remClassId, d)) break;

            }
            counter = getCounter2(courseID, batchID, facID, remClassId, counter);
            remClassId++;
        } while(remClassId<7);
    }
    private static int getCounter2(int courseID, int batchID, int facID, int classID, int counter) {
        for (int a = 0; a < batches[batchID].timetable.length; a++) {
            for (int b = 0; b < batches[batchID].timetable[a].length; b++) {
                if (batches[batchID].timetable[a][b] == null) {
                    continue;
                }
                if (batches[batchID].timetable[a][b].equals(batches[batchID].course[courseID] + " [" + faculties[facID].facultyName + "]" + "{"+classrooms[classID].classroom+"}")) {
                    counter++;
                }
            }
        }
        return counter;
    }

    static int count=0;
    static int count_2=0;
    static void displayTimeTAble () {
        for (Batch batch : batches) {
            if (batch.batchName == null) {
                continue;
            }
            int counter=0;
            for (int i = 0; i < batch.timetable.length; i++) {
                for(int j=0; j< batch.timetable[i].length;j++) {
                    if(batch.timetable[i][j]==null) {
                        batch.timetable[i][j]="     -------     ";
                        counter++;
                    }
                }
            }
            batch.display();
            if(counter==2) {
                count++;
                System.out.println("All fine");
            } else {
                System.out.println("Not Fine "+(counter-2));
                count_2+=counter-2;
            }
            System.out.println();
        }
        System.out.println("faculties\n");
        for (Faculty faculty : faculties) {
            if(faculty.facultyName == null) {
                continue;
            }
            for (int i = 0; i < faculty.faculty_timetable.length; i++) {
                for(int j=0; j<faculty.faculty_timetable[i].length;j++) {
                    if(faculty.faculty_timetable[i][j]==null) {
                        faculty.faculty_timetable[i][j]="--";
                    }
                }
            }
            faculty.display();
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
                }
            }
            c.display();
            System.out.println();
        }
        System.out.println(count);
        System.out.println(count_2);
    }
    public static void main(String[] args) {
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
        classrooms[6].setClassroom("EXTRA");
        courses[0].setCourse("DS  ",6, new int[]{0, 1, 2, 3, 4}); //2 2 2
        courses[1].setCourse("JAVA",6, new int[]{5, 6, 7, 8}); // 2 2 2
        courses[2].setCourse("DBMS",5, new int[]{9, 10, 11, 12, 13, 14}); // 2 2 1
        courses[3].setCourse("MATH",6, new int[]{15, 16, 17, 18, 19}); //2 2 1 1
        courses[4].setCourse("FEE ",5, new int[]{20, 21, 22, 23, 24}); //2 2 1
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
        generateDS_JAVA();
        generateFEE();
        generateMaths();
        generateDBMS();
        displayTimeTAble();
    }
}