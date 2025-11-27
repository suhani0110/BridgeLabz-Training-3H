class Waiter extends Person implements Worker {

    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter Duties: Takes orders, serves food, and ensures customer satisfaction.");
    }

    public void displayRole() {
        System.out.println("Role: Waiter");
    }
}
