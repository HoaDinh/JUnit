package Day17.BTVN.Bai1;

public class Cars {
    private String name;
    private String color;
    private String branch;
    private String Seats;

public Cars()
{

}
    public Cars(String name, String color, String branch, String seats) {
        this.name = name;
        this.color = color;
        this.branch = branch;
        Seats = seats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getSeats() {
        return Seats;
    }

    public void setSeats(String seats) {
        Seats = seats;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", branch='" + branch + '\'' +
                ", Seats='" + Seats + '\'' +
                '}';
    }
}
