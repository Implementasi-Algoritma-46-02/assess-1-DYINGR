import java.util.Scanner;

public class Soal01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int C = scanner.nextInt();
    int D = scanner.nextInt();
    int E = scanner.nextInt();

    System.out.println(identifikasi(A));
    System.out.println(identifikasi(B));
    System.out.println(identifikasi(C));
    System.out.println(identifikasi(D));
    System.out.println(identifikasi(E));
    
   scanner.close();
    }

    public static String identifikasi(int bilangan){
        int P1 = bilangan/100;
        int P2 = bilangan/10%10;
        int P3 = bilangan%10;
        String valid = "";
        boolean tesSama = (P1!=P2)&&(P2!=P3)&&(P3!=P1);
        boolean tesBesar = (P1<P2)&&(P2<P3);
        boolean tesGanjil = (P3 % 2 == 1);
        
        if (tesSama&&tesBesar&&tesGanjil) {
            System.out.println("Valid");
        } else {
            System.out.println("Tidak Valid");
        }
        return String.format("%d %s", bilangan, valid);
        }
    }
        
