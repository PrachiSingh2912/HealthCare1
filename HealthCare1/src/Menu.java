import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=0;
		do {
			System.out.println("\t\tHealth Care");
			System.out.println("Menu");
			System.out.println("1. Display list of diagnostic centers");
			System.out.println("2. Display list of test under particular diagnostic centers");
			System.out.println("3. Display appointments");
			System.out.println("Enter your choice(1-3)");
			n=sc.nextInt();
			switch(n)
			{
			case 1:
				InterfaceImplementation obj=new InterfaceImplementation();
				obj.displayDiagnosticCenters();
				break;
			case 2:
				InterfaceImplementation obj1=new InterfaceImplementation();
				obj1.displayListOfTests();
				break;
         /*  case 3:
        	   InterfaceImplementation obj2=new InterfaceImplementation();
				obj2.displayAppointments();
				break;*/
				default:
					System.out.println("Invalid choice");
			}
			
		}while(n<=3);


	}

}
