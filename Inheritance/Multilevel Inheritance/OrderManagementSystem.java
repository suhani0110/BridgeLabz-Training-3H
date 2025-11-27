public class OrderManagementSystem {
    public static void main(String[] args) {
        // Base order
        Order order = new Order("ORD001", "2025-09-01");
        System.out.println("=== Base Order ===");
        order.displayOrderDetails();

        System.out.println();

        // Shipped order
        ShippedOrder shipped = new ShippedOrder("ORD002", "2025-09-03", "TRK123456789");
        System.out.println("=== Shipped Order ===");
        shipped.displayOrderDetails();

        System.out.println();

        // Delivered order
        DeliveredOrder delivered = new DeliveredOrder("ORD003", "2025-09-05", "TRK987654321", "2025-09-10");
        System.out.println("=== Delivered Order ===");
        delivered.displayOrderDetails();
    }
}