public class Main {

    public static void main(String[] args) {

        Student student = new Student("홍길동", 10000);
        Vehicle bus = new Bus("1번", 1500);

        student.takeVehicle(bus);

        System.out.println(student.name + "의 잔액은" + student.money + "원 입니다.");

    }
}
