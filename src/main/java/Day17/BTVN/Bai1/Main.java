package Day17.BTVN.Bai1;

public class Main {
    public static void main(String[] args) {
        //Car chạy bằng gas và manual car
        CarGas gas = new CarGas();
        gas.setName("VF");
        gas.setColor("Red");
        gas.setBranch("110i");
        gas.setTypeGas(95);
        System.out.println("Thông tin xe chạy bằng gas: "+gas);
        gas.run(100);
        //Car chạy bằng Hydro và tự động
        CarHydro hydro = new CarHydro();
        hydro.setName("VF145");
        hydro.setColor("Black");
        hydro.setBranch("110i");
        System.out.println("Thông tin xe chạy tự động nhiên liệu là hydro: "+hydro);
        hydro.autostop();
        hydro.autoTrip();
        hydro.checklane();
        hydro.checklight();
        hydro.checkParking();
        hydro.checkTrafficsigns();

    }
}
