
public class Skill_Details {
	private String skillName;
	private String emailid;
	public Skill_Details(String emailid,String skillName) {
		super();
		this.skillName = skillName;
		this.emailid = emailid;
		
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public Skill_Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	
	
	

}
