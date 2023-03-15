public class Student {
    String name;
    int money;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void takeVehicle(Vehicle bus) {
        this.money = bus.charge(this.money);
//        this.money = bus.charge(this.money, 1500);
    }
}
