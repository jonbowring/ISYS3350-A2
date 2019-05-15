import java.util.*;

//TODO DELETE THIS CLASS BEFORE SUBMISSION
final class TestJB {
	
	  public TestJB() {
		  
		  //ticket.printHistory();
	  }  
  }
  
//TODO DELETE THIS CLASS BEFORE SUBMISSION
final class Ticket_JB {

	  private String id;
	  private Double credit;
	  private User user;
	  private ArrayList<Transaction> history;

	  public Ticket_JB(User user) {
		  this.history = new ArrayList<Transaction>();
		  this.id = UUID.randomUUID().toString();
		  this.credit = 0.0;
		  this.user = user;
	  }
	  
	  public void buyPass(String duration, String zone) {
		  Transaction tempTrans = new Transaction(duration, zone);
		  if(validateCredit(tempTrans.getPass().getCost())) {
			  history.add(tempTrans);
			  System.out.println("Purchase of a " + duration + " " + zone + " pass was successful.");
		  }
		  else {
			  System.out.println("Sorry, there is not enough credit to purchase a " + duration + " " + zone + " pass.");
		  }
	  }
	  
	  public void addCredit(Double credit) {
		  this.credit = this.credit + credit;
	  }
	  
	  public boolean validateCredit(Double cost) {
		  if(this.credit >= cost) {
			  return true;
		  }
		  else {
			  return false;
		  }
	  }
	  
	  public void printHistory() {
		  for(int i = 0; i < this.history.size(); i ++) {
			  String id = this.history.get(i).getId();
			  Date createdAt = this.history.get(i).getCreatedAt();
			  String duration = this.history.get(i).getPass().getDuration();
			  String zone = this.history.get(i).getPass().getZone();
			  Double cost = this.history.get(i).getPass().getCost();
			  System.out.printf("%s|%s|%s|%s|%f\n",id,createdAt,duration,zone,cost);
		  }
	  }

	}
  
final class Pass {
		
	  /*
	 * #############################################
	 * Properties
	 * #############################################
	 * */
  
  private String id, duration, zone;
	private HashMap<String, Double> costs;
	
	/*
	 * #############################################
	 * Constructors
	 * #############################################
	 * */
	
	public Pass(String duration, String zone) {
		
		// Initialise the costs array
		costs = new HashMap<String, Double>();
		
		// Add initial values to the costs array
		this.costs.put("2 hour:zone 1",3.5);
		this.costs.put("2 hour:zones 1 & 2",6.0);
		this.costs.put("All day:zone 1",7.0);
		this.costs.put("All day:zones 1 & 2",12.0);
		
		this.id = UUID.randomUUID().toString();
		this.duration = duration;
		this.zone = zone;
	}

	/*
	 * #############################################
	 * Get methods
	 * #############################################
	 * */
	
	public String getId() {
		return this.id;
	}
	
	public String getDuration() {
		return this.duration;
	}
	
	public String getZone() {
		return this.zone;
	}
	
	public Double getCost() {
		return this.costs.get(this.duration + ":" + this.zone);
	}
	
	/*
	 * #############################################
	 * Set methods
	 * #############################################
	 * */
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	public void setZone(String zone) {
		this.zone = zone;
	}
	
	
}
  
final class Transaction {
		
	  /*
	 * #############################################
	 * Properties
	 * #############################################
	 * */
  
	private String id;
	private Date createdAt;
	private Pass pass;
	
	/*
	 * #############################################
	 * Constructors
	 * #############################################
	 * */
	
	public Transaction(String duration, String zone) {
		this.id = UUID.randomUUID().toString();
		this.createdAt = new Date();
		this.pass = new Pass(duration, zone);
	}
	
	/*
	 * #############################################
	 * Get methods
	 * #############################################
	 * */
	
	public String getId() {
		return this.id;
	}
	
	public Date getCreatedAt() {
		return this.createdAt;
	}
	
	public Pass getPass() {
		return this.pass;
	}
	
	/*
	 * #############################################
	 * Set methods
	 * #############################################
	 * */
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
	public void setPass(Pass pass) {
		this.pass = pass;
	}
	
}
  
final class User {
		
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
  
final class Ticket {
		
		/*
	 * #############################################
	 * Properties
	 * #############################################
	 * */

	private String id;
	private float credit;
//	private Transaction history;
  	private User user;
	
	/*
	 * #############################################
	 * Constructors
	 * #############################################
	 * */
	
	public Ticket(String id, float credit/*, Transaction history*/, User user) {
	  this.id = id;
	  this.credit = credit;
//	  this.history = history;
  	  this.user = user;
	}
	
	
	
	public void buyPass() {
		
	}
	
	public void printHistory() {
		
	}

	public boolean validateCredit() {
		if (credit > 100 || credit < 0) {
			return false;
		} else {
			return true;

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

public class PepSystem {
		
	  public static void main (String[]args)
	  {
	    // Variable declaration
		HashMap<String, User> users = new HashMap<String, User>();
		String email = "", emailConf = "", firstName = "", lastName = "", phone = "";
		Ticket_JB testTicket;
		Ticket ticket;
		String choice = null;
	    Scanner scan = new Scanner (System.in);
	    User currUser;
		
		// Create the administrator user
		users.put("admin@admin.com", new User("admin@admin.com", "Admin", "Admin", ""));
		
		System.out.println ("Please enter your email address to login (admin users can login using 'admin@admin.com'): ");
		choice = scan.nextLine();
		currUser = users.get(choice);
		if(currUser == null) {
			System.out.println("Sorry, you have entered an invalid user name. Goodbye.");
			System.exit(0);
		}

	    //testTicket = new Ticket_JB(users.get("jbowring@informatica.com"));
	    //testTicket.addCredit(100.0);
	    
	    
	    ticket = new Ticket(UUID.randomUUID().toString(), 0, null);

		  
		System.out.println ("Welcome to the Pep-Pep Ticket Machine.");
	    System.out.println ("Please select a command letter: ");
	    System.out.println ("a: Purchase Pep-Pep Ticket");
	    System.out.println ("b: Check credit balance");
	    System.out.println ("c: Add credit to Pep-Pep Ticket");
	    System.out.println ("d: Register User to Ticket");
	    System.out.println ("e: Edit User");
	    System.out.println ("f: View Travel History");
	    if(currUser.getEmail().equals("admin@admin.com")) {
	    	System.out.println ("g: Register New User");
	    }
	    System.out.println ("q: Quit");
	    
	      {
		choice = scan.nextLine ();
		switch (choice)
			  {
			  case "a":
				//testTicket.buyPass("All day", "zone 1");
			    break;
			  case "b":System.out.println ("checkcredit.exe");
			    break;
			    case "c":
			    	if (ticket.validateCredit() == true) {
						System.out.println ("How much credit would you like to add? (Multiples of 5 only!)");
						int input = scan.nextInt ();
						ticket.setCredit(input);
						System.out.println ("$" + input + " added to your ticket ID = " + ticket.getId());
					} else if(ticket.validateCredit() == false) {
						System.out.println ("You currently hold $" + ticket.getCredit() + " credit, please spend your remaining credit or purchase a new ticket.");
					}
			    break;
			  case "d":System.out.println ("register.exe");
			    break;
			  case "e":
				  
				  while(true) {
					  System.out.println("Please enter the email address of the user to edit.");
					  choice = scan.nextLine();
					  User user = users.get(choice);
					  
					  if(user == null) {
						  System.out.println("Sorry, that is not a valid user email address. Please try again.");
						  continue;
					  }
					  
					  System.out.println("a: Edit first name");
					  System.out.println("b: Edit last name");
					  System.out.println("c: Edit phone number");
					  System.out.println("d: Delete user");
					  choice = scan.nextLine();
					  
					  switch(choice) {
					  case "a":
						  System.out.println("Please enter the new first name:");
						  choice = scan.nextLine();
						  user.setFirstName(choice);
						  System.out.println("Success!");
						  break;
					  case "b":
						  System.out.println("Please enter the new last name:");
						  choice = scan.nextLine();
						  user.setLastName(choice);
						  System.out.println("Success!");
						  break;
					  case "c":
						  System.out.println("Please enter the new phone number:");
						  choice = scan.nextLine();
						  user.setLastName(choice);
						  System.out.println("Success!");
						  break;
					  case "d":
						  users.remove(user.getEmail());
						  System.out.println("Success!");
						  break;
					  }
					  
					  break;
				  }
				  
			    break;
			  case "f":System.out.println ("travelhistory.exe");
			    break;
			  case "g":
				  if(!currUser.getEmail().equals("admin@admin.com")) {
				    	break;
				    }
				  email = getMandatoryValue("Please new users email address:");
				  emailConf = getMandatoryValue("Please confirm the new users email address:");
				  
				  if(!email.equals(emailConf)) {
					  System.out.println("Sorry, the email addresses do not match.");
					  break;
				  }
				  
				  firstName = getMandatoryValue("Please new users first name:");
				  lastName = getMandatoryValue("Please new users last name:");
				  phone = getMandatoryValue("Please new users phone number:");
				  ;
				  if(users.put(email, new User(email, firstName, lastName, phone)) == null) {
					  System.out.println("SUCCESS: A new user has been created for " + email);
				  }
				  else {
					  System.out.println("ERROR: Something went wrong creating a user for " + email);
				  }
				  
			    break;
			  default:System.
			      out.println ("Incorrect input, please choose one form below ");
			    System.out.println ("a: Purchase Pep-Pep Ticket");
			    System.out.println ("b: Check credit balance");
			    System.out.println ("c: Manage Pep-Pep Ticket");
			    System.out.println ("d: Register User to Ticket");
			    System.out.println ("e: Edit User");
			    System.out.println ("f: View Travel History");
			    System.out.println ("g: Register New User");
			    System.out.println ("q: Quit");
			    break;
			  case "q":
			    System.out.println ("Thank you for using the Pep-Pep Ticket Machine");
			    System.out.println ("This session is now closed");
			    scan.close();
			  }
	      }
	      
	  }
	  
	  public static String getMandatoryValue(String msg) {
		  Scanner scan = new Scanner (System.in);
		  String choice = "";
		  
		  while(true) {
			  System.out.println(msg);
			  choice = scan.nextLine();
			  
			  if(choice.equals("") || choice == null) {
				  continue;
			  }
			  
			  break;
		  }
		  
		  return choice;
	  }
}
