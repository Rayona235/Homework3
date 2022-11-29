public class BankAccount {
    double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
//        amount = amount + sum;
        amount += sum;
    }

    public void withDraw(double sum) throws LimitException {
        if (amount < sum) {
            throw new LimitException("nooo", amount);
        }
        amount -= sum;
        System.out.println(amount);
    }

}
