class Thermostat extends Device {
    double temperatureSetting; // e.g., in Celsius

    // Constructor
    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);  // Call Device constructor
        this.temperatureSetting = temperatureSetting;
    }

    // Overriding displayStatus() to include temperature info
    @Override
    public void displayStatus() {
        super.displayStatus(); // Call the method from Device
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
  
