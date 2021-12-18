package okul;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class iþlemler {

	
	static List<Öðreci>öðrenciListesi=new ArrayList<>();
	static List<Öðretmen>öðretmenList=new ArrayList<>();
	static String kiþitürü;
	
	

	public static void anaMenu() {
		
		
		Scanner scan=new Scanner (System.in);
		System.out.println("................HOÞGELDÝNÝZ.............\n iþlem seçiminizi yapýnýz \n 1 öðrenci iþleri \n 2 öðretmen iþlemleri\n q çýkýþ");
	String seçim=scan.next().toLowerCase();
	
		switch (seçim) {
		case "1":
			kiþitürü="öðrenci";
			iþlemlemenu();
			break;
		case "2":
			kiþitürü="öðretmen";
			iþlemlemenu();
		case "q":
			System.out.println("proðramdan çýktýn hadi bakalým");
			break;
			
		default:
			System.out.println("geçerli tercih yapýnýz ");
			anaMenu();
			break;
		
			
		}
		
	}

	private static void iþlemmenuöðrt() {
		
		
	}

	private static void cýkýþ() {
		System.out.println("uygulamayý kullandýðýnýz için sagaolun");
		
	}

	private static void iþlemlemenu() {
		Scanner scan=new Scanner (System.in);
		System.out.println("......iþlemler......\n 0 ana menu \n 1 ekleme \n 2 arama\n 3 listeleme "
				+ "\n 4 silme");	
		System.out.println("tercýh seçiniz");
		int seçim1=scan.nextInt();
	switch (seçim1) {
	case 0 :
		
		anaMenu();
		break;
	case 1:
		ekleme();
		iþlemlemenu();
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
		System.out.println("hatalý griþ yaptýnýz");
		iþlemlemenu();
		break;
	}
	
	
	
	}

	private static void silme() {
		Scanner scan=new Scanner (System.in);
		if (kiþitürü=="öðrenci") {
			System.out.println("silmek istediðiniz  kimlik numarasýný yazýnýz ");
			String silkimlik=scan.next();
			for (Öðreci w : öðrenciListesi) {
				if (w.getKimlikNo().equalsIgnoreCase(silkimlik)) {
					öðrenciListesi.remove(w);
					System.out.println(öðrenciListesi);
					iþlemlemenu();
		} else {
			System.out.println("silinecek sýnýf bulunamadý ");
			iþlemlemenu();}
		}  }
			if (kiþitürü=="öðretmen") {
		System.out.println("silmek istediðiniz  kimlik numarasýný yazýnýz ");
		String silkimlik1=scan.next();
		for (Öðretmen w : öðretmenList) {
			if (w.getKimlikNo().equalsIgnoreCase(silkimlik1)) {
				öðretmenList.remove(w);
				System.out.println(öðretmenList);
				iþlemlemenu();
			}
		}
		}
	
	
	} 

	private static void listele() {
		if (kiþitürü=="öðrenci") {
			for (Öðreci w : öðrenciListesi) {
				System.out.println(w.toString());
			}
			iþlemlemenu();
		}
		if (kiþitürü=="öðretmen") {
			for (Öðretmen w : öðretmenList) {
				System.out.println(w.toString());
			}
			iþlemlemenu();
		}
	}

	private static void arama() {
		Scanner scan=new Scanner (System.in);
		
		if (kiþitürü=="öðrenci") {
			System.out.println("aramak istediðiniz öðrencnin kimlik no griniz ");
			String kimlNo=scan.next();
			for (Öðreci p : öðrenciListesi) {
				if (p.getKimlikNo().equalsIgnoreCase(kimlNo)) {
					System.out.println(p);
					iþlemlemenu();
				} else {
	System.out.println("bu kimliknolu öðrenci kayýtlý deðil ");
	iþlemlemenu();
				}
			}
		}
		if (kiþitürü=="öðretmen") {
			System.out.println("aramak istediðiniz  kimlik no griniz ");
			String kimlNo=scan.next();
			for (Öðretmen p :  öðretmenList) {
				if (p.getKimlikNo().equalsIgnoreCase(kimlNo)) {
					System.out.println(p);
					iþlemlemenu();
				}
		}
	} }

	private static void ekleme() {
		Scanner scan=new Scanner (System.in);
		System.out.println(" adýsoyadý grni");
		String ad=scan.nextLine();
		System.out.println(" kmliði");
		String kimlik=scan.nextLine();
		System.out.println(" yaþý");
		int yaþ=scan.nextInt();
		if (kiþitürü=="öðrenci") {
			System.out.println("öðrenci no");
			String no=scan.nextLine();
			scan.nextLine();
			System.out.println("öðrenci sýnýfý griniz");
			String sýnýfý=scan.nextLine();
			Öðreci öðrenci=new Öðreci(ad,kimlik,yaþ,no,sýnýfý);
			öðrenciListesi.add(öðrenci);
		} else {
System.out.println("öðretmenin bölümü giriniz");
String bölümm=scan.next();
System.out.println("sicilno griniz");
String sici=scan.next();
Öðretmen öðrt=new Öðretmen(ad,kimlik,yaþ,bölümm,sici);
öðretmenList.add(öðrt);



		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
