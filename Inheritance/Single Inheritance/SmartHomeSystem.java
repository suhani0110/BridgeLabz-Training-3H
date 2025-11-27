public class SmartHomeSystem {
    public static void main(String[] args) {
        // Create a Thermostat object
        Thermostat thermostat = new Thermostat(
            "TH-001",
            "Online",
            22.5
        );

        // Display thermostat status
        thermostat.displayStatus();
    }
}