import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {
    System.out.println ("Welcome to the Pep-Pep Ticket Machine.");
    System.out.println ("Please select a command letter: ");
    System.out.println ("a: Purchase Pep-Pep Ticket");
    System.out.println ("b: Check credit balance");
    System.out.println ("c: Manage Pep-Pep Ticket");
    System.out.println ("d: Register User to Ticket");
    System.out.println ("e: Delete User to Ticket");
    System.out.println ("f: View Travel History");
    System.out.println ("q: Quit");
    String choice = null;
    Scanner scan = new Scanner (System.in);
    do
      {
	choice = scan.nextLine ();
	switch (choice)
	  {
	  case "a":
	    System.out.println ("purchase.exe");
	    break;
	    case "b":System.out.println ("checkcredit.exe");
	    break;
	    case "c":System.out.println ("manage.exe");
	    break;
	    case "d":System.out.println ("register.exe");
	    break;
	    case "e":System.out.println ("delete.exe");
	    break;
	    case "f":System.out.println ("travelhistory.exe");
	    break;
	    default:System.
	      out.println ("Incorrect input, please choose one form below ");
	    System.out.println ("a: Purchase Pep-Pep Ticket");
	    System.out.println ("b: Check credit balance");
	    System.out.println ("c: Manage Pep-Pep Ticket");
	    System.out.println ("d: Register User to Ticket");
	    System.out.println ("e: Delete User to Ticket");
	    System.out.println ("f: View Travel History");
	    System.out.println ("q: Quit");
	    break;
	  }
      }
    while (!choice.equals ("q"));
    System.out.println ("Thank you for using the Pep-Pep Ticket Machine");
    System.out.println ("This session is now closed");
  }
}
