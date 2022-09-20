package intro2;

public class mukemmelSayi {

	public static void main(String[] args) {
/// Java Dersi 21 Mükemmel Sayilar
/// 6 ---> 1,2,3 e bölünür toplamları 6
/// 28--->1,2,4,7,14
		
		
		int number =5;
		int total = 0;
		
		for (int i=1;i<number;i++) {
			if (number % i ==0) {
				total = total+i;
				
			}
		}
		
		if (total == number ) {
			System.out.println("Mükemmel Sayıdır");
		} else {
			System.out.println("Mükemmel Sayı Değildir");
		}
	}
	

}
