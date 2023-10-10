class Leap {

    boolean isLeapYear(int year) {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

}
