package lacombedulionvert;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
class AnAccount {
    private Money amount;
    private final int welcome_gift_amount = 50;
    private ArrayList<OperationAbstract> historic;

    AnAccount() {
        this.amount = new Money(welcome_gift_amount);
        historic = new ArrayList<>();
    }

    AnAccount(Money first_amount) {
        this.amount = new Money(first_amount.getValue() + welcome_gift_amount);
        historic = new ArrayList<>();
    }

    int getAmount() {
        return this.amount.getValue();
    }

    void deposit(Money amount) {
        Deposit deposit = new Deposit(amount);
        deposit.calculBalance(this.amount);
        this.amount.setValue(deposit.getBalanceValue());
        historic.add(deposit);
    }

    void withdrawal(Money amount) {
        Withdrawal withdrawal = new Withdrawal(amount);
        withdrawal.calculBalance(this.amount);
        this.amount.setValue(withdrawal.getBalanceValue());
        historic.add(withdrawal);
    }

    void getHistoric() {
        OperationAbstract op;
        for (OperationAbstract elt: historic) {
            elt.printOperation();
        }
    }
}
