public class LimitException extends Exception {

    double amount;

    public LimitException(String massage,double remainingAmount) {
        super(massage);
        amount = remainingAmount;
    }
    public double getRemainingAmount(){
        return amount;
    }
}
