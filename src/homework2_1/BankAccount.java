package month2.homework2_1;

public class BankAccount {
    private double amount;

    public BankAccount() {
        this.amount = 0;
    }

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum){
        if (sum > 0) {
            amount += sum;
            System.out.println("Вы внесли на счет: " + sum);
        } else {
            System.out.println("Сумма для внесения должна быть положительной.");
        }
    }

    public void withDraw(int sum) throws LimitException {
        if (sum > amount) { // Проверяем, достаточно ли денег на счете
            throw new LimitException("Недостаточно средств на счете.", amount);
        } else {
            amount -= sum; // Вычитаем сумму с остатка
            System.out.println("Вы сняли со счета: " + sum);
        }
    }
}
