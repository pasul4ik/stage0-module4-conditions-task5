package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        switch (year) {
            case 1:
                System.out.println(365);
                break;

            case 2 :
                System.out.println(366);
        }


    }
}
