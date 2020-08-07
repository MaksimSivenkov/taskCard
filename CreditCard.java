package taskCard;

public class CreditCard extends Card {

    public CreditCard(String name, double balance) {
        super(name, balance);
    }

    public CreditCard(String name) {
        super(name);
    }

    @Override
    public void cashWithdrawal(double cash) {
        balance = balance - cash;
    }

}
