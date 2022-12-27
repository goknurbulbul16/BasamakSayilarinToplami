import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, toplam = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        a = input.nextInt();

        while (a != 0){
           toplam +=  a % 10;
           a /= 10;
        }
        System.out.println("Sayının basamaklarının toplamı: "+toplam);


    }
}