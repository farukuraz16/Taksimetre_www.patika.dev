import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        /*Taksimetre Programı
        Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.
                 */

        Scanner dat= new Scanner(System.in);
        System.out.println("mesafe= ");
        int yol= dat.nextInt();
        double tutar=(yol*2.20)+10;
        double odeme;
        if (tutar>=20) odeme=tutar;
        else odeme=20;

        System.out.println("odeme = " + odeme);


    }
}
