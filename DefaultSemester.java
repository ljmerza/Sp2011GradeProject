import java.util.Scanner;

public class DefaultSemester
{
	public static void main(String[] args)
	{
		// create class objects
		/********************************************************/
		Math142 math142 = new Math142();
		Csce146 csce146 = new Csce146();
		Phys211 phys211 = new Phys211();
		Phys211L phys211L = new Phys211L();
		Elct101 elct101 = new Elct101()	;
		Phil211 phil211 = new Phil211();
		

		/********************************************************/

		// get and display current grade
		/********************************************************/
		
		math142.getGrade();

		System.out.print("Csce146: ");
		csce146.getGrade();

		System.out.print("Phys211: ");
		phys211.getGrade();

		System.out.print("Phys211L: ");
		phys211L.getGrade();

		System.out.print("Elct101: ");
		elct101.getGrade();

		System.out.print("Phil211: ");
		phil211.getGrade();

		/********************************************************/

		// get and display current grade
		/********************************************************/
		Scanner in = new Scanner(System.in);
		in.nextLine();
		/********************************************************/

	} // ending of main method
} // ending of DefaultSemester