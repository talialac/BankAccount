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
        int substraction = this.amount.getValue() - amount.getValue();
        if (substraction > 0) {
            this.amount.setValue(substraction);
        }
        else{
            this.amount.setValue(0);
        }
    }

    public void getHistoric() {
        Deposit deposit = new Deposit(new Money (0));
        deposit = (Deposit) historic.get(historic.size()-1);
        deposit.printOperation();
    }
}
