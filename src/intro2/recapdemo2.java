package intro2;

public class recapdemo2 {

	public static void main(String[] args) {
		// Java Ders 15 ReCapDemo 2

        double[] myList = {1.2, 3.4,4.3,5.6};


        double total = 0;
        double max = myList[0];

        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("toplam : " + total);
        System.out.println("en büyük: "+ max);
    }
	}
