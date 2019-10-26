package lacombedulionvert;

public class Money {
    public static int value;

    public Money(int value) {
            this.value = Math.abs(value);
    }

    public static int getValue() {
        return value;
    }

    public static void setValue(int value) {
        Money.value = Math.abs(value);
    }
}
