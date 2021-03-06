package lacombedulionvert;

public class Deposit extends OperationAbstract{

    Deposit(Money amount) {
        super(amount);
    }

    public void calculBalance(Money amount_in_account) {
        int addition = amount_in_account.getValue() + super.getAmount();
        super.getBalance().setValue(addition);
    }

    public String infosOperation(){
        return "Deposit of " + super.getAmount() + " on " + super.getDateValue() + ". Balance: " + super.getBalanceValue() + ".";
    }
}
