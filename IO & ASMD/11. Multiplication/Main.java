import java.util.Scanner;

/*******************************************************************************
 
 * StartDay : 2021. 01. 31
 * EndDay : 2021. 01. 31
 * Production : hbthief2019@hotmail.com
 * Subject : Multiplication
 * Reference : None
 
********************************************************************************/

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int firstCarry = A * (B%10);
        int secondCarry = A * ((B%100) / 10);
        int thirdCarry = A * (B/100);

        System.out.printf("%d\n", firstCarry);
        System.out.printf("%d\n", secondCarry);
        System.out.printf("%d\n", thirdCarry);
        System.out.printf("%d\n", A * B);
    }
}