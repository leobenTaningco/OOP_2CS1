public class PaymentApp {
    public static void main(String[] args) {

        Order order = new Order("keyboard", 300.0, 10);

        System.out.println("\nOrder Item is: " + order.getItem() +
                "\nUnit Price is " + order.getUnitPrice() +
                "\nQuantity is " + order.getQuantity());

        order.setSpecific(new GCash());
        System.out.println("\nPayment order details if " + order.getSpecific().getClass().getSimpleName() +
                "\nDiscount rate is " + order.getSpecific().determineDiscountRate() +
                "\nPayment amount is " + (order.getTotalAmount() - (order.getTotalAmount() * order.getSpecific().determineDiscountRate())));

        order.setSpecific(new Maya());
        System.out.println("\nPayment order details if " + order.getSpecific().getClass().getSimpleName() +
                "\nDiscount rate is " + order.getSpecific().determineDiscountRate() +
                "\nPayment amount is " + (order.getTotalAmount() - (order.getTotalAmount() * order.getSpecific().determineDiscountRate())));

        order.setSpecific(new ShopeePay());
        System.out.println("\nPayment order details if " + order.getSpecific().getClass().getSimpleName() +
                "\nDiscount rate is " + order.getSpecific().determineDiscountRate() +
                "\nPayment amount is " + (order.getTotalAmount() - (order.getTotalAmount() * order.getSpecific().determineDiscountRate())));


    }
}