package Common;

import java.util.Scanner;

public class CommonCall {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ch = 1;
        int ch1;
        int x = 100;   // capacity
        int i = 0;     // actual student count

        int rollno, rollno1, rollno2;
        String pass, pass2, fname, lname;

        Management[] manage = new Management[x];

        System.out.println("Welcome to Student Management System.");

        do {

            System.out.println();
            System.out.println("MENU:");
            System.out.println("1) Add student");
            System.out.println("2) Update student");
            System.out.println("3) Delete student");
            System.out.println("4) Search student");
            System.out.println("5) Calculate average");
            System.out.println("0) Exit");

            System.out.println("Enter your choice:");
            ch1 = Integer.parseInt(sc.nextLine());

            switch (ch1) {

                // ADD
                case 1:
                    manage[i] = new Management();
                    manage[i].input();
                    manage[i].smark();
                    i++;
                    System.out.println("Student Added Successfully ✅");
                    break;

                // UPDATE
                case 2:
                    System.out.println("Enter Roll No to Update:");
                    rollno1 = Integer.parseInt(sc.nextLine());

                    System.out.println("GIVE UPDATED INFORMATION:");

                    System.out.println("Enter the firstname :");
                    fname = sc.nextLine();

                    System.out.println("Enter the lastname :");
                    lname = sc.nextLine();

                    System.out.println("Enter the rollno :");
                    rollno = Integer.parseInt(sc.nextLine());

                    System.out.println("Enter the passwrd :");
                    pass = sc.nextLine();

                    boolean found = false;

                    for (int j = 0; j < i; j++) {
                        if (manage[j] != null && rollno1 == manage[j].rollno) {

                            manage[j].fname = fname;
                            manage[j].lname = lname;
                            manage[j].rollno = rollno;
                            manage[j].passwrd = pass;

                            System.out.println("Updated Information:");
                            manage[j].searchstudentoutput();

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found ❌");
                    }
                    break;

                // DELETE
                case 3:
                    System.out.println("Enter rollno:");
                    rollno2 = Integer.parseInt(sc.nextLine());

                    System.out.println("Enter password:");
                    pass2 = sc.nextLine();

                    boolean found1 = false;

                    for (int k = 0; k < i; k++) {
                        if (manage[k] != null &&
                            rollno2 == manage[k].rollno &&
                            pass2.equals(manage[k].passwrd)) {

                            for (int l = k; l < i - 1; l++) {
                                manage[l] = manage[l + 1];
                            }

                            manage[i - 1] = null;
                            i--;
                            found1 = true;
                            System.out.println("Student Deleted Successfully ✅");
                            break;
                        }
                    }

                    if (!found1) {
                        System.out.println("Student Not Found ❌");
                    }
                    break;

                // SEARCH
                case 4:
                    System.out.println("Enter rollno:");
                    rollno = Integer.parseInt(sc.nextLine());

                    System.out.println("Enter password:");
                    pass = sc.nextLine();

                    boolean found2 = false;

                    for (int j = 0; j < i; j++) {
                        if (manage[j] != null &&
                            rollno == manage[j].rollno &&
                            pass.equals(manage[j].passwrd)) {

                            manage[j].searchstudentoutput();
                            found2 = true;
                            break;
                        }
                    }

                    if (!found2) {
                        System.out.println("Student Not Found ❌");
                    }
                    break;

                // AVERAGE
                case 5:
                    if (i > 0) {
                        manage[i - 1].smark();
                    } else {
                        System.out.println("No student available ❌");
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    ch = 0;
                    break;

                default:
                    System.out.println("Invalid choice ❌");
            }

        } while (ch != 0);
    }
}