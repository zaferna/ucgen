import java.util.Scanner;

public class ucgen {
    public static void main(String[] args) {
        int a,b,c,cevre;
        double u,alan;
        Scanner girdi = new Scanner(System.in);
        System.out.printf("a Degeri Giriniz :");
        a = girdi.nextInt();
        System.out.printf("b Degeri Giriniz :");
         b = girdi.nextInt();
        System.out.printf("c Degeri Giriniz :");
        c = girdi.nextInt();
        cevre = a+b+c;
        u = cevre/2;
        alan =Math.sqrt(u * (u-a )* (u-b)* (u-c));
        System.out.print(alan);



    }
}
