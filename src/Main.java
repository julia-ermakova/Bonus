public class Main {
    public static void main(String[] args) {
        int moneyInTheAccount = 100;
        int replenishmentAmount = 1500;
        int bonus;
        if (replenishmentAmount > 1000) {
            bonus = replenishmentAmount / 100;
        } else { bonus = 0;}
        int total = moneyInTheAccount + replenishmentAmount + bonus;
        System.out.println("На вашем балансе " + total + " рублей");
        System.out.println("У вас " + bonus + " бонусных рублей");

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}
