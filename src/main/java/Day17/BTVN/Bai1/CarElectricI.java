package Day17.BTVN.Bai1;

public class CarElectricI extends Cars implements IAutoCar {
    @Override
    public String toString() {
        return "Car{" +
                "name=" + super.getName() +
                ", color='" + super.getColor() + '\'' +
                ", branch=" + super.getBranch() + '\'' +
                ", seats=" + super.getSeats()+
                '}';
    }

    public CarElectricI() { }
    public CarElectricI(String name, String color, String branch, String seats) {
        super(name, color, branch, seats);

    }


    @Override
    public void autoTrip() {
        System.out.println("Hệ thống này cho phép tự động chọn tuyến đường bạn đi");

    }

    @Override
    public void autostop() {
        System.out.println("Hệ thống cho phép bạn tự động dừng lại khi gặp chướng ngại vật");

    }

    @Override
    public void checklight() {
        System.out.println("Hệ thống này cho phép bạn tự động dừng khi đen đò vả đi tiếp khi đèn xanh");
    }

    @Override
    public void checklane() {
        System.out.println("Hệ thống này cho phép tự động chọn đúng tuyến đường bạn đi");

    }

    @Override
    public void checkParking() {
        System.out.println("Hệ thống này cho phép tự động tìm bãi đậu xe");

    }

    @Override
    public void checkTrafficsigns() {
        System.out.println("Hệ thống này cho phép tự động nhận dạng các biển báo giao thông để đi đúng luật");

    }
}
