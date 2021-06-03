package Day11;
import org.junit.jupiter.api.*;
import static org.assertj.core.api.Java6Assertions.*;

class CheckArrayTest {
    @Test
     void checkArrayID()
    {

        final String abc[]  =   {"12345678","456987","7854132396","78952145","215456987","2014503"};
        assertThat(abc).doesNotContainNull();
        for (String a:abc)
        {
            assertThat(a).hasSize(8)
                    .containsOnlyDigits();
        }

    }


}