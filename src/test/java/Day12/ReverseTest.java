package Day12;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Java6Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {
    Reverse rv = new Reverse();
    @Test
    void checkReverse()
    {
        String str =rv.reverseString("Hoa Dinh Xinh");
        assertThat(str).isNotNull()
                .isEqualTo("Xinh Dinh Hoa");
    }
    @Test
    void checkReveseTwoString()
    {
        java.lang.StringBuilder str1 = new java.lang.StringBuilder("word");
        java.lang.StringBuilder str2 = str1.reverse();
        assertThat(str2.toString()).isEqualTo("drow");
    }

}