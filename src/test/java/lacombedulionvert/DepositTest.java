package lacombedulionvert;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DepositTest {
    @Test
    public void test_calcule_balance() {
        Money m20 = new Money(20);
        Money m50 = new Money(50);

        Deposit deposit = new Deposit(m20);
        deposit.calculBalance(m50);
        int result = deposit.getBalanceValue();
        System.out.println(deposit.infosOperation());
        assertEquals(70, result);
    }
}
