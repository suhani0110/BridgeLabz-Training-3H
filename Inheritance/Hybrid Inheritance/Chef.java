class Chef extends Person implements Worker {

    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef Duties: Prepares meals, manages the kitchen, and plans the menu.");
    }

    public void displayRole() {
        System.out.println("Role: Chef");
    }
}
