public class jump {
	private String choose;
	public String getChoose() {
		return choose;
	}
	public void setChoose(String choose) {
		this.choose = choose;
	}
	public String jump(){
		System.out.println("²Á²Á²Á²Á²Á²Á²Á²Á²Á²Á²Á²Á²Á²Á²Á²Á²Á²Á²Á²Á²Á²Á²Á²Á²Á²Á²Á²Á²Á²Á²Á²Á²Á");
		if(getChoose()!=null&&getChoose().equals("1"))
			return "1";
		if(getChoose()!=null&&getChoose().equals("2"))
			return "2";
		if(getChoose()!=null&&getChoose().equals("3"))
			return "3";
		if(getChoose()!=null&&getChoose().equals("4"))
			return "4";
		if(getChoose()!=null&&getChoose().equals("5"))
			return "5";
		if(getChoose()!=null&&getChoose().equals("6"))
			return "6";
		if(getChoose()!=null&&getChoose().equals("7"))
			return "7";
		if(getChoose()!=null&&getChoose().equals("8"))
			return "8";
		if(getChoose()!=null&&getChoose().equals("9")){System.out.println("9");
			return "9";}
		else
			return "10";
	}
}
