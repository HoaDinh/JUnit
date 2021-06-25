package Day17.BTVN.Bai1;

public class CarGas extends Cars implements ManualCar{

    private long typeGas;

    public long getTypeGas() {
        return typeGas;
    }

    public void setTypeGas(long typeGas) {
        this.typeGas = typeGas;
    }

    public CarGas() { }
    public CarGas(String name, String color, String branch, String seats, long typeGas) {
        super(name, color, branch, seats);
        this.typeGas = typeGas;
    }
    @Override
    public String toString() {
        return "Car{" +
                "name=" + super.getName() +
                ", color='" + super.getColor() + '\'' +
                ", branch=" + super.getBranch() + '\'' +
                ", typeGas" + typeGas+ '\'' +
                ", seats=" + super.getSeats()+
                '}';
    }
    @Override
    public void run(int speed) {
        System.out.println("Speed max "+speed +"km/h");
    }

    /*@Override
    public String toString() {
        return "CarGas{" +
                "typeGas=" + typeGas +
                '}' +super.toString();
    }*/
}
