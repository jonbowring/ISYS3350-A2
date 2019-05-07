import java.util.*;

public class PepSystem {
		
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
		    case "q":
		    System.out.println ("Thank you for using the Pep-Pep Ticket Machine");
		    System.out.println ("This session is now closed");
		    scan.close();
		  }
	      }
	  }
	  
	  private class User {
			
			/*
			 * #############################################
			 * Properties
			 * #############################################
			 * */
			
			private String email, firstName, lastName, phone;
			
			/*
			 * #############################################
			 * Constructors
			 * #############################################
			 * */
			
			public User(String email, String firstName, String lastName, String phone) {
				this.email = email;
				this.firstName = firstName;
				this.lastName = lastName;
				this.phone = phone;
			}
			
			/*
			 * #############################################
			 * Get methods
			 * #############################################
			 * */
			
			public String getEmail() {
				return this.email;
			}
			
			public String getFirstName() {
				return this.firstName;
			}
			
			public String getLastName() {
				return this.lastName;
			}
			
			public String getPhone() {
				return this.phone;
			}
			
			/*
			 * #############################################
			 * Set methods
			 * #############################################
			 * */
			
			public void setEmail(String email) {
				this.email = email;
			}
			
			public void setFirstName(String firstName) {
				this.firstName = firstName;
			}
			
			public void setLastName(String lastName) {
				this.lastName = lastName;
			}
			
			public void setPhone(String phone) {
				this.phone = phone;
			}
			
		}
	
		private class Ticket {
			
			/*
			 * #############################################
			 * Properties
			 * #############################################
			 * */
		
			private String id;
			private float credit;
		//	private Transaction history;
		//	private User user;
			
			/*
			 * #############################################
			 * Constructors
			 * #############################################
			 * */
			
			public Ticket(String id, float credit/*, Transaction history, User user*/) {
			  this.id = id;
			  this.credit = credit;
		//	  this.history = history;
		//	  this.user = user;
			}
			
			
			
			public void buyPass() {
				
			}
			
			public void printHistory() {
				
			}
		
			private boolean validateCredit() {
				if (credit > 100) {
					return false;
				} else {
					return true;
				}
			}
		
			public void addCredit() {
				if (validateCredit() == true) {
					
				}
			}
			
			/*
			 * #############################################
			 * Getters/Setters
			 * #############################################
			 * */
			
			public String getId() {
				return id;
			}
		
			public void setId(String id) {
				this.id = id;
			}
		
			public float getCredit() {
				return credit;
			}
		
			public void setCredit(float credit) {
				this.credit = credit;
			}
		
		//	public Transaction getHistory() {
		//		return history;
		//	}
		//
		//	public void setHistory(Transaction history) {
		//		this.history = history;
		//	}
		//
		//	public User getUser() {
		//		return user;
		//	}
		//
		//	public void setUser(User user) {
		//		this.user = user;
		//	}
		
		}
}