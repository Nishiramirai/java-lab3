package part3;

import part3.base.Chargeable;
import part3.base.Device;
import part3.derived.*;

public class Part3Demo {
    public static void main(String[] args) {
        Chargeable[] devices = new Chargeable[] {
            new Device("GenericBrand"),
            new MobilePhone("Nokia", "+7-999-111-22-33"),
            new MobilePhone("Xiaomi", false, 30, "+7-999-444-55-66"),
            new Smartphone("Samsung", "+7-999-777-88-99", OS.ANDROID, 6.8),
            new Smartphone("iPhone", "+7-999-000-11-22", OS.IOS, 6.1),
            new Smartphone("Pixel", "+7-999-333-44-55", OS.ANDROID, 6.3),
        };

        System.out.println("=== Массив устройств (через интерфейс Chargeable) ===");
        for (Chargeable c : devices) {
            System.out.println(c);
            System.out.println("  Полностью заряжен? " + c.isFullyCharged());
            c.charge();
            System.out.println("  После зарядки: " + c.getBatteryLevel() + "%");
            System.out.println();
        }

        System.out.println("=== Демонстрация перегрузки методов ===");
        Smartphone phone = new Smartphone("OnePlus", "+7-999-666-77-88", OS.ANDROID, 6.5);
        phone.installApp("WhatsApp");
        phone.installApp("Camera", 250.0);

        System.out.println("\n=== Демонстрация перегрузки конструкторов ===");
        Smartphone empty = new Smartphone();
        Smartphone justBrand = new Smartphone("Pixel");
        Smartphone fullSpec = new Smartphone("Huawei", true, 80, "+7-999-555-66-77", OS.HARMONYOS, 6.7);
        System.out.println(empty);
        System.out.println(justBrand);
        System.out.println(fullSpec);

        System.out.println("\n=== Демонстрация перегрузки turnOn() ===");
        Device d = new Device("TestDevice");
        d.turnOn();
        System.out.println(d.getBrand() + " powerOn=" + d.isPowerOn());
        d.turnOff();
        d.turnOn(false);
        System.out.println(d.getBrand() + " powerOn=" + d.isPowerOn());
    }
}
