package intro2;

public class string2 {

	public static void main(String[] args) {
//Java Ders 18 Stringler 2
		
		
		String mesaj= "bugün hava çok güzel";
        System.out.println(mesaj);

        System.out.println("eleman sayısı: "+ mesaj.length());

        System.out.println("5.eleman: " + mesaj.charAt(4));

        System.out.println(mesaj.concat("  Yaşasın!"));

        System.out.println(mesaj.startsWith("B"));

        System.out.println(mesaj.endsWith("."));


        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);

        //kaçıncı karakter olduğunu verir - baştan arar
        System.out.println(mesaj.indexOf('a'));

        //sondan başlamak için
        System.out.println(mesaj.lastIndexOf("a"));

        String yeniMesaj = mesaj.replace(' ','-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2));
        System.out.println(mesaj.substring(2,5));

        for (String kelime: mesaj.split(" ")) {
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());

        System.out.println(mesaj.trim());
    }

	}
