package TestLesson;
import org.junit.jupiter.api.*;
import static org.assertj.core.api.Java6Assertions.*;

class FindUppercaseCharacterTest {
    FindUppercaseCharacter find = new FindUppercaseCharacter();

    @Test
    void checkUppercase(){
       //String str = "You Only Live Once. But if You do it right. once is Enough";
        String str = "you     Only Live Once. but if You do it right. once is Enough";
        int count = find.findUppercaseCharacter(str);
        //System.out.println(count);
        assertThat(count).isEqualTo(5);

    }

}