package lacombedulionvert;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WithdrawalTest {
    @Test
    public void a_withdrawal_operation() {
        Money amount_in_account = new Money(650);
        Money money50 = new Money(50);

        Withdrawal withdrawal = new Withdrawal(money50);
        withdrawal.calculBalance(amount_in_account);
        int result = withdrawal.getBalanceValue();
        assertEquals(600, result);
    }

    @Test
    public void a_withdrawal_amount_cant_be_bigger_than_amount_in_account() {
        Money amount_in_account = new Money(150);
        Money money200 = new Money(200);

        Withdrawal withdrawal = new Withdrawal(money200);
        withdrawal.calculBalance(amount_in_account);
        int result = withdrawal.getBalanceValue();
        assertEquals(0, result);
    }

    @Test
    public void a_withdrawal_amount_cant_be_bigger_than_amount_in_account_it_will_be_amount_in_account() {
        Money amount_in_account = new Money(150);
        Money money200 = new Money(200);

        Withdrawal withdrawal = new Withdrawal(money200);
        withdrawal.calculBalance(amount_in_account);
        int result = withdrawal.getAmount();
        assertEquals(150, result);
    }
}
