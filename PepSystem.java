import java.util.*;
  
//TODO DELETE THIS CLASS BEFORE SUBMISSION
/*
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
	*/
  
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
  
	public String id;
	public Date createdAt;
	public Pass pass;
	
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
	  private Double credit;
	  private User user;
	  private ArrayList<Transaction> history;

	  public Ticket(User user) {
		  this.history = new ArrayList<Transaction>();
		  this.id = UUID.randomUUID().toString();
		  this.credit = 0.0;
		  this.user = user;
	  }
	  
	  public void buyPass(String duration, String zone) {
		  Transaction tempTrans = new Transaction(duration, zone);
		  Double cost = tempTrans.getPass().getCost();
		  if(checkCredit(cost)) {
			  history.add(tempTrans);
			  this.credit -= cost; 
			  System.out.println("Purchase of a " + duration + " " + zone + " pass was successful.");
		  }
		  else {
			  System.out.println("Sorry, there is not enough credit to purchase a " + duration + " " + zone + " pass.");
		  }
	  }
	  
	  public void sortByID() {
		  Collections.sort(history, new Comparator<Transaction>() {

			@Override
			public int compare(Transaction a, Transaction b) {
				return a.getId().compareTo(b.getId());
			}
			  
		  });
	  }
	  
	  public void sortByDate() {
		  Collections.sort(history, new Comparator<Transaction>() {

				@Override
				public int compare(Transaction a, Transaction b) {
					return a.getCreatedAt().compareTo(b.getCreatedAt());
				}
				  
			  });
	  }
	
	  public void printHistory() {
		for(int i = 0; i < history.size(); i ++) {
			  String id = history.get(i).getId();
			  Date createdAt = history.get(i).getCreatedAt();
			  String duration = history.get(i).getPass().getDuration();
			  String zone = history.get(i).getPass().getZone();
			  Double cost = history.get(i).getPass().getCost();
			  String user = this.user.getEmail();
			  System.out.printf("Transaction ID: %s | Created on: %s | Pass duration: %s | Zone: %s | Associated user: %s | Cost: %f\n",id,createdAt,duration,zone,user,cost);
		  }
	}

	public boolean validateCredit(int credit) {
		if (credit > 100 || credit < 0 || credit % 5 != 0) {
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

	public Double getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = Double.valueOf(credit);
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
	
	public boolean checkCredit(Double cost) {
		  if(this.credit >= cost) {
			  return true;
		  }
		  else {
			  return false;
		  }
	  }

}

public class PepSystem {
		
	  public static void main (String[]args)
	  {
	    // Variable declaration
		HashMap<String, User> users = new HashMap<String, User>();
		HashMap<String, Ticket>tickets = new HashMap<String, Ticket>();
		String email = "", emailConf = "", firstName = "", lastName = "", phone = "";
		Ticket ticket = null;
		String choice = null;
	    Scanner scan = new Scanner (System.in);
	    User currUser;
		
		// Initialise the users
		users.put("admin@admin.com", new User("admin@admin.com", "Admin", "Admin", ""));
		users.put("test@test.com", new User("test@test.com", "Test", "Er", "0299998888"));
		
		// Print the login screen
		System.out.println ("Please enter your email address to login (admin users can login using 'admin@admin.com'): ");
		choice = scan.nextLine();
		currUser = users.get(choice);
		if(currUser == null) {
			System.out.println("Sorry, you have entered an invalid user name. Goodbye.");
			System.exit(0);
		}

		  
		
	    
	    while(true) {
		
	    	System.out.println("\nWelcome to the Pep-Pep Ticket Machine.");
		    System.out.println("Please select a command letter: ");
		    System.out.println("a: Purchase Pep-Pep Ticket");
		    System.out.println("b: Check credit balance");
		    System.out.println("c: Add credit to Pep-Pep Ticket");
		    System.out.println("d: Edit User");
		    System.out.println("e: View Travel History");
		    System.out.println("f: Buy Travel Pass");
		    if(currUser.getEmail().equals("admin@admin.com")) {
		    	System.out.println ("g: Register New User");
		    }
		    System.out.println("q: Quit");
	    	
	    	choice = scan.nextLine();
		
	    	switch(choice)
			  {
			  case "a":
				  
				  while(true) {
					  Boolean next = true;
					  System.out.println("The cost of a new ticket is $8, are you sure that you want to proceed (Y/N)?: ");
					  choice = scan.nextLine();
					  choice = choice.toLowerCase();
					  
					  switch(choice) {
					  case "y":
						  tickets.put(currUser.getEmail(), new Ticket(currUser));
						  System.out.println("You have successfully bought ticket id " + tickets.get(currUser.getEmail()) + " with $0 credit");
						  break;
					  case "n":
						  System.out.println("Purchase cancelled.");
						  break;
					  default:
						  System.out.println("Sorry, '" + choice + "' is not a valid option. Please try again.");
						  next = false;
						  break;
					  }
					  
					  if(next) {
						  break;
					  }
					  
				  }
				  
			    break;
			  case "b":
				  ticket = tickets.get(currUser.getEmail());
				  if(ticket == null) {
					  System.out.println("You currently do not have a ticket. Please first purchase a ticket.");
				  }
				  else {
					  Double availCredit = ticket.getCredit();
					  System.out.println("Available credit is: " + availCredit);
				  }
				  
			      break;
			    case "c":
			    	ticket = tickets.get(currUser.getEmail());
			    	if(ticket == null) {
			    		System.out.println("You currently do not have a ticket. Please first purchase a ticket.");
			    	}
			    	else {
			    		System.out.println("How much credit would you like to add? (Multiples of 5 only!)");
						int input = scan.nextInt();
			    		if (ticket.validateCredit(input) == true) {
							ticket.setCredit(input);
							System.out.println("$" + input + " added to your ticket ID = " + ticket.getId());
						} else {
							System.out.println("You currently hold $" + ticket.getCredit() + " credit, please spend your remaining credit or purchase a new ticket.");
						}
			    		scan.nextLine(); //This consumes the newline character missed by nextInt, which was causing issues with the next menu selection
			    	}
			    	
			    break;
			  case "d":
				  
				  User editUser = null;
				  
				  while(true) {
					  
					  if(currUser.getEmail().equals("admin@admin.com")) {
						  System.out.println("Please enter the email address of the user to edit.");
						  choice = scan.nextLine();
						  editUser = users.get(choice);
						  
						  if(editUser == null) {
							  System.out.println("Sorry, that is not a valid user email address. Please try again.");
							  continue;
						  }
					  }
					  else {
						  editUser = currUser;
					  }
					  
					  break;
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
					  editUser.setFirstName(choice);
					  System.out.println("Success!");
					  break;
				  case "b":
					  System.out.println("Please enter the new last name:");
					  choice = scan.nextLine();
					  editUser.setLastName(choice);
					  System.out.println("Success!");
					  break;
				  case "c":
					  System.out.println("Please enter the new phone number:");
					  choice = scan.nextLine();
					  editUser.setLastName(choice);
					  System.out.println("Success!");
					  break;
				  case "d":
					  users.remove(editUser.getEmail());
					  System.out.println("Success!");
					  break;
				  }
				  
			    break;
			  case "e":
				  System.out.println("Sort History by:");
				  System.out.println("1) ID");
				  System.out.println("2) Date");
				  choice = scan.nextLine();
				  	switch(choice) {
					  case "1":
						  ticket.sortByDate();
						  ticket = tickets.get(currUser.getEmail());
						  ticket.printHistory();
						  break;
					  case "2":
						  ticket.sortByDate();
						  ticket = tickets.get(currUser.getEmail());
						  ticket.printHistory();
						  break;
					  }
			    break;
			  case "f":
				  String duration = "", zone = "";
				  Boolean validChoice = true;
				  ticket = tickets.get(currUser.getEmail());
				  
				  if(ticket == null) {
					  System.out.println("You currently do not have a ticket. Please first purchase a ticket.");
				  }
				  else {
					  while(true) {
						  System.out.println("Please select the duration by choosing one of the below options (1 or 2):");
						  System.out.println("1) 2 hour");
						  System.out.println("2) All day");
						  choice = scan.nextLine();
						  switch(choice) {
						  case "1":
							  duration = "2 hour";
							  break;
						  case "2":
							  duration = "All day";
							  break;
						  default:
							  System.out.println("Please make a valid selection.");
							  validChoice = false;
						  }
						  
						  if(validChoice) {
							  break;
						  }
					  }
					  
					  while(true) {
						  System.out.println("Please select the zone by choosing one of the below options (1 or 2):");
						  System.out.println("1) zone 1");
						  System.out.println("2) zones 1 & 2");
						  choice = scan.nextLine();
						  switch(choice) {
						  case "1":
							  zone = "zone 1";
							  break;
						  case "2":
							  zone = "zones 1 & 2";
							  break;
						  default:
							  System.out.println("Please make a valid selection.");
							  validChoice = false;
						  }
						  
						  if(validChoice) {
							  break;
						  }
					  }
					  
					  ticket.buyPass(duration,  zone);
				  }
				  
				  
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
			  default:
				  System.out.println("Incorrect input, please choose one form below ");
			    break;
			  case "q":
			    System.out.println("\nThank you for using the Pep-Pep Ticket Machine");
			    System.out.println("This session is now closed");
			    scan.close();
			    System.exit(0);
			  }
	      }
	      
	  }
	  
	  public static String getMandatoryValue(String msg) {
		  Scanner scan = new Scanner(System.in);
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
