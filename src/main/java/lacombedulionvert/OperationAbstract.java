package lacombedulionvert;

import java.time.LocalDateTime;
import java.util.Objects;

public abstract class OperationAbstract {
    Money amount;
    LocalDateTime date_time;
    Money balance;

    OperationAbstract(Money amount) {
        this.amount = amount;
        this.date_time = LocalDateTime.now();
        balance = new Money(0);
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    int getAmount() {
        return amount.getValue();
    }

    String getDateValue() {
        return this.date_time.getYear() + "-" + this.date_time.getMonthValue() + "-" + this.date_time.getDayOfMonth()
                + " " + this.date_time.getHour() + "h" + this.date_time.getMinute();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OperationAbstract that = (OperationAbstract) o;
        return Objects.equals(amount, that.amount) &&
                Objects.equals(date_time, that.date_time);
    }

    public abstract void calculBalance(Money amount_in_account);
    public abstract String infosOperation();

    int getBalanceValue() {
        return balance.getValue();
    }

    void printOperation(){
        System.out.println(infosOperation());
    }

    public void setBalance(Money new_balance){
        this.balance = new_balance;
    };
}
