public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        System.out.println("Сумма кредита: ₽1,000,000; 9.99% годовых; срок -- 1 год");
        System.out.println("Ваш ежемесячный платеж: ₽" + service.calculate(1_000_000, 0.008325, 12));
        System.out.println();

        System.out.println("Сумма кредита: ₽1,000,000; 9.99% годовых; срок -- 2 года");
        System.out.println("Ваш ежемесячный платеж: ₽" + service.calculate(1_000_000, 0.008325, 24));
        System.out.println();

        System.out.println("Сумма кредита: ₽1,000,000; 9.99% годовых; срок -- 3 года");
        System.out.println("Ваш ежемесячный платеж: ₽" + service.calculate(1_000_000, 0.008325, 36));


        // Х = С * К
        //где X — аннуитетный платеж,
        //С — сумма кредита,
        //К — коэффициент аннуитета.
        //Коэффициент аннуитета считается так:
        //К = (М * (1 + М) ^ S) / ((1 + М) ^ S — 1)
        //где М — месячная процентная ставка по кредиту,
        //S — срок кредита в месяцах.
    }
}
