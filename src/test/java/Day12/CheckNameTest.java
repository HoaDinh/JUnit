package Day12;

import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.assertj.core.api.Java6Assertions.*;


class CheckNameTest {
    CheckName ck = new CheckName();
    @Test
    void getName()
    {
        String str= "hoa dinh    xinh";
       assertThat(ck.checkName(str)).containsOnlyDigits();
    }
    @Test
    void  staffID()
    {
        String staffID ="1267946NV";
        assertThat(staffID)
                .containsPattern("NV[1-9]{8}");



    }

}
