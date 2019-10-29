package lacombedulionvert;

import java.util.Objects;

public class Money {
    private int value;

    Money(int value) {
        this.value = Math.abs(value);
    }

    int getValue() {
        return this.value;
    }

    void setValue(int value) {
        this.value = Math.abs(value);
    }

    public int add(int toAdd) {
        return this.value + toAdd;
    }

    public void addVoid(int toAdd) {
        this.value += toAdd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money that = (Money) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public String toString() {
        return "Money value is " + value + ".";
    }

    public void valueOf(Money amount) {
        new Money(amount.getValue());
    }
}
