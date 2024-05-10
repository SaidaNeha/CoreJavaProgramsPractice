package javaAssginment07May2024;

public class PrintDiagonalElement_Ass05 {
    public static void main(String[] args) {

        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int row = arr.length;
        int col = arr[0].length;
        System.out.println("Main Diagnoal is:");

        for (int i = 0; i < row && i < col; i++) {
            System.out.print(arr[i][i] + " ");
        }
        System.out.println();
        System.out.println("Second diagonal is :");
        for (int i = 0; i < row && i < col; i++) {
            System.out.print(arr[i][col - i - 1] + " ");
        }
        System.out.println();
    }
}
