package Day17;

import java.time.LocalDate;
import java.util.ArrayList;

public class Person {
    String firstname;
    String lastname;
    LocalDate birthday;
    public Person()
    {
       this.lastname="";
       this.firstname="";
       this.birthday= LocalDate.now();
    }
    public Person (String firstname, String lastname, LocalDate birthday)
    {
        this.firstname=firstname;
        this.lastname=lastname;
        this.birthday=birthday;

    }
    @Override
    public String toString()
    {
        return "Person [birthday="+birthday+" first namê "+firstname+" last name "+lastname;
    }
    public void work()
    {

    }


}

