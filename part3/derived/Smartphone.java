package part3.derived;

public class Smartphone extends MobilePhone {
    private OS operatingSystem;
    private double screenSize;

    public Smartphone() {
        super();
        this.operatingSystem = OS.ANDROID;
        this.screenSize = 6.0;
    }

    public Smartphone(String brand) {
        super(brand);
        this.operatingSystem = OS.ANDROID;
        this.screenSize = 6.0;
    }

    public Smartphone(String brand, String phoneNumber, OS operatingSystem, double screenSize) {
        super(brand, phoneNumber);
        setOperatingSystem(operatingSystem);
        setScreenSize(screenSize);
    }

    public Smartphone(String brand, boolean powerOn, int batteryLevel,
                      String phoneNumber, OS operatingSystem, double screenSize) {
        super(brand, powerOn, batteryLevel, phoneNumber);
        setOperatingSystem(operatingSystem);
        setScreenSize(screenSize);
    }

    public OS getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(OS operatingSystem) {
        if (operatingSystem == null) {
            throw new IllegalArgumentException("ОС не может быть null");
        }
        this.operatingSystem = operatingSystem;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        if (screenSize <= 0) {
            throw new IllegalArgumentException("Размер экрана должен быть положительным");
        }
        this.screenSize = screenSize;
    }

    public void installApp(String appName) {
        System.out.println("Установка " + appName + " на " + getBrand() + "...");
    }

    public void installApp(String appName, double sizeMB) {
        System.out.println("Установка " + appName + " (" + sizeMB + " МБ) на " + getBrand() + "...");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[brand=" + getBrand() + ", powerOn=" + isPowerOn()
                + ", batteryLevel=" + getBatteryLevel() + ", phoneNumber=" + getPhoneNumber()
                + ", os=" + operatingSystem + ", screenSize=" + screenSize + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Smartphone that = (Smartphone) obj;
        return Double.compare(that.screenSize, screenSize) == 0
                && operatingSystem == that.operatingSystem;
    }
}
