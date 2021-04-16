import java.util.Scanner;

public class MobileChecker {
	public static void login() {

		Scanner sc= new Scanner(System.in);
		System.out.println("enter the user:");
		Long User=sc.nextLong();
		System.out.println("enter the password:");
		Long password=sc.nextLong();
		if(User==9626848802L && password==1234L)
		{
			System.out.println("The user is valid");
		}
		else {
			System.out.println("The user is not valid ");
		}
	}
}

