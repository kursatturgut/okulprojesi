package okul;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class i�lemler {

	
	static List<��reci>��renciListesi=new ArrayList<>();
	static List<��retmen>��retmenList=new ArrayList<>();
	static String ki�it�r�;
	
	

	public static void anaMenu() {
		
		
		Scanner scan=new Scanner (System.in);
		System.out.println("................HO�GELD�N�Z.............\n i�lem se�iminizi yap�n�z \n 1 ��renci i�leri \n 2 ��retmen i�lemleri\n q ��k��");
	String se�im=scan.next().toLowerCase();
	
		switch (se�im) {
		case "1":
			ki�it�r�="��renci";
			i�lemlemenu();
			break;
		case "2":
			ki�it�r�="��retmen";
			i�lemlemenu();
		case "q":
			System.out.println("pro�ramdan ��kt�n hadi bakal�m");
			break;
			
		default:
			System.out.println("ge�erli tercih yap�n�z ");
			anaMenu();
			break;
		
			
		}
		
	}

	private static void i�lemmenu��rt() {
		
		
	}

	private static void c�k��() {
		System.out.println("uygulamay� kulland���n�z i�in sagaolun");
		
	}

	private static void i�lemlemenu() {
		Scanner scan=new Scanner (System.in);
		System.out.println("......i�lemler......\n 0 ana menu \n 1 ekleme \n 2 arama\n 3 listeleme "
				+ "\n 4 silme");	
		System.out.println("terc�h se�iniz");
		int se�im1=scan.nextInt();
	switch (se�im1) {
	case 0 :
		
		anaMenu();
		break;
	case 1:
		ekleme();
		i�lemlemenu();
		break;
	case 2:
		arama();
		break;
	case 3:
		listele();
		break;
	case 4 :
		silme ();
		break;
	default:
		System.out.println("hatal� gri� yapt�n�z");
		i�lemlemenu();
		break;
	}
	
	
	
	}

	private static void silme() {
		Scanner scan=new Scanner (System.in);
		if (ki�it�r�=="��renci") {
			System.out.println("silmek istedi�iniz  kimlik numaras�n� yaz�n�z ");
			String silkimlik=scan.next();
			for (��reci w : ��renciListesi) {
				if (w.getKimlikNo().equalsIgnoreCase(silkimlik)) {
					��renciListesi.remove(w);
					System.out.println(��renciListesi);
					i�lemlemenu();
		} else {
			System.out.println("silinecek s�n�f bulunamad� ");
			i�lemlemenu();}
		}  }
			if (ki�it�r�=="��retmen") {
		System.out.println("silmek istedi�iniz  kimlik numaras�n� yaz�n�z ");
		String silkimlik1=scan.next();
		for (��retmen w : ��retmenList) {
			if (w.getKimlikNo().equalsIgnoreCase(silkimlik1)) {
				��retmenList.remove(w);
				System.out.println(��retmenList);
				i�lemlemenu();
			}
		}
		}
	
	
	} 

	private static void listele() {
		if (ki�it�r�=="��renci") {
			for (��reci w : ��renciListesi) {
				System.out.println(w.toString());
			}
			i�lemlemenu();
		}
		if (ki�it�r�=="��retmen") {
			for (��retmen w : ��retmenList) {
				System.out.println(w.toString());
			}
			i�lemlemenu();
		}
	}

	private static void arama() {
		Scanner scan=new Scanner (System.in);
		
		if (ki�it�r�=="��renci") {
			System.out.println("aramak istedi�iniz ��rencnin kimlik no griniz ");
			String kimlNo=scan.next();
			for (��reci p : ��renciListesi) {
				if (p.getKimlikNo().equalsIgnoreCase(kimlNo)) {
					System.out.println(p);
					i�lemlemenu();
				} else {
	System.out.println("bu kimliknolu ��renci kay�tl� de�il ");
	i�lemlemenu();
				}
			}
		}
		if (ki�it�r�=="��retmen") {
			System.out.println("aramak istedi�iniz  kimlik no griniz ");
			String kimlNo=scan.next();
			for (��retmen p :  ��retmenList) {
				if (p.getKimlikNo().equalsIgnoreCase(kimlNo)) {
					System.out.println(p);
					i�lemlemenu();
				}
		}
	} }

	private static void ekleme() {
		Scanner scan=new Scanner (System.in);
		System.out.println(" ad�soyad� grni");
		String ad=scan.nextLine();
		System.out.println(" kmli�i");
		String kimlik=scan.nextLine();
		System.out.println(" ya��");
		int ya�=scan.nextInt();
		if (ki�it�r�=="��renci") {
			System.out.println("��renci no");
			String no=scan.nextLine();
			scan.nextLine();
			System.out.println("��renci s�n�f� griniz");
			String s�n�f�=scan.nextLine();
			��reci ��renci=new ��reci(ad,kimlik,ya�,no,s�n�f�);
			��renciListesi.add(��renci);
		} else {
System.out.println("��retmenin b�l�m� giriniz");
String b�l�mm=scan.next();
System.out.println("sicilno griniz");
String sici=scan.next();
��retmen ��rt=new ��retmen(ad,kimlik,ya�,b�l�mm,sici);
��retmenList.add(��rt);



		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
