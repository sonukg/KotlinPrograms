package Java;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int yr= sc.nextInt();
        if (yr%4==0 && yr%100!=0){
            System.out.println("Leap Year");
        }/*else if (yr%100==0 && yr%400==0){
            System.out.println("Leap Year");
        }else if (yr%400==0){
            System.out.println("Leap Year");
        }*/else {
            System.out.println("Not Leap year");
        }
    }
}
