import java.util.Scanner;

/********************************************************
 
 * StartDay : 2021. 01. 31
 * EndDay : 2021. 01. 31
 * Production : hbthief2019@hotmail.com
 * Subject : Compare two values
 * Reference : None
 
**********************************************************/

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if(A > B) System.out.println(">");
        else if(A < B) System.out.println("<");
        else System.out.println("==");
    }
}