package Day17;
//import Day16.Products;
//import Day17.BTVN.Bai1.CarDiesel1;
import Day17.BTVN2.*;


//import java.sql.SQLOutput;
//import java.time.LocalDate;
import java.util.ArrayList;

public class App {
    public static void main(String [] args)
    {
        //System.out.println("Hello world");
        /*demoPerson();
*/
        /*CarDiesel1 car1 = new CarDiesel1();
        car1.price();*/
       People peo = new People();
        ArrayList<People> people = peo.addPeople();
      //peo.countPeople(people);
       peo.Sort(people);
        //peo.average(people);
        //peo.evaluation(people);

    }
  /*  public  static void demoPerson()
    {
        Person person = new Person();
        person.firstname="Ninh";
        person.firstname="Hoa";
        person.birthday= LocalDate.of(2020, 12,12);
        System.out.println(person);

    }*/
}
