package javaAssignment04May2024;

public class DoubleTheArrayAssignment
{
    public static void main(String[] args)
    {
        int[] arr1={2,4,6,8,12,10};
        int[] arr2=new int[arr1.length];
        for (int i = 0; i < arr1.length; i++)
        {
            arr2[i]=arr1[i]*2;
            System.out.print(arr2[i]+", ");
        }

    }

}
