public class OperatorLogika {
    public static void main(String[] args) {
        boolean TPS = true;
        boolean Tes_Literasi = true;
        boolean Penalaran_Matematika = false;

        if (TPS == true && Tes_Literasi == true && Penalaran_Matematika == true) {
            System.out.println("Selamat! Anda Lulus SNBT 2023!");
        } else if (TPS == true && Tes_Literasi == false && Penalaran_Matematika == true) {
            System.out.println("Selamat! Anda Lulus SNBT 2023!");
        } else if (TPS == true && Tes_Literasi == true && Penalaran_Matematika == false) {
            System.out.println("Selamat! Anda Lulus SNBT 2023!");
        }else {
            System.out.println("Nice Try Diks");
        }
    }
}
