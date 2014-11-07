public class jump_patent {
	private String patent;
	public String getPatent() {
		return patent;
	}
	public void setPatent(String patent) {
		this.patent = patent;
	}
	public String jump_patent(){
	if(getPatent()!=null&&getPatent().equals("1"))
		return "1";
	else
		return "2";
	}
}
