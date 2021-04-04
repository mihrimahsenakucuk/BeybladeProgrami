import java.util.Scanner;

public class Test {

    public static void main(String args[]) {

        System.out.println("Beyblade programına hoş geldiniz");
        System.out.println("Çıkış için Q'ya basınınız");

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Hangi Beyblade'i üretmek istiyorsunuz?");
            String islem = scan.nextLine();
            if (islem.equals("Q")) {
                System.out.println("Programdan Çıkılıyor...");
                break;
            } else {

                BeybladeFabrikasi fabrika = new BeybladeFabrikasi();

                Beyblade beyblade = fabrika.beybladeUret(islem);

                if (beyblade == null) {
                    System.out.println("Lütfen geçerli bir beyblade ismi giriniz");
                } else {
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();

                }

            }


        }


    }
}