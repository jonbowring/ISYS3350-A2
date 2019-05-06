public class Ticket {

  private String id = UUID.randomUUID().toString();
  private Float credit = 0;
//  private Transaction history;
//  private User user;

  public Ticket(String id, Float credit) {
	  this.id = id;
	  this.credit = credit;
  }

}
