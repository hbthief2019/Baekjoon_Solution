import java.util.Scanner;

/********************************************************
 
 * StartDay : 2021. 01. 31
 * EndDay : 2021. 01. 31
 * Production : hbthief2019@hotmail.com
 * Subject :  Leap year
 * Reference : None
 
**********************************************************/

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int years = sc.nextInt();

        if(years % 400 == 0) System.out.println(1);
        else if(years % 4 == 0 && years % 100 != 0) System.out.println(1);
        else System.out.println(0);
    }
}