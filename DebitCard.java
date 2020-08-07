package taskCard;

public class DebitCard extends Card {

    public DebitCard(String name, double balance) {
        super(name, balance);
    }

    public DebitCard(String name) {
        super(name);
    }

    @Override
    public void cashWithdrawal(double cash) {
        if (cash > balance) {
            throw new CardException("Insufficient funds");
        } else {
            balance = balance - cash;
        }
    }
}
