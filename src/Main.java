public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int money = 1000000;
        int term = 2;
        int end = service.calculate(money, term);
        System.out.println(end);
    }
}