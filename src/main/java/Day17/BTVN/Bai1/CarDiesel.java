package Day17.BTVN.Bai1;

public class CarDiesel extends Cars implements ManualCar{
    private long diesel;

    public long getTypeGas() {
        return diesel;
    }

    public void setTypeGas(long typeGas) {
        this.diesel = diesel;
    }

    public CarDiesel() { }
    public CarDiesel(String name, String color, String branch, String seats, long typeGas) {
        super(name, color, branch, seats);
        this.diesel = diesel;
    }
    @Override
    public String toString() {
        return "Car{" +
                "name=" + super.getName() +
                ", color='" + super.getColor() + '\'' +
                ", branch=" + super.getBranch() + '\'' +
                ", typeGas" + diesel+ '\'' +
                ", seats=" + super.getSeats()+
                '}';
    }
    @Override
    public void run(int speed) {
        System.out.println("Speed max "+speed +"km/h");
    }
}
