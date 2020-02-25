import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class InterfaceImplementation implements InterfaceGenerate{





	@Override
	public void displayDiagnosticCenters() {
		ArrayList<GetterSetter> a2=new ArrayList<GetterSetter>();
		GetterSetter a=new GetterSetter();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter center name");
		String cn1=sc.nextLine();
		System.out.println("Enter center id");
		String ci1=sc.nextLine();
	    a.setCenter_id(ci1);
	    a.setCenter_name(cn1);
	    a2.add(a);
	    GetterSetter b=new GetterSetter();

	    System.out.println("Enter center name");
		String cn2=sc.nextLine();
		System.out.println("Enter center id");
		String ci2=sc.nextLine();
	    b.setCenter_id(ci1);
	    b.setCenter_name(cn1);
	    a2.add(b);
	    
	    Iterator it1=a2.iterator();
		while(it1.hasNext())
		{
			GetterSetter p=(GetterSetter)it1.next();
			System.out.println("DiagnosticCenter name........");
			
			System.out.println(p.getCenter_name());
		}
		
	 	}

	@Override
	public void displayListOfTests() {
		GetterSetter c=new GetterSetter();
		Scanner sc=new Scanner(System.in);
		ArrayList<String> sample=new ArrayList<String>();
		System.out.println("Enter test name");
		String a4=sc.nextLine();
		String a41=sc.nextLine();
		sample.add(a4);
		sample.add(a41);
		c.setListOfTests(sample);
		ArrayList<String> sample1=c.getListOfTests();
		System.out.println("List of tests are:-");
		for(int i=0;i<sample1.size();i++)
		{
			System.out.println(sample1.get(i));
		}
		
		}

	@Override
	public void displayAppointments() {
		// TODO Auto-generated method stub
		
	}

}
