package lacombedulionvert;

public class Deposit extends OperationAbstract{

    Deposit(Money amount) {
        super(amount);
    }

    public void calculBalance(Money amount_in_account) {
        super.setBalance(new Money(amount_in_account.add(super.getAmount())));
    }

    public String infosOperation(){
        return "Deposit of " + super.getAmount() + " on " + super.getDateValue() + ". Balance: " + super.getBalanceValue() + ".";
    }
}
