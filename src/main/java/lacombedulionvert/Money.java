package lacombedulionvert;

public class Money {
    public int value;

    public Money(int value) {
            this.value = Math.abs(value);
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = Math.abs(value);
    }
}
