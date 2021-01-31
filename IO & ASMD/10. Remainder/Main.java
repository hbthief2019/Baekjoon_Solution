import java.util.Scanner;

/*******************************************
 
 * StartDay : 2021. 01. 31
 * EndDay : 2021. 01. 31
 * Production : hbthief2019@hotmail.com
 * Subject : Remainder
 * Reference : None
 
********************************************/

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        System.out.printf("%d\n", (A+B)%C);
        System.out.printf("%d\n", ((A%C) + (B%C))%C);
        System.out.printf("%d\n", (A*B)%C);
        System.out.printf("%d\n", ((A%C) * (B%C))%C);
    }
}