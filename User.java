
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
