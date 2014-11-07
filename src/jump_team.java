public class jump_team {
	private String team;
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String jump_team(){
	if(getTeam()!=null&&getTeam().equals("1"))
		return "1";
	else
		return "2";
	}
}
