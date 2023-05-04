import java.util.Arrays;
public class Array {
    public static void main (String [] args) {
        int [] angka = {23, 6, 47, 35, 2, 14};
        Arrays.sort(angka);
        System.out.println("1. Data array setelah diurutkan: ");
        for (int i: angka) {
            System.out.println(i);
        }

        double jumlah=0;
        for (int i=0; i<angka.length;i++){
            jumlah = jumlah + angka[i];
        }
        System.out.println("2. Rerata array adalah "+jumlah/angka.length);

        int max=angka[0];
        int min=angka[0];
        for (int i = 0; i < angka.length; i++) {
            if (angka[i]>max){
                max = angka[i];
            }else if(angka[i]<min){
                min = angka[i];
            }
        }
        System.out.println("3. nilai max array adalah "+max);
        System.out.println("nilai min array adalah "+min);

        System.out.println("4. Bilangan ganjil dalam array adalah ");
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] % 2 != 0) {
                System.out.println(angka[i] + " ");
            }
        }

        System.out.println("5. Bilangan prima pada array di atas adalah ");
        for (int i = 0; i < angka.length; i++) {
            boolean isPrime = true;
            for (int j = 2; j < angka[i]; j++) {
                if (angka[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(angka[i] + " ");
            }
        }
    }
}
