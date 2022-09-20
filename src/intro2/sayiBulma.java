package intro2;

public class sayiBulma {

	public static void main(String[] args) {
		// Java Dersi 23 Sayı Bulma
		int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = 11;

        boolean varMi=false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi=true;
                break;
            }
        }

        if (varMi == true) {
            System.out.println("Sayı mevcut");
        }else{
            System.out.println("Sayı mevcut değil");
        }
    }

	}

