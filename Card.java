package taskCard;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Card {
    protected String name;
    protected double balance;

    public Card(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public Card(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void balanceReplenishment(double cash) {
        balance = balance + cash;
    }

    public abstract void cashWithdrawal(double cash);

    public void cashUSD() {

        double course = 2.4290;
        double cashUSD = balance / course;
        BigDecimal buffer = new BigDecimal(cashUSD);
        BigDecimal result = buffer.setScale(2, BigDecimal.ROUND_DOWN);

        System.out.println("USD: " + result);
    }

    public void cashEUR() {

        double course = 2.7390;
        double cashEUR = balance / course;
        BigDecimal buffer = new BigDecimal(cashEUR);
        BigDecimal result = buffer.setScale(2, BigDecimal.ROUND_DOWN);

        System.out.println("EUR: " + result);
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Double.compare(card.balance, balance) == 0 &&
                name.equals(card.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, balance);
    }
}
