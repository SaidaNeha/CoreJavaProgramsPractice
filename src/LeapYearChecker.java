public class LeapYearChecker
{
    public static void main(String[] args) {
        int year = 2024;
        boolean isLeapyear = false;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeapyear = true;
        }
        if (isLeapyear)
        {
            System.out.println(year+" is leap year.");
        }else{
            System.out.println(year +" is not a leap year.");
        }
    }
}
