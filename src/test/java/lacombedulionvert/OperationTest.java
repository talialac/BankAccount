package lacombedulionvert;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperationTest {
    @Test
    public void a_deposit_operation() {
        Money money_50 = new Money(50);
        Operation deposit = new Operation(money_50);
        int amount_of_deposit = deposit.getAmount();
        assertEquals(50, deposit.getAmount());
    }
}
