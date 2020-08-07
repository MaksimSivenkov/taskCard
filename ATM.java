package taskCard;

import java.util.Objects;

public class ATM {

    private Card card;

    public ATM(Card card) {
        this.card = card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public double getBalance() {
        return card.getBalance();
    }

    public String getName() {
        return card.getName();
    }

    public void balanceReplenishment(double cash) {

        if (cash % 5 != 0) {
            throw new CardException("The incorrect amount. The ATM accepts only banknotes in denominations " +
                    "of 5, 10, 20, 50, 100 BYN. ");
        } else {
            card.balanceReplenishment(cash);
        }
    }

    public void cashWithdrawal(double cash) throws CardException {

        if (cash > 500) {
            throw new CardException("Exceeding the cash withdrawal limit! Withdrawal limit 500 BYN");
        } else if (cash % 5 != 0) {
            throw new CardException("The incorrect amount. There are banknotes in denominations " +
                    "of 5, 10, 20, 50, 100 BYN.");
        } else {
            card.cashWithdrawal(cash);
        }
    }

    public void cashUSD() {
        card.cashUSD();
    }

    public void cashEUR() {
        card.cashEUR();
    }

    private void cashWithdrawalException(){}

    @Override
    public String toString() {
        return "ATM{" +
                "card=" + card +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ATM atm = (ATM) o;
        return card.equals(atm.card);
    }

    @Override
    public int hashCode() {
        return Objects.hash(card);
    }
}