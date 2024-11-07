package month2.homework2_1;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(15000);

        LimitException limitException = new LimitException("12", bankAccount.getAmount());

        while (true){
            try {
                bankAccount.withDraw(6000);
                System.out.println("Успешно, остаток " + bankAccount.getAmount());
            } catch (LimitException e) {
                System.out.println(e.getMessage() + " Доступный остаток: " + e.getRemainingAmount());
                try {
                    bankAccount.withDraw((int) e.getRemainingAmount());
                    System.out.println("Остаток " + bankAccount.getAmount());
                } catch (LimitException er) {
                    System.out.println("Ошибка при снятии остатка: " + er.getMessage());
                }
                break;
            }
        }
    }
}
