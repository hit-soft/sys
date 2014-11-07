public class jump_study {
	private String study;
	public String getStudy() {
		return study;
	}
	public void setStudy(String study) {
		this.study = study;
	}
	public String jump_study(){
	if(getStudy()!=null&&getStudy().equals("1"))
		return "1";
	else
		return "2";
	}
}
