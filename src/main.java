
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int toplam = 0;
        System.out.println("****************************************************");
        
        for (int i = 0; i>=0 ; i++) {
            System.out.print("Enter a Number: ");
            number = scanner.nextInt();
            if (number%2 == 1) {
                System.out.println("Toplam = "+toplam);
                break;
            }
            else{
                if (number%4 == 0) {
                    toplam = toplam+number;
                }
            }
        }
        System.out.println("****************************************************");
    }
}
