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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money that = (Money) o;
        return Objects.equals(value, that.value) ;
    }

    @Override
    public String toString() {
        return "Money value is " + value + ".";
    }
}
