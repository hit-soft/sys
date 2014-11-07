
public class jump_funds {
	private String funds;
	public String getFunds() {
		return funds;
	}
	public void setFunds(String funds) {
		this.funds = funds;
	}
	public String jump_funds(){
		if(getFunds()!=null&&getFunds().equals("1"))
			return "1";
		else
			return "2";
	}
}
