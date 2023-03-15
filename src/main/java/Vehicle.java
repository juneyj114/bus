public abstract class Vehicle {
    int fee;

    int charge(int money) {
        int result = money = fee;
        System.out.println("총액 " + money + "원 중 " + fee + " 원이 결제되었습니다. 잔액은 " + result + "원 입니다.");
        return result;
    }
}
