class TimeConstantsDemo {

    public static void main(String[] args) {
        final int SECONDS_IN_DAY = 24 * TimeConstants.SECONDS_IN_HOUR;
        final int SECONDS_IN_WEEK = 7 * SECONDS_IN_DAY;
        System.out.println(SECONDS_IN_DAY);
        System.out.println(SECONDS_IN_WEEK);
    }
}

final class TimeConstants {
    public static final int SECOND = 1;
    public static final int SECONDS_IN_MINUTE = 60 * SECOND;
    public static final int SECONDS_IN_HOUR = 60 * SECONDS_IN_MINUTE;
    // write your code here

    private TimeConstants() { }
}