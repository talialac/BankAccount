package lacombedulionvert;

import java.time.LocalDateTime;
import java.util.Objects;

public class Operation {
    private Money amount;
    LocalDateTime date_time;

    public Operation(Money amount) {
        this.amount = amount;
        this.date_time = LocalDateTime.now();
    }

    public Operation(Money money_50, LocalDateTime date_time) {
        this.amount = money_50;
        this.date_time = date_time;
    }

    public int getAmount() {
        return amount.getValue();
    }

    /*public String getDateValue() {
        return this.date_time.getYear() + "-"+ this.date_time.getMonthValue() + "-" + this.date_time.getDayOfMonth()
                + " " + this.date_time.getHour() + "h" + this.date_time.getMinute();;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Operation that = (Operation) o;
        return Objects.equals(amount, that.amount) &&
                Objects.equals(date_time, that.date_time);
    }

    public LocalDateTime getDate() {
        return date_time;
    }
}
