package lacombedulionvert;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;

public class OperationTest {
    @Test
    public void a_deposit_operation() {
        Money money_50 = new Money(50);
        Operation deposit = new Operation(money_50);
        int amount_of_deposit = deposit.getAmount();
        assertEquals(50, deposit.getAmount());
    }

    @Test
    public void a_withdrawal_operation() {
        Money money_50 = new Money(50);
        Operation withdrawal = new Operation(money_50);
        int amount_of_deposit = withdrawal.getAmount();
        assertEquals(50, withdrawal.getAmount());
    }

    @Test
    public void an_operation_gets_now_time() {
        Money money_50 = new Money(50);
        LocalDateTime now = LocalDateTime.now();
        Operation withdrawal = new Operation(money_50);
        int amount_of_deposit = withdrawal.getAmount();
        assertEquals(now, withdrawal.getDate());
    }
}
