public class Main {
    public static void main(String[] args) {
        int accountStart = 200;
        int refillAmount = 1050;
        int accountFinish;
        int bonus = 0;
        if (refillAmount > 1000) {
            bonus = refillAmount / 100;
            accountFinish = accountStart + refillAmount + bonus;
        } else {
            accountFinish = accountStart + refillAmount;
        }
        System.out.println("Начислено бонусных рублей: " + bonus);
        System.out.println("Итоговый баланс составляет: " + accountFinish);
    }
}