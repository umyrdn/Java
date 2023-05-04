import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {

        String goldar_anda, goldar_ibu, goldar_bapak;
        Scanner scan = new Scanner(System.in);

        System.out.println("Apa golongan darah anda?");
        goldar_anda = scan.nextLine();
        System.out.println("Apa golongan darah ibu anda?");
        goldar_ibu= scan.nextLine();
        System.out.println("Apa golongan darah bapak anda?");
        goldar_bapak = scan.nextLine();

        // gen goldar ibu dan bapak heterozigot
        if (goldar_anda.equalsIgnoreCase("a")) {
            if (goldar_ibu.equalsIgnoreCase("a")) {
                if (goldar_bapak.equalsIgnoreCase("a")) {
                    System.out.println("Anda anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("b")) {
                    System.out.println("Anda anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("o")) {
                    System.out.println("Anda anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("ab")) {
                    System.out.println("Anda anak kandung");
                } else {
                    System.out.println("Anda bukan anak manusia");
                }        
            } else if (goldar_ibu.equalsIgnoreCase("b")) {
                if (goldar_bapak.equalsIgnoreCase("a")) {
                    System.out.println("Anda anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("b")) {
                    System.out.println("Anda bukan anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("o")) {
                    System.out.println("Anda bukan anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("ab")) {
                    System.out.println("Anda anak kandung");
                } else {
                    System.out.println("Anda bukan anak manusia");
                }   
            } else if (goldar_ibu.equalsIgnoreCase("o")) {
                if (goldar_bapak.equalsIgnoreCase("a")) {
                    System.out.println("Anda anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("b")) {
                    System.out.println("Anda bukan anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("o")) {
                    System.out.println("Anda bukan anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("ab")) {
                    System.out.println("Anda anak kandung");
                } else {
                    System.out.println("Anda bukan anak manusia");
                }  
            } else if (goldar_ibu.equalsIgnoreCase("ab")) {
                if (goldar_bapak.equalsIgnoreCase("a")) {
                    System.out.println("Anda anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("b")) {
                    System.out.println("Anda anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("o")) {
                    System.out.println("Anda anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("ab")) {
                    System.out.println("Anda anak kandung");
                } else {
                    System.out.println("Anda bukan anak manusia");
                }
            } else {
                System.out.println("Anda bukan anak manusia");
            }
        } else if (goldar_anda.equalsIgnoreCase("b")) {
            if (goldar_ibu.equalsIgnoreCase("a")) {
                if (goldar_bapak.equalsIgnoreCase("a")) {
                    System.out.println("Anda bukan anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("b")) {
                    System.out.println("Anda anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("o")) {
                    System.out.println("Anda bukan anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("ab")) {
                    System.out.println("Anda anak kandung");
                } else {
                    System.out.println("Anda bukan anak manusia");
                }        
            } else if (goldar_ibu.equalsIgnoreCase("b")) {
                if (goldar_bapak.equalsIgnoreCase("a")) {
                    System.out.println("Anda anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("b")) {
                    System.out.println("Anda anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("o")) {
                    System.out.println("Anda anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("ab")) {
                    System.out.println("Anda anak kandung");
                } else {
                    System.out.println("Anda bukan anak manusia");
                }   
            } else if (goldar_ibu.equalsIgnoreCase("o")) {
                if (goldar_bapak.equalsIgnoreCase("a")) {
                    System.out.println("Anda bukan anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("b")) {
                    System.out.println("Anda anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("o")) {
                    System.out.println("Anda bukan anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("ab")) {
                    System.out.println("Anda anak kandung");
                } else {
                    System.out.println("Anda bukan anak manusia");
                }  
            } else if (goldar_ibu.equalsIgnoreCase("ab")) {
                if (goldar_bapak.equalsIgnoreCase("a")) {
                    System.out.println("Anda anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("b")) {
                    System.out.println("Anda anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("o")) {
                    System.out.println("Anda anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("ab")) {
                    System.out.println("Anda anak kandung");
                } else {
                    System.out.println("Anda bukan anak manusia");
                }
            } else {
                System.out.println("Anda bukan anak manusia");
            }
        } else if (goldar_anda.equalsIgnoreCase("o")) {
            if (goldar_ibu.equalsIgnoreCase("a")) {
                if (goldar_bapak.equalsIgnoreCase("a")) {
                    System.out.println("Anda anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("b")) {
                    System.out.println("Anda anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("o")) {
                    System.out.println("Anda anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("ab")) {
                    System.out.println("Anda bukan anak kandung");
                } else {
                    System.out.println("Anda bukan anak manusia");
                }        
            } else if (goldar_ibu.equalsIgnoreCase("b")) {
                if (goldar_bapak.equalsIgnoreCase("a")) {
                    System.out.println("Anda anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("b")) {
                    System.out.println("Anda anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("o")) {
                    System.out.println("Anda anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("ab")) {
                    System.out.println("Anda bukan anak kandung");
                } else {
                    System.out.println("Anda bukan anak manusia");
                }   
            } else if (goldar_ibu.equalsIgnoreCase("o")) {
                if (goldar_bapak.equalsIgnoreCase("a")) {
                    System.out.println("Anda anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("b")) {
                    System.out.println("Anda anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("o")) {
                    System.out.println("Anda anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("ab")) {
                    System.out.println("Anda bukan anak kandung");
                } else {
                    System.out.println("Anda bukan anak manusia");
                }  
            } else if (goldar_ibu.equalsIgnoreCase("ab")) {
                System.out.println("Anda bukan anak kandung ibu");
            } else {
                System.out.println("Anda bukan anak manusia");
            }
        } else if (goldar_anda.equalsIgnoreCase("ab")) {
            if (goldar_ibu.equalsIgnoreCase("a")) {
                if (goldar_bapak.equalsIgnoreCase("a")) {
                    System.out.println("Anda bukan anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("b")) {
                    System.out.println("Anda anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("o")) {
                    System.out.println("Anda bukan anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("ab")) {
                    System.out.println("Anda anak kandung");
                } else {
                    System.out.println("Anda bukan anak manusia");
                }        
            } else if (goldar_ibu.equalsIgnoreCase("b")) {
                if (goldar_bapak.equalsIgnoreCase("a")) {
                    System.out.println("Anda anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("b")) {
                    System.out.println("Anda bukan anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("o")) {
                    System.out.println("Anda bukan anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("ab")) {
                    System.out.println("Anda anak kandung");
                } else {
                    System.out.println("Anda bukan anak manusia");
                }   
            } else if (goldar_ibu.equalsIgnoreCase("o")) {
                if (goldar_bapak.equalsIgnoreCase("a")) {
                    System.out.println("Anda bukan anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("b")) {
                    System.out.println("Anda bukan anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("o")) {
                    System.out.println("Anda bukan anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("ab")) {
                    System.out.println("Anda bukan anak kandung");
                } else {
                    System.out.println("Anda bukan anak manusia");
                }
            } else if (goldar_ibu.equalsIgnoreCase("ab")) {
                if (goldar_bapak.equalsIgnoreCase("a")) {
                    System.out.println("Anda anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("b")) {
                    System.out.println("Anda anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("o")) {
                    System.out.println("Anda bukan anak kandung");
                } else if (goldar_bapak.equalsIgnoreCase("ab")) {
                    System.out.println("Anda anak kandung");
                } else {
                    System.out.println("Anda bukan anak manusia");
                }
            } else {
                System.out.println("Anda bukan anak manusia");
            }
        } else {
            System.out.println("Anda anak alien");      
        }
    }
}
