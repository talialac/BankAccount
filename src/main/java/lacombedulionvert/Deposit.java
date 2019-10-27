package lacombedulionvert;

import java.time.LocalDateTime;
import java.util.Objects;

public class Deposit extends OperationAbstract{

    Deposit(Money amount) {
        super(amount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deposit that = (Deposit) o;
        return Objects.equals(super.getAmount(), that.getAmount()) &&
                Objects.equals(super.getDate(), that.getDate());
    }

    public void calculBalance(Money amount_in_account) {
        int addition = amount_in_account.getValue() + super.getAmount();
        super.getBalance().setValue(addition);
    }

}
