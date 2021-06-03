package Day11;
import org.junit.jupiter.api.*;
import org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Java6Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CheckemailTest {
    Checkemail ck = new Checkemail();
    String email="hoa@gmail.com..vn";
    @Test
    void checkEmail()
    {
        //assertThat().isTrue();
        assertThat(ck.checkEmail(email)).isTrue();
        //assertTrue(ck.checkEmail(email));
    }

}