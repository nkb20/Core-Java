package Enums;

public enum Year {
    Month,
    Days,
    Week,
}

 enum Day {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    private final int value;

    // Constructor to assign values to enum constants
    Day(int value) {
        this.value = value;
    }

    // Getter method to access the value of an enum constant
    public int getValue() {
        return value;
    }
}
    class main {
        public static void main(String[] args) {
            Year myobj = Year.Week;
            System.out.println(myobj);
            Day day=Day.SATURDAY;
            System.out.println(day.getValue());
        }
    }

