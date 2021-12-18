package okul;

public class Öðreci extends Kiþi {
	
	
private	String numara;
private	String sýnýf;


public Öðreci () {
	
}


public Öðreci(String adSoyad, String kimlikNo, int yaþ, String numara, String sýnýf) {
	super(adSoyad, kimlikNo, yaþ);
	this.numara = numara;
	this.sýnýf = sýnýf;
}



public String getNumara() {
	return numara;
}
public void setNumara(String numara) {
	this.numara = numara;
}
public String getSýnýf() {
	return sýnýf;
}
public void setSýnýf(String sýnýf) {
	this.sýnýf = sýnýf;
}


@Override
public String toString() {
	return "Öðreci [numara=" + numara + ", sýnýf=" + sýnýf + ", getAdSoyad()=" + getAdSoyad() + ", getKimlikNo()="
			+ getKimlikNo() + ", getYaþ()=" + getYaþ() + "]";
}


















	

}
