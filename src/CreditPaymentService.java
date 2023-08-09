public class CreditPaymentService {
    public int calculate(int money, int term) {
        float month = term * 12;
        float pro = (float) (9.99 / 12);
        float pro2 = (pro / 100);
        float result;
        float result2;
        float a = (float) Math.pow((1 + pro2), month);
        result = pro2 * a / (a - 1);
        result2 = money * result;
        return (int) result2;

    }
}
