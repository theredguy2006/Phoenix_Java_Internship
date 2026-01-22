import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {

        int c;
        Scanner sc = new Scanner(System.in);
        int[] rollNo = new int[50];
        String[] Name = new String[50];
        int[] sub1 = new int[50];
        int[] sub2 = new int[50];
        int[] sub3 = new int[50];
        int[] sub4 = new int[50];
        int[] sub5 = new int[50];
        int counter = 0;
        do {

            System.out.println("Press 1.) To Add Students ");
            System.out.println("Press 2.) To Remove  Students ");
            System.out.println("Press 3.) To Display All Students ");
            System.out.println("Press 4.) To Search Students by Roll No ");
            System.out.println("Press 5.) To Topper ");
            System.out.println("Press 6.) For Average Marks in All Subjects  ");
            System.out.println("Press 0.) To Exit   ");
            c = sc.nextInt();
            sc.nextLine();
            switch (c) {
                case 1:
                    if (counter == 50) {
                        System.out.println("Student limit reached");
                        break;
                    }

                    System.out.println(" Enter Details of Students ");
                    System.out.println("Enter Name of Student ");
                    Name[counter] = sc.nextLine();
                    System.out.println("Enter Marks for Subject 1 ");
                    // sc.nextLine();
                    sub1[counter] = sc.nextInt();
                    System.out.println("Enter Marks for Subject 2 ");
                    sub2[counter] = sc.nextInt();
                    System.out.println("Enter Marks for Subject 3 ");
                    sub3[counter] = sc.nextInt();
                    System.out.println("Enter Marks for Subject 4 ");
                    sub4[counter] = sc.nextInt();
                    System.out.println("Enter Marks for Subject 5 ");
                    sub5[counter] = sc.nextInt();
                    rollNo[counter] = counter + 1;
                    counter += 1;
                    break; 
                case 2:
                    System.out.println("Enter roll number to remove:");
                    int r = sc.nextInt() - 1;

                    if (r < 0 || r >= counter) {
                        System.out.println("Student does not exist");
                    } else {
                        for (int i = r; i < counter - 1; i++) {
                            Name[i] = Name[i + 1];
                            rollNo[i] = rollNo[i + 1];
                            sub1[i] = sub1[i + 1];
                            sub2[i] = sub2[i + 1];
                            sub3[i] = sub3[i + 1];
                            sub4[i] = sub4[i + 1];
                            sub5[i] = sub5[i + 1];
                        }
                        counter--;
                        for (int i = 0; i < counter; i++) {
                            rollNo[i] = i + 1;
                        }

                        System.out.println("Student removed successfully");
                    }

                    break;
                case 3:

                    if (counter == 0) {
                        System.out.println("No Students There ");
                    } else

                    {
                        System.out.println(" Details Of All Students ");
                        for (int i = 0; i < counter; i++) {
                            System.out.println(" Roll No " + rollNo[i]);
                            System.out.println(" Name   " + Name[i]);
                            System.out.println(" Marks in Subject 1 " + sub1[i]);
                            System.out.println(" Marks in Subject 2 " + sub2[i]);
                            System.out.println(" Marks in Subject 3 " + sub3[i]);
                            System.out.println(" Marks in Subject 4 " + sub4[i]);
                            System.out.println(" Marks in Subject 5 " + sub5[i]);
                        }
                    }
                    break;
                case 4:
                    System.out.println(" Enter Roll no of student you want to find ? ");
                    int t = sc.nextInt() - 1;
                    if (t < 0 || t >= counter) {
                        System.out.println(" Student does not exist in the data base ");
                    } else

                    {
                        System.out.println(" Roll No " + rollNo[t]);
                        System.out.println(" Name   " + Name[t]);
                        System.out.println(" Marks in Subject 1 " + sub1[t]);
                        System.out.println(" Marks in Subject 2 " + sub2[t]);
                        System.out.println(" Marks in Subject 3 " + sub3[t]);
                        System.out.println(" Marks in Subject 4 " + sub4[t]);
                        System.out.println(" Marks in Subject 5 " + sub5[t]);
                    }
                    break;
                case 5:
                    if (counter == 0) {
                        System.out.println("No students available");
                        break;
                    }

                    int max1 = sub1[0], idx1 = 0;
                    int max2 = sub2[0], idx2 = 0;
                    int max3 = sub3[0], idx3 = 0;
                    int max4 = sub4[0], idx4 = 0;
                    int max5 = sub5[0], idx5 = 0;

                    for (int i = 1; i < counter; i++) {
                        if (sub1[i] > max1) {
                            max1 = sub1[i];
                            idx1 = i;
                        }
                        if (sub2[i] > max2) {
                            max2 = sub2[i];
                            idx2 = i;
                        }
                        if (sub3[i] > max3) {
                            max3 = sub3[i];
                            idx3 = i;
                        }
                        if (sub4[i] > max4) {
                            max4 = sub4[i];
                            idx4 = i;
                        }
                        if (sub5[i] > max5) {
                            max5 = sub5[i];
                            idx5 = i;
                        }
                    }

                    System.out.println("Topper Subject 1: " + Name[idx1] +
                            " | Roll No: " + rollNo[idx1] + " | Marks: " + max1);

                    System.out.println("Topper Subject 2: " + Name[idx2] +
                            " | Roll No: " + rollNo[idx2] + " | Marks: " + max2);

                    System.out.println("Topper Subject 3: " + Name[idx3] +
                            " | Roll No: " + rollNo[idx3] + " | Marks: " + max3);

                    System.out.println("Topper Subject 4: " + Name[idx4] +
                            " | Roll No: " + rollNo[idx4] + " | Marks: " + max4);

                    System.out.println("Topper Subject 5: " + Name[idx5] +
                            " | Roll No: " + rollNo[idx5] + " | Marks: " + max5);

                    break;

                case 6:
                    System.out.println(" Average marks of all Subject ");
                    double asub1 = 0;
                    double asub2 = 0;
                    double asub3 = 0;
                    double asub4 = 0;
                    double asub5 = 0;
                    for (int i = 0; i < counter; i++) {

                        asub1 += sub1[i];
                        asub2 += sub2[i];
                        asub3 += sub3[i];
                        asub4 += sub4[i];
                        asub5 += sub5[i];
                    }
                    System.out.println(" Average Marks in Subject 1 " + (asub1 / counter));
                    System.out.println(" Average Marks in Subject 2 " + (asub2 / counter));
                    System.out.println(" Average Marks in Subject 3 " + (asub3 / counter));
                    System.out.println(" Average Marks in Subject 4 " + (asub4 / counter));
                    System.out.println(" Average Marks in Subject 5 " + (asub5 / counter));
                    break;
                case 0:
                    System.out.println(" Exiting Bye ");
                    break;
                default:
                    break;
            }
        } while (c != 0);
        sc.close();
    }

}
