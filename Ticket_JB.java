import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Ticket_JB {

  private String id;
  private Float credit;
  private User user;
  private ArrayList<Transaction> history;

  public Ticket_JB(User user) {
	  this.history = new ArrayList<Transaction>();
	  this.id = UUID.randomUUID().toString();
	  this.credit = (float) 0;
	  this.user = user;
  }
  
  public void buyPass(String duration, String zone) {
	  // TODO validate credit before adding a transaction to the history
	  history.add(new Transaction(duration, zone));
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
