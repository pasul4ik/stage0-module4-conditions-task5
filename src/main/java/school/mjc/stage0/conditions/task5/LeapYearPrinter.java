package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        switch (year) {
            case 365:
                System.out.println("not leap");
                break;

            case 366 :
                System.out.println("leap");
        }


    }
}
