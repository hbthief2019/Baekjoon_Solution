import java.util.Scanner;

/********************************************************
 
 * StartDay : 2021. 01. 31
 * EndDay : 2021. 01. 31
 * Production : hbthief2019@hotmail.com
 * Subject :  The four fundamental arithmetic operations
 * Reference : None
 
**********************************************************/

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        System.out.printf("%d\n", A + B);
        System.out.printf("%d\n", A - B);
        System.out.printf("%d\n", A * B);
        System.out.printf("%d\n", A / B);
        System.out.printf("%d\n", A % B);
    }
}