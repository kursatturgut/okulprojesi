package okul;

public class ��reci extends Ki�i {
	
	
private	String numara;
private	String s�n�f;


public ��reci () {
	
}


public ��reci(String adSoyad, String kimlikNo, int ya�, String numara, String s�n�f) {
	super(adSoyad, kimlikNo, ya�);
	this.numara = numara;
	this.s�n�f = s�n�f;
}



public String getNumara() {
	return numara;
}
public void setNumara(String numara) {
	this.numara = numara;
}
public String getS�n�f() {
	return s�n�f;
}
public void setS�n�f(String s�n�f) {
	this.s�n�f = s�n�f;
}


@Override
public String toString() {
	return "��reci [numara=" + numara + ", s�n�f=" + s�n�f + ", getAdSoyad()=" + getAdSoyad() + ", getKimlikNo()="
			+ getKimlikNo() + ", getYa�()=" + getYa�() + "]";
}


















	

}
