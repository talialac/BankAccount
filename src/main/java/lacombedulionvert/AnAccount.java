package lacombedulionvert;

/**
 * Hello world!
 *
 */
public class AnAccount {
    private Money amount;
    private final int welcome_gift_amount = 50;


    public AnAccount() {
        this.amount = new Money(welcome_gift_amount);
    }

    public AnAccount(Money first_amount) {
        this.amount = new Money(first_amount.getValue() + welcome_gift_amount);
    }

    public int getAmount() {
        return this.amount.getValue();
    }

    public void deposit(Money amount) {
        int addition = this.amount.getValue() + amount.getValue();
        this.amount.setValue(addition);
    }

    public void withdrawal(Money amount) {
        int substraction = this.amount.getValue() - amount.getValue();
        this.amount.setValue(substraction);
    }
}
