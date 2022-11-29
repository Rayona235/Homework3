public class Main {
    public static void main(String[] args) throws LimitException{
       BankAccount bankAccount= new BankAccount();
       bankAccount.deposit(20000);
//       BankAccount[] accounts = {new BankAccount(), new BankAccount()};
//        for (int i = 0; i < 6; i++) {
//
//        }

//        for (BankAccount account:  accounts) {
//            account.deposit();
//        }

        while (true){
            try {
                bankAccount.withDraw(6000);
            } catch (LimitException error){
                System.out.println(error.getMessage());
                bankAccount.withDraw(error.getRemainingAmount());
                break;
            }
        }


    }

}