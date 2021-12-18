package okul;

public class Öðretmen extends Kiþi {

	
	private	String bölüm;
	private	String sicilNo;
	
	
	
	
	public Öðretmen(String adSoyad, String kimlikNo, int yaþ, String bölüm, String sicilNo) {
		super(adSoyad, kimlikNo, yaþ);
		this.bölüm = bölüm;
		this.sicilNo = sicilNo;
	}
	public Öðretmen() {
		
	}
	public String getBölüm() {
		return bölüm;
	}
	public void setBölüm(String bölüm) {
		this.bölüm = bölüm;
	}
	public String getSicilNo() {
		return sicilNo;
	}
	public void setSicilNo(String sicilNo) {
		this.sicilNo = sicilNo;
	}
	@Override
	public String toString() {
		return "Öðretmen [bölüm=" + bölüm + ", sicilNo=" + sicilNo + ", getAdSoyad()=" + getAdSoyad()
				+ ", getKimlikNo()=" + getKimlikNo() + ", getYaþ()=" + getYaþ() + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
