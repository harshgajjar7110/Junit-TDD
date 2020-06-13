public class leapYear {

    public static void main(String[] args) {

        leapYear leapYear = new leapYear();
        System.out.println(leapYear.isLeapYear(2016));
    }

    public boolean isLeapYear(int year) {

        return (year % 100 == 0) ? (year % 400 == 0) : (year % 4 == 0);
    }
}