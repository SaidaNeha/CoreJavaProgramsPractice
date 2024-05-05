package javaAssignment04May2024;

public class TrianglePattern
{
    public static void main(String[] args) {
        int[][] arr1={{1,2,3},{4,5,6},{7,8,10}};
        int[][] arr2={{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i <= arr1.length; i++) {
            for (int j = 0; j< i; j++) {
                    System.out.print("*");
                }
            System.out.println();
        }
    }
}
