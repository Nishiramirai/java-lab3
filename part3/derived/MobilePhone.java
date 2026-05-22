package part3.derived;

import part3.base.Device;

public class MobilePhone extends Device {
    private String phoneNumber;

    public MobilePhone() {
        super();
        this.phoneNumber = "Неизвестно";
    }

    public MobilePhone(String brand) {
        super(brand);
        this.phoneNumber = "Неизвестно";
    }

    public MobilePhone(String brand, String phoneNumber) {
        super(brand);
        setPhoneNumber(phoneNumber);
    }

    public MobilePhone(String brand, boolean powerOn, int batteryLevel, String phoneNumber) {
        super(brand, powerOn, batteryLevel);
        setPhoneNumber(phoneNumber);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Номер телефона не может быть пустым");
        }
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[brand=" + getBrand() + ", powerOn=" + isPowerOn()
                + ", batteryLevel=" + getBatteryLevel() + ", phoneNumber=" + phoneNumber + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        MobilePhone that = (MobilePhone) obj;
        return phoneNumber.equals(that.phoneNumber);
    }
}
