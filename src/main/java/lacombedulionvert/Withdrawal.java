package lacombedulionvert;

public class Withdrawal extends OperationAbstract{
    Withdrawal(Money amount) {
        super(amount);
    }

    public void calculBalance(Money amount_in_account) {
        int substraction = amount_in_account.getValue() - super.getAmount();
        if (substraction > 0) {
            super.getBalance().setValue(substraction);
        }
        else{
            super.getBalance().setValue(0);
        }
    }

    public String infosOperation(){
        return "Withdrawal of " + super.getAmount() + " on " + super.getDateValue() + ". Balance: " + super.getBalanceValue() + ".";
    }
}
