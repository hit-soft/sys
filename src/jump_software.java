public class jump_software {
	private String software;
	public String getSoftware() {
		return software;
	}
	public void setSoftware(String software) {
		this.software = software;
	}
	public String jump_software(){
	if(getSoftware()!=null&&getSoftware().equals("1")){
		System.out.println("dsa1");
		return "1";
	}
	else{
		System.out.println("dsa2");
		return "2";
	}
	}
}
