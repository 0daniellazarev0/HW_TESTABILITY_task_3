public class CreditPaymentService {
    public double calculate(double creditAmount, double monthlyInterestRate, int termLengthMonths) {
        double coefficient;
        double monthlyPayment;
        double auxiliary;
        double exponent = -termLengthMonths;
        double base = 1.0 + monthlyInterestRate;
        auxiliary = Math.pow(base, exponent);
        coefficient = monthlyInterestRate / (1 - auxiliary);
        monthlyPayment = creditAmount * coefficient;
        return monthlyPayment;
    }
}
// Х = С * К
//где X — аннуитетный платеж,
//С — сумма кредита,
//К — коэффициент аннуитета.
//Коэффициент аннуитета считается так:
//К = (М * (1 + М) ^ S) / ((1 + М) ^ S — 1)
//где М — месячная процентная ставка по кредиту,
//S — срок кредита в месяцах.