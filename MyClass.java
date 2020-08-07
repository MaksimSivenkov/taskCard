package taskCard;

public class MyClass {

    public static void main(String[] args) {

        ATM debitCard = new ATM(new DebitCard("Jon"));
        ATM creditCard = new ATM(new CreditCard("Alex"));

        try {
            debitCard.balanceReplenishment(1000);
        } catch (CardException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            debitCard.cashWithdrawal(300);
        } catch (CardException exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println(debitCard.toString());

        try {
            creditCard.balanceReplenishment(100);
        } catch (CardException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            creditCard.cashWithdrawal(500);
        } catch (CardException exception) {
            System.out.println(exception.getMessage());
        }
        creditCard.cashWithdrawal(100);

        System.out.println(creditCard.toString());

        creditCard.cashEUR();
        creditCard.cashUSD();
        debitCard.cashUSD();
        debitCard.cashEUR();
    }
}
