package lacombedulionvert;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WithdrawalTest {
    @Test
    public void a_withdrawal_operation() {
        Money m20 = new Money(20);
        Money m50 = new Money(50);

        Withdrawal withdrawal = new Withdrawal(m20);
        withdrawal.calculBalance(m50);
        int result = withdrawal.getBalanceValue();
        assertEquals(30, result);
    }

    public void a_withdrawal_amount_cant_be_bigger_than_amount_in_account() {
        Money m60 = new Money(60);
        Money m50 = new Money(50);

        Withdrawal withdrawal = new Withdrawal(m60);
        withdrawal.calculBalance(m50);
        int result = withdrawal.getBalanceValue();
        assertEquals(0, result);
    }
}
