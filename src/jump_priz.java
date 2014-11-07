public class jump_priz {
	private String priz;
	public String getPriz() {
		return priz;
	}
	public void setPriz(String priz) {
		this.priz = priz;
	}
	public String jump_priz(){
	if(getPriz()!=null&&getPriz().equals("1"))
		return "1";
	else
		return "2";
	}
}
