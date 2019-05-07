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
	  
	  public class Pass {
			
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
	  
	  public class Transaction {
			
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
	  
	  public class User {
			
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