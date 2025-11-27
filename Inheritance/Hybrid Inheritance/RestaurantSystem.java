public class RestaurantSystem {
    public static void main(String[] args) {
        // Create Chef
        Chef chef = new Chef("Gordon Ramsay", 101);
        chef.displayRole();
        chef.displayInfo();
        chef.performDuties();

        System.out.println();

        // Create Waiter
        Waiter waiter = new Waiter("Emily Stone", 202);
        waiter.displayRole();
        waiter.displayInfo();
        waiter.performDuties();
    }
}