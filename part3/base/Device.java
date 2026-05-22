package part3.base;

public class Device implements Chargeable {
    private String brand;
    private boolean powerOn;
    private int batteryLevel;

    {
        batteryLevel = 0;
    }

    public Device() {
        this.brand = "Неизвестно";
        this.powerOn = false;
    }

    public Device(String brand) {
        setBrand(brand);
        this.powerOn = false;
    }

    public Device(String brand, boolean powerOn, int batteryLevel) {
        setBrand(brand);
        setPowerOn(powerOn);
        setBatteryLevel(batteryLevel);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.trim().isEmpty()) {
            throw new IllegalArgumentException("Бренд не может быть пустым");
        }
        this.brand = brand;
    }

    public boolean isPowerOn() {
        return powerOn;
    }

    public void setPowerOn(boolean powerOn) {
        this.powerOn = powerOn;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        if (batteryLevel < 0 || batteryLevel > 100) {
            throw new IllegalArgumentException("Уровень заряда должен быть от 0 до 100");
        }
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void charge() {
        this.batteryLevel = 100;
        System.out.println(brand + " полностью заряжен.");
    }

    @Override
    public boolean isFullyCharged() {
        return batteryLevel == 100;
    }

    public void turnOn() {
        this.powerOn = true;
    }

    public void turnOn(boolean silent) {
        this.powerOn = true;
        if (!silent) {
            System.out.println(brand + " теперь включён.");
        }
    }

    public void turnOff() {
        this.powerOn = false;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[brand=" + brand + ", powerOn=" + powerOn
                + ", batteryLevel=" + batteryLevel + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Device device = (Device) obj;
        return powerOn == device.powerOn && batteryLevel == device.batteryLevel
                && brand.equals(device.brand);
    }
}
