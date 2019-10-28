package lacombedulionvert;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class AnAccount {
    private Money amount;
    private final int welcome_gift_amount = 50;
    ArrayList<OperationAbstract> historic;

    public AnAccount() {
        this.amount = new Money(welcome_gift_amount);
        historic = new ArrayList<>();
    }

    public AnAccount(Money first_amount) {
        this.amount = new Money(first_amount.getValue() + welcome_gift_amount);
        historic = new ArrayList<>();
    }

    public int getAmount() {
        return this.amount.getValue();
    }

    public void deposit(Money amount) {
        Deposit deposit = new Deposit(amount);
        deposit.calculBalance(this.amount);
        this.amount.setValue(deposit.getBalanceValue());
        historic.add(deposit);
    }

    public void withdrawal(Money amount) {
        Withdrawal withdrawal = new Withdrawal(amount);
        withdrawal.calculBalance(this.amount);
        this.amount.setValue(withdrawal.getBalanceValue());
        historic.add(withdrawal);
    }

    public void getHistoric() {
        OperationAbstract op = historic.get(historic.size()-1);
        op.printOperation();
    }
}
