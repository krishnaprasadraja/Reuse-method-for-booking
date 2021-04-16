package priceestimator;

import java.time.LocalDate;
import java.util.Scanner;

public class PriceEstimator {
	 public static void priceestimator() {
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
					 System.out.println("enter the km:");
					 int km=sc.nextInt();
					 int amount1=10*km;
					 System.out.println("Amount You Travelled:"+ amount1);
					 double tax1=amount1*0.07;
					 double gst1 =amount1+tax1;
					 System.out.println("TOTAL AMOUNT INCLUDE GST:"+ gst1);
					 seniorcitizen(gst1);
					 break;
			 case 2:
					 System.out.println("Mini is rs:15/km");
					 System.out.println("enter the km:");
					 int km1=sc.nextInt();
					 int amount2=15*km1;
					 System.out.println("Amount You Travelled:"+ amount2);
					 double tax2=amount2*0.07;
					 double gst2 =amount2+tax2;
					 System.out.println("TOTAL AMOUNT INCLUDE GST:"+ gst2);
					 seniorcitizen(gst2);
					 break;
			 case 3:
					 System.out.println("Prime is rs:20/km");
					 System.out.println("enter the km:");
					 int km11=sc.nextInt();
					 int amount3=20*km11;
					 System.out.println("Amount You Travelled:"+ amount3);
					 double tax3=amount3*0.07;
					 double gst3=amount3+tax3;
					 System.out.println("TOTAL AMOUNT INCLUDE GST:"+ gst3);
					 
					 seniorcitizen(gst3);
					 break;
					 
			 }
			}

		 
		 public static void seniorcitizen(double gst) {
			LocalDate date= LocalDate.now();  
			int comp1 = date.getYear();
			System.out.println("current year:"+comp1);
			System.out.println("date will be displayed"+ date);
			Scanner sc =new Scanner(System.in);
			System.out.println("enter the date of birth");
			String dob= sc.next();
			LocalDate today=LocalDate.parse(dob);
			int comp2 = today.getYear();
			System.out.println("bornyearyear:"+comp2);
			  int age = comp1-comp2;

			System.out.println("Date of Birth:"+ dob);
			System.out.println("Today" + date);
			System.out.println("Age"+ age);
			
			if(age>60) {
				System.out.println("Above 60 Years: 50% FARE DISCOUNT IN TOTAL BILL");
				double billamount=gst/2;
				System.out.println("Total bill amount:"+ billamount);
				
			}
		     else {
		        System.out.println("THERE IS NO DISCOUNT ,TOTAL BILLAMOUNT 500.");
			            }
		 

		 }
}
