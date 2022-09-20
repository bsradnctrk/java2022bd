package intro2;

public class switchDemo {
	public static void main(String[] args) {

///Java Dersi 10 Switch Bloklarıyla Çalışmak

	char grade = 'A';

	switch(grade)
	{
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok Güzel : Geçtiniz");
		case 'C':
			System.out.println("İyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Değil : Geçtiniz");
		case 'F':
			System.out.println("Maalesef Kaldınız");
			break;
			
			default:
			System.out.println("Geçersiz Not Girdiniz");
	  }
}
}