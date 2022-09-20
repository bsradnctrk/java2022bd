package intro2;

public class whileloop {

	public static void main(String[] args) {
		//Java Dersi 11-12 For/While Döngüsüyle Çalışmak

		for(int i=1;i<10;i++ ) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti");
		
		int i=1;
		///While
		
		while (i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While Döngüsü Bitti");
	
		///Do While Döngüsü
		int j=1;
		
		do {
			System.out.println(j);
			j+=2;
		} while (i<10);
			System.out.println("Do-While Döngüsü Bitti");
	}
	
} 
	