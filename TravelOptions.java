import java.util.Scanner;

public class TravelOptions
{
	public static void main(String[] args) {
	 double travelCost = 0;
	 double travelDuration = 0;
	  
	System.out.println ("Travel Options:");
    System.out.println ("1: 2 Hours, Zone 1: $3.50");
    System.out.println ("2: 2 Hours, Zone 1+2: $6.00");
    System.out.println ("3: All day, Zone 1: $7.00");
    System.out.println ("4: All day, Zone 1+2: $12.00");
    System.out.println ("Please choose the desired ");
    System.out.println ("travel pass option:");

    String TravelPass = null;
    Scanner scan = new Scanner (System.in);

	  	TravelPass = scan.nextLine ();
	switch (TravelPass)

      {
         
    case "1":
        travelCost = 3.50;
        travelDuration = 2;
	   System.out.println("Thank you.");
	   System.out.println("You have 2 hours of travel in Zone 1.");
	   break;
	 case "2":
	     travelCost = 6.00;
        travelDuration = 2;
	   System.out.println("Thank you.");
	   System.out.println("You have 2 hours of travel in Zones 1+2.");
	   break;
	 case "3":
	     travelCost = 7.00;
        travelDuration = 24;
	   System.out.println("Thank you.");
	   System.out.println("You have All day travel in Zone 1.");
	   break;
	 case "4":
           travelCost = 12.00;
        travelDuration = 24;
           System.out.println("Thank you.");
           System.out.println("You have All day travel in Zones 1+2. ");
           break;
	 default:
	   System.out.println("Invalid entry, please try again.");
      }
	}
}
