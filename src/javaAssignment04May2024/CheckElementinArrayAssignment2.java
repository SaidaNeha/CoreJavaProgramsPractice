package javaAssignment04May2024;

import java.sql.SQLOutput;

public class CheckElementinArrayAssignment2
{
    public static void main(String[] args) {
        int elementtoCheck=8;
        int[][] arr1={{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j<arr1[i].length; j++)
            {
                if (arr1[i][j]==elementtoCheck)
                {
                    System.out.println(true);
                }

            }
        }
    }
}
