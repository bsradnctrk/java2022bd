package intro2;

public class CokBoyutluDiziler {

	public static void main(String[] args) {
// Java DErs 16 Çok Boyutlu Dizeler
		String[][] sehirler = new String[3][3];
		sehirler[0][0] = "istanbul";
        sehirler[0][1] = "Ankara";
        sehirler[0][2] = "Düzce";
        sehirler[1][0] = "Kırşehir";
        sehirler[1][1] = "Çorum";
        sehirler[1][2] = "Maraş";
        sehirler[2][0] = "mersin";
        sehirler[2][1] = "tokat";
        sehirler[2][2] = "yozgat";

        for (int i = 0; i <= 2; i++) {

            System.out.println("---------------");

            for (int j = 0; j <= 2; j++)
            {
                System.out.println(sehirler[i][j]);
            }
        }
    }

	}


