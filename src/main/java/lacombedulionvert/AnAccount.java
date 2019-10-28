package lacombedulionvert;

import java.util.ArrayList;

class AnAccount {
    private Money amount;
    private final int welcome_gift_amount = 50;
    private ArrayList<OperationAbstract> historic;

    AnAccount() {
        this.historic = new ArrayList<>();
        this.amount = new Money(welcome_gift_amount);
        Deposit deposit = new Deposit(this.amount);
        historic.add(deposit);
    }

    AnAccount(Money first_amount) {
        this.historic = new ArrayList<>();
        this.amount = new Money(first_amount.add(welcome_gift_amount));
        Deposit deposit = new Deposit(this.amount);
        historic.add(deposit);
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

    void printHistoric() {
        for (OperationAbstract elt: historic) {
            elt.printOperation();
        }
    }
}
