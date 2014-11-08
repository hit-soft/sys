
public class jump_ {
	private String accept;
	private String coope;
	private String funds;
	private String patent;
	private String priz;
	private String publ;
	private String software;
	private String study;
	private String team;
	public String getAccept() {
		return accept;
	}
	public void setAccept(String accept) {
		this.accept = accept;
	}
	public String getCoope() {
		return coope;
	}
	public void setCoope(String coope) {
		this.coope = coope;
	}
	public String getFunds() {
		return funds;
	}
	public void setFunds(String funds) {
		this.funds = funds;
	}
	public String getPatent() {
		return patent;
	}
	public void setPatent(String patent) {
		this.patent = patent;
	}
	public String getPriz() {
		return priz;
	}
	public void setPriz(String priz) {
		this.priz = priz;
	}
	public String getPubl() {
		return publ;
	}
	public void setPubl(String publ) {
		this.publ = publ;
	}
	public String getSoftware() {
		return software;
	}
	public void setSoftware(String software) {
		this.software = software;
	}
	public String getStudy() {
		return study;
	}
	public void setStudy(String study) {
		this.study = study;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String jump_accept(){
		if(getAccept()!=null&&getAccept().equals("1"))
			return "1";
		else
			return "2";
	}
	public String jump_coope(){
		if(getCoope()!=null&&getCoope().equals("1")){System.out.println("11111111111111");
			return "1";}
		else{System.out.println("222222222222");
			return "2";
			}
	}
	public String jump_funds(){
		if(getFunds()!=null&&getFunds().equals("1"))
			return "1";
		else
			return "2";
	}
	public String jump_patent(){
		if(getPatent()!=null&&getPatent().equals("1"))
			return "1";
		else
			return "2";
		}
	public String jump_priz(){
		if(getPriz()!=null&&getPriz().equals("1"))
			return "1";
		else
			return "2";
		}
	public String jump_publ(){
		if(getPubl()!=null&&getPubl().equals("1"))
			return "1";
		else
			return "2";
		}
	public String jump_software(){
		if(getSoftware()!=null&&getSoftware().equals("1"))
			return "1";
		else
			return "2";
		}
	public String jump_study(){
		if(getStudy()!=null&&getStudy().equals("1"))
			return "1";
		else
			return "2";
		}
	public String jump_team(){
		if(getTeam()!=null&&getTeam().equals("1"))
			return "1";
		else
			return "2";
		}
}
