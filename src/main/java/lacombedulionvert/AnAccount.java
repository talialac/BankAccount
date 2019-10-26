package lacombedulionvert;

/**
 * Hello world!
 *
 */
public class AnAccount {
    private int amount;

    public AnAccount() {
        this.amount = 50;
    }

    public AnAccount(int first_amount) {
        this.amount = first_amount + 50;
    }

    public int getAmount() {
        return amount;
    }

    public void deposit(int amount) {
        this.amount += amount;
    }
}
