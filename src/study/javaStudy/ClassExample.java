package study.javaStudy;

class Car {
    // field
    private String name;
    private int speed;

    Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    Car(int speed, String name) {

    }

    Car(int speed) {

    }

    Car() {

    }

    // alt + insert
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

public class ClassExample {
    public static void main(String[] args) {
        Car car = new Car("car", 10);
        String name = car.getName();
        System.out.println(name);
        car.setName("car2");
        System.out.println(car.getName());
    }
}
