package lacombedulionvert;

import java.time.LocalDateTime;
import java.util.Objects;

public class Operation {
    private Money amount;
    LocalDateTime date_time;

    Operation(Money amount) {
        this.amount = amount;
    }

    public Operation(Money money_50, LocalDateTime date_time) {
        this.amount = money_50;
        this.date_time = date_time;
    }

    public int getAmount() {
        return amount.getValue();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Operation that = (Operation) o;
        return Objects.equals(amount, that.amount) &&
                Objects.equals(date_time, that.date_time);
    }
}
