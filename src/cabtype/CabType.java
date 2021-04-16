package cabtype;

import java.util.Scanner;

public class CabType {
	public static void cabtype() {
		 Scanner sc=new Scanner (System.in);
		 
		 System.out.println("enter the car type:");
		 System.out.println("1:Micro");
		 System.out.println("2:Mini");
		 System.out.println("3:prime");
		 int cartype = sc.nextInt();
		 
		 switch(cartype)
		 {
		 case 1:
				 System.out.println("Micro is rs:10/km");
				 break;
		 case 2:
				 System.out.println("Mini is rs:15/km");
				 break;
		 case 3:
				 System.out.println("Prime is rs:20/km");
				 break;
				 
		 }

}
}