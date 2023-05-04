import java.util.Scanner;

public class ArrayString {
    public static void main(String[] args) {
        String[][] colors = {
            {"Biru", "Warna kesukaan kamu Biru, biasanya termasuk tipe pemurung, selalu menyenangkan dan selalu bertindak pasif dalam segala hal. Selalu mengharapkan kedamaian dan ketenangan. Kamu memiliki kesulitan dalam pergaulan. Demikian pula dalam bercinta karena kamu sering sekali menyembunyikan perasaan."},
            {"Hitam", "Kamu termasuk tipe orang yang sangat lincah dalam hal-hal tertentu saja. Jika berada di lingkungan yang tidak disukai, maka kamu akan menjadi murung. Kamu selalu tampil menarik, rapi, cukup banya lawan jenis berusaha mengejar dan merebut cintamu"},
            {"Merah", "Kamu sangat berwibawa dan juga senang melindungi orang yang lemah. Walau sering kali bergaul dan bercanda, tapi kamu bisa menahan diri. Banyak orang mengatakan cinta, tapi kamu selalu berpikir dan berpikir lagi. Kamu termasuk tipe yang sulit jatuh cinta"},
            {"Hijau", "Jika warna favorit kamu hijau, maka kamu adalah tipe yang sangat romantik, menyukai keindahan, meyenangi alam dengan udara yang sejuk. Kamu adalah seseorang yang selalu memegang prinsip. Dalam hal bercinta kamu mengidam-idamkan calon teman hidup yang penuh toleransi dan dapat dipercaya"},
            {"Kuning", "Kesukaan kamu warna kuning menandakan bahwa kamu memiliki sifat optimis. Kamu tipe periang dan senang bergaul, tidak memiliki penampilan yang loyo. Sifat tolong-menolong selalu ada dalam diri kamu, karena menolong merupakan suatu kewajiban mutlak bagi kamu. Kamu orang yang tidak suka meremehkan siapapun juga, walau seseorang itu dungu atau bloon"},
            {"Putih", "Kamu adalah orang yang dilahirkan ke dunia dengan sempurna, jika menyukai warna putih banyak orang mengagumi kamu karna sifat anggun, sifat idealis dan moral kamu yang teramat tinggi. Tak pernah angkuh, senang menolong siapa saja yang membutuhkan bantuan kamu"},
            {"Ungu", "Warna ungu adalah pribadi dengan tipe yang benar-benar luar biasa. Selalu optimis, dalam menghadapi masa depan kamu tidak pernah ragu-ragu, apa yang dikerjakan kamu adlaah yang terbaik. Kamu pandai benar dalam mengikuti perkembangan jaman. Dalam bercinta, hanya merekalah yang kuat mental yang bisa mendekati dan menjadi kekasih kamu"},
        };

        Scanner input=new Scanner (System.in);
        System.out.print("Masukkan warna yang Anda sukai: ");
        String favoriteColor =input.nextLine();

        Boolean foundColor = false;
        for (String[] color : colors) {
            if (color[0].equalsIgnoreCase(favoriteColor)) {
                System.out.println("Warna kesukaan kamu " + color[0]);
                System.out.println(color[1]);
                foundColor = true;
                break;
            }
        }

        if (!foundColor) {
            System.out.println("Maaf, warna yang Anda masukkan tidak terdaftar.");
        }
    }
}


            
