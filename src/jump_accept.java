public class jump_accept {
	private String accept;
	public String getAccept() {
		return accept;
	}
	public void setAccept(String accept) {
		this.accept = accept;
	}
	public String jump_accept(){
		if(getAccept()!=null&&getAccept().equals("1"))
			return "1";
		else
			return "2";
	}
}