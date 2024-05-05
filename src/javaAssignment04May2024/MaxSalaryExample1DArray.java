package javaAssignment04May2024;

public class MaxSalaryExample1DArray
{
    public static void main(String[] args)
    {
        int max_salary= Integer.MIN_VALUE;
        int[] array = {4, 7, 38, 5, 10};
        for (int i = 0; i < array.length; i++)
        {
            if (array[i]>max_salary)
            {
                max_salary=array[i];
            }
        }
        System.out.println("Max Salary is :"+max_salary);
    }
}
