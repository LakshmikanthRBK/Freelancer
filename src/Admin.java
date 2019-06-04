
public class Admin {
	private String firstname;
	private String lastname;
	private String contactnumber;
	private String email;
	private String password;
	
	
	
	public Admin() {
		super();
	}



	public Admin(String firstname, String lastname, String contactnumber, String email, String password) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.contactnumber = contactnumber;
		this.email = email;
		this.password = password;
	}



	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public String getContactnumber() {
		return contactnumber;
	}



	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}
	
    
}
