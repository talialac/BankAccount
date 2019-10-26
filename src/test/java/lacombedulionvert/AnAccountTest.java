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
        AnAccount account = new AnAccount(100);
        assertEquals(150, account.getAmount());
    }

    @Test
    public void deposit_money_in_an_account_already_opened() {
        AnAccount account = new AnAccount();
        account.deposit(50);
        int expected = 100;
        assertEquals(expected, account.getAmount());
    }

    @Test
    public void deposit_money_in_an_account_already_opened2() {
        AnAccount account = new AnAccount(100);
        account.deposit(50);
        int expected = 200;
        assertEquals(expected, account.getAmount());
    }
}
