package lacombedulionvert;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money that = (Money) o;
        return Objects.equals(value, that.value) ;
    }
}
