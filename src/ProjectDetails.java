
public class ProjectDetails {
	
	private String projecttitle;
	private String projectduration;
	private String skillset1;
	private String skillset2;
	private String skillset3;
	private String skillset4;
	private String skillset5;
	private String skillset6;
	private String skillset7;
	private String skillset8;
	private String skillset9;
	private String skillset10;
	private String remarks;
	private int projectid;
	private int adminid;
	public ProjectDetails() {
		super();
//TODO Auto-generated constructor stub
	}
	public ProjectDetails(String projecttitle, String projectduration, String skillset1, String skillset2,
			String skillset3, String skillset4, String skillset5, String skillset6, String skillset7, String skillset8,
			String skillset9, String skillset10, String remarks,int projectid,int adminid) {
		super();
		//this.id=id;
		this.projecttitle = projecttitle;
		this.projectduration = projectduration;
		this.skillset1 = skillset1;
		this.skillset2 = skillset2;
		this.skillset3 = skillset3;
		this.skillset4 = skillset4;
		this.skillset5 = skillset5;
		this.skillset6 = skillset6;
		this.skillset7 = skillset7;
		this.skillset8 = skillset8;
		this.skillset9 = skillset9;
		this.skillset10 = skillset10;
		this.remarks = remarks;
		this.projectid= projectid;
		this.adminid=adminid;
		
	}
	
	
	public int getProjectid() {
		return projectid;
	}
	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}
	public int getAdminid() {
		return adminid;
	}
	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}
	public String getProjecttitle() {
		return projecttitle;
	}
	public void setProjecttitle(String projecttitle) {
		this.projecttitle = projecttitle;
	}
	public String getProjectduration() {
		return projectduration;
	}
	public void setProjectduration(String projectduration) {
		this.projectduration = projectduration;
	}
	public String getSkillset1() {
		return skillset1;
	}
	public void setSkillset1(String skillset1) {
		this.skillset1 = skillset1;
	}
	public String getSkillset2() {
		return skillset2;
	}
	public void setSkillset2(String skillset2) {
		this.skillset2 = skillset2;
	}
	public String getSkillset3() {
		return skillset3;
	}
	public void setSkillset3(String skillset3) {
		this.skillset3 = skillset3;
	}
	public String getSkillset4() {
		return skillset4;
	}
	public void setSkillset4(String skillset4) {
		this.skillset4 = skillset4;
	}
	public String getSkillset5() {
		return skillset5;
	}
	public void setSkillset5(String skillset5) {
		this.skillset5 = skillset5;
	}
	public String getSkillset6() {
		return skillset6;
	}
	public void setSkillset6(String skillset6) {
		this.skillset6 = skillset6;
	}
	public String getSkillset7() {
		return skillset7;
	}
	public void setSkillset7(String skillset7) {
		this.skillset7 = skillset7;
	}
	public String getSkillset8() {
		return skillset8;
	}
	public void setSkillset8(String skillset8) {
		this.skillset8 = skillset8;
	}
	public String getSkillset9() {
		return skillset9;
	}
	public void setSkillset9(String skillset9) {
		this.skillset9 = skillset9;
	}
	public String getSkillset10() {
		return skillset10;
	}
	public void setSkillset10(String skillset10) {
		this.skillset10 = skillset10;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	

}
