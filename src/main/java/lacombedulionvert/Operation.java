package lacombedulionvert;

public class Operation {
    private Money amount;

    Operation(Money amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount.getValue();
    }
}
