public class jump_prize {
	private String prize;
	public String getPrize() {
		return prize;
	}
	public void setPrize(String prize) {
		this.prize = prize;
	}
	public String jump_prize(){
	if(getPrize()!=null&&getPrize().equals("1"))
		return "1";
	else
		return "2";
	}
}
