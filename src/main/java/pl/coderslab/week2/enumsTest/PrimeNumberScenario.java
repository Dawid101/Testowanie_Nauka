package pl.coderslab.week2.enumsTest;

public enum PrimeNumberScenario {
    TWO(2, true),
    THREE(3, true),
    FOUR(4,false),
    FIVE(5,true),
    SIX(6,false),
    SEVEN(7,true),
    EIGHT(8,false),
    NINE(9,true),
    TEN(10,false),
    ELEVEN(11,true),
    TWELVE(12,false);

    private final int number;
    private final boolean expected;

    PrimeNumberScenario(int number, boolean expected) {
        this.number = number;
        this.expected = expected;
    }

    public int getNumber() {
        return number;
    }

    public boolean getExpected(){
        return expected;
    }

}
