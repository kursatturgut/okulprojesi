package okul;

public class ��retmen extends Ki�i {

	
	private	String b�l�m;
	private	String sicilNo;
	
	
	
	
	public ��retmen(String adSoyad, String kimlikNo, int ya�, String b�l�m, String sicilNo) {
		super(adSoyad, kimlikNo, ya�);
		this.b�l�m = b�l�m;
		this.sicilNo = sicilNo;
	}
	public ��retmen() {
		
	}
	public String getB�l�m() {
		return b�l�m;
	}
	public void setB�l�m(String b�l�m) {
		this.b�l�m = b�l�m;
	}
	public String getSicilNo() {
		return sicilNo;
	}
	public void setSicilNo(String sicilNo) {
		this.sicilNo = sicilNo;
	}
	@Override
	public String toString() {
		return "��retmen [b�l�m=" + b�l�m + ", sicilNo=" + sicilNo + ", getAdSoyad()=" + getAdSoyad()
				+ ", getKimlikNo()=" + getKimlikNo() + ", getYa�()=" + getYa�() + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
