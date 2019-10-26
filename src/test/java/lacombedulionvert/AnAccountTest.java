package lacombedulionvert;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple AnAccount.
 */
public class AnAccountTest
{
    @Test
    public void opening_a_default_bank_account() {
        AnAccount account = new AnAccount();
        assertEquals(50, account.getAmount());
    }

    @Test
    public void opening_a_bank_account_and_directly_put_money_in_it() {
        Money amount_100 = new Money(100);
        AnAccount account = new AnAccount(amount_100);
        assertEquals(150, account.getAmount());
    }

    @Test
    public void opening_a_bank_account_and_directly_put_money_in_it_with_a_negative_number() {
        Money amount_100 = new Money(-100);
        AnAccount account = new AnAccount(amount_100);
        assertEquals(150, account.getAmount());
    }

    @Test
    public void deposit_money_in_a_default_account_already_opened() {
        AnAccount account = new AnAccount();
        Money amount_50 = new Money(50);
        account.deposit(amount_50);
        int expected = 100;
        assertEquals(expected, account.getAmount());
    }

    @Test
    public void deposit_money_in_an_account_already_opened() {
        Money amount_100 = new Money(100);
        Money amount_50 = new Money(50);
        AnAccount account = new AnAccount(amount_100);
        account.deposit(amount_50);
        int expected = 200;
        assertEquals(expected, account.getAmount());
    }

    @Test
    public void withdrawal_money() {
        Money amount_20 = new Money(20);
        Money amount_50 = new Money(50);
        AnAccount account = new AnAccount(amount_50);//there is 100 in it
        account.withdrawal(amount_20);
        int expected = 80;
        assertEquals(expected, account.getAmount());
    }
}
