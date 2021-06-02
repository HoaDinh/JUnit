package Day11;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Java6Assertions.*;

class CheckBMITest {
    @Test
    void weightString()
    {
        CheckBMI bmi = new CheckBMI();
        String cn="80";
        assertThat(cn).containsOnlyDigits()
                .hasSize(2);



    }
    @Test
    void weightInt()
    {
        CheckBMI bmi = new CheckBMI();
        int weight=0;
       assertThat(weight).isBetween(1,100);
    }

}