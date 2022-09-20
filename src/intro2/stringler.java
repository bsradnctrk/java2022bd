package intro2;

public class stringler {

	public static void main(String[] args) {
		// Java Der 17 Stringlerle Çalışmak
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

    }

	}

