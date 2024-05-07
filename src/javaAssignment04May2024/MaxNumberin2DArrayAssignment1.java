package javaAssignment04May2024;

public class MaxNumberin2DArrayAssignment1
{
    public static void main(String[] args) {
        int maxNum=Integer.MIN_VALUE;
        int[][] arr1={{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j<arr1[i].length; j++)
            {
                 if (maxNum<arr1[i][j])
                 {
                     maxNum=arr1[i][j];
                 }

            }
        }
        System.out.println("Maximum number in the array is:"+maxNum );

    }
}
