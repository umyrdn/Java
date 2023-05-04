import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

          String bangun_datar;
          Scanner scan = new Scanner(System.in);

          System.out.println("Masukkan nama bangun datar: (diawali huruf kapital)");
          bangun_datar= scan.nextLine();

          switch(bangun_datar) {
            case "Segitiga":
                System.out.println("Memiliki tiga sisi dan tiga sudut.");
                break;
            case "Persegi":
                System.out.println("Memiliki empat sisi yang sama panjang, keempat sudutnya sama besar dan merupakan sudut siku-siku, serta kedua diagonalnya berpotongan dan sama panjang.");
                break;
            case "Persegi panjang":
                System.out.println("Memiliki dua pasang sisi yang sama panjang, keempat sudutnya sama besar dan merupakan sudut siku-siku, serta kedua diagonalnya berpotongan dan sama panjang.");
                break;
            case "Trapesium":
                System.out.println("Memiliki sepasang sisi yang berhadapan dan sejajar, dan memiliki empat sudut.");
                break;
            case "Jajar genjang":
                System.out.println("Memiliki dua pasang sisi berhadapan sama panjang dan sejajar, sudut yang berhadapan sama besar, dan diagonal-diagonalnya saling membagi dua.");
                break;
            case "Belah ketupat":
                System.out.println("Memiliki sisi yang sama panjang, sudut yang berhadapan sama besar, serta kedua diagonalnya saling berpotongan tegak lurus dan membagi dua sama panjang.");
                break;
            case "Layang-layang":
                System.out.println("Memiliki kedua pasang sisi yang berdekatan sama panjang, sepasang sudut yang sama besar, serta kedua diagonalnya saling berpotongan tegak lurus.");
                break;
            case "Lingkaran":
                System.out.println("Tidak memiliki titik sudut, hanya memiliki satu sisi, mempunyai simetri lipat dan putar tidak terbatas, serta jarak antara titik pusat dan sisi manapun selalu sama.");
                break;
            default:
                System.out.println("Data tidak ditemukan, program dihentikan.");
        }
    }
}
