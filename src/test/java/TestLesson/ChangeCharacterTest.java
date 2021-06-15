package TestLesson;
import static org.assertj.core.api.Java6Assertions.*;
import org.junit.jupiter.api.*;

class ChangeCharacterTest {
    ChangeCharacter change = new ChangeCharacter();
    @Test
    void checkSequence()
    {
        String str="you only live once. but if you do it right. once is enough";
        String acb = change.changeUppercase(str);
       assertThat(acb).isEqualTo("You Only Live Once. But If You Do It Right. Once Is Enough");

    }
    @Test
    void checkSequence2()
    {
        String str="you only live once. but if you do it right. once is enough";
        String abc = change.uppercase(str);
       assertThat(abc).isNotNull()
       .isEqualTo("You only live once. But if you do it right. Once is enough");


    }


}