package Common;

import java.util.Scanner;

public class Management {
   String fname;
   String lname;
   int rollno;
   String passwrd;
   int smarks;
   int mmarks;
   
	Scanner sc=new Scanner(System.in);
	
	void Menu() {
		System.out.println("MENU:");
		System.out.println("1)Add student");
		System.out.println("2)Update student");
		System.out.println("3)Delete student");
		System.out.println("4)Search student");
		System.out.println("5)Calculate average");
		System.out.println("6)Grade logic");
		System.out.println("7)Validation");
		System.out.println("8)Static utility methods");
		System.out.println("0)Exiting");
		
	}
	
	//1)
	void input() {
		System.out.println("Enter the firstname :");
		fname=sc.nextLine();
		System.out.println("Enter the lastname :");
		lname=sc.nextLine();
		System.out.println("Enter the rollno :");
	    rollno=Integer.parseInt(sc.nextLine());
	    System.out.println("Enter the passwrd :");
	    passwrd=sc.nextLine();  
	  
	}

	//3)
	void deletestudent() {
		System.out.println("Enter the rollno :");
	    rollno=Integer.parseInt(sc.nextLine());
	    System.out.println("Enter the passwrd :");
	    passwrd=sc.nextLine(); 
	}
	
	//4)
	void searchstudentoutput(){
	System.out.println("Name :"+fname+lname);
	System.out.println("Roll no:"+rollno);
	}
	
	//5)
	void smark() {
		System.out.println("Marks enter under 0 to 100 ");
		System.out.println("Enter the marks of science:");
		smarks=Integer.parseInt(sc.nextLine());
		if(smarks>0 && smarks<100) {
			mmarks();
		}
		else {
			smark();
		}
	}
	void mmarks() {
	    System.out.println("Enter the marks of maths:");
	    mmarks=Integer.parseInt(sc.nextLine());
	    if(mmarks>0 && mmarks<100) {
			CalculationofMarks();
		}
		else {
			mmarks();
		}
	}
	void CalculationofMarks(){
		double percentage;
		percentage = ((smarks + mmarks) / 200.0) * 100;
		System.out.println("The Result : " + percentage);

	}
	
}
