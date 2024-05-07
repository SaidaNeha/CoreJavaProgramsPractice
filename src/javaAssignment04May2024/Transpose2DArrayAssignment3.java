package javaAssignment04May2024;

public class Transpose2DArrayAssignment3
{
    public static void main(String[] args) {

        int[][] arr1={{1, 4, 7},{2, 5, 8},{3, 6, 9}};
        int[][] arr2=new int[3][3];
          for (int i = 0; i < 3; i++) {
              for (int j = 0; j < 3; j++) {
                  arr2[i][j] = arr1[j][i];
                  System.out.print(arr2[i][j]+" ");
              }
              System.out.println();
          }
    }
}
