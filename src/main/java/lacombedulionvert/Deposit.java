package lacombedulionvert;

import java.time.LocalDateTime;
import java.util.Objects;

public class Deposit {
    private Money amount;
    private Money balance;
    private LocalDateTime date_time;

    Deposit(Money amount) {
        this.amount = amount;
        this.date_time = LocalDateTime.now();
        balance = new Money(0);
    }

    int getAmount() {
        return amount.getValue();
    }

    String getDateValue() {
        return this.date_time.getYear() + "-"+ this.date_time.getMonthValue() + "-" + this.date_time.getDayOfMonth()
                + " " + this.date_time.getHour() + "h" + this.date_time.getMinute();
    }

    LocalDateTime getDate() {
        return date_time;
    }

    public Money getBalance() {
        return balance;
    }

    public int getBalanceValue() {
        return balance.getValue();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deposit that = (Deposit) o;
        return Objects.equals(amount, that.amount) &&
                Objects.equals(date_time, that.date_time);
    }

    void calculateBalance(Money amount_in_account) {
        int addition = amount_in_account.getValue() + this.amount.getValue();
        this.balance.setValue(addition);
    }

}
