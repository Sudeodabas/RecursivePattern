
import java.util.Scanner;
public class Pattern {
        static void Extraction(int a, boolean increasing) {
            if (a <= 0) {
                System.out.print(a + " ");
            } else {
                System.out.print(a + " ");
                if (increasing) {
                    Extraction(a - 5, true);
                } else {
                    Extraction(a - 5, false);
                }
                System.out.print(a + " ");
            }
        }


    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int a =inp.nextInt();
        Extraction( a , true );
    }
}