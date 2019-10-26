package lacombedulionvert;

/**
 * Hello world!
 *
 */
public class AnAccount {
    private int amount;
    private final int welcome_gift_amount = 50;


    public AnAccount() {
        this.amount = welcome_gift_amount;
    }

    public AnAccount(int first_amount) {
        if (first_amount>0)
            this.amount = first_amount + welcome_gift_amount;
    }

    public int getAmount() {
        return amount;
    }

    public void deposit(int amount) {
        this.amount += amount;
    }
}
