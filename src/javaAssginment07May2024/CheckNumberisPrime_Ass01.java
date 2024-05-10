package javaAssginment07May2024;

import java.util.Scanner;

public class CheckNumberisPrime_Ass01
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number for checking if it's prime: ");
        int check_num=scan.nextInt();
        scan.close();
        boolean isPrime=check_num>1;
        for (int i = 2; i*i <=check_num ; i++)
        {
            if (check_num%i==0)
        {
            isPrime=false;
            System.out.println(check_num+" is not prime Number");
            break;
        }
        }
        if (isPrime)
         {
            System.out.println(check_num+" is a prime number");
        }
    }

}
