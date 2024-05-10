package javaAssginment07May2024;

import java.util.Scanner;

public class InputArray_Ass04
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] arr=new int[4];
        System.out.println("Enter Array numbers: ");

        for (int i = 0; i < 4; i++)
        {
            arr[i]=scan.nextInt();
        }
        System.out.print("Input Array is: {");

        for (int i = 0; i < 4; i++)
        {
            System.out.print(arr[i]+", ");
        }
        System.out.println("}");

    }
}
