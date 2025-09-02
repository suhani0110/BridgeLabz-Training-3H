public class NullPointerDemo {

    static void generateException() {
        String text = null; 
        System.out.println("Length of text: " + text.length());
    }

    static void handleException() {
        String text = null; 
        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: text is null!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Calling method to generate NullPointerException:");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("\nCalling method to handle NullPointerException:");
        handleException();
    }
}

