public class EnumsExamples {

    enum Days {
        SATURDAY, SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
    }

    enum Status {
        ACTIVE, INACTIVE, BLOCKED
    }

    public static void run() {
        Days today = Days.SATURDAY;
        Status accountStatus = Status.ACTIVE;

        System.out.println("Today is: " + today);
        System.out.println("Account status: " + accountStatus);
    }
}
