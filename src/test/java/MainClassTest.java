import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

 class MainClassTest {
    MainClass main = new MainClass();
    int a=0;
    int b=0;

    @Test
    @BeforeEach
    public void nhap()
    {
        a= 5;
        b=6;
    }
    @Test
      void comparison ()
    {
        assertEquals(10,main.sum(a,b));
    }
     @Test
     void comparisonSubtract ()
     {
         assertEquals(10,main.subtract(a,b));
     }

}