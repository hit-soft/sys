public class jump_publ {
	private String publ;
	public String getPubl() {
		return publ;
	}
	public void setPubl(String publ) {
		this.publ = publ;
	}
	public String jump_publ(){
	if(getPubl()!=null&&getPubl().equals("1"))
		return "1";
	else
		return "2";
	}
}
