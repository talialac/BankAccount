package lacombedulionvert;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DepositTest {
    @Test
    public void test_calcule_balance() {
        Money amount_in_account = new Money(650);
        Money money50 = new Money(50);
        Deposit deposit = new Deposit(money50);
        deposit.calculBalance(amount_in_account);
        int result = deposit.getBalanceValue();
        assertEquals(700, result);
    }
}
