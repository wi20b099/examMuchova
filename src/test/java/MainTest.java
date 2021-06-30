import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void test_Given_IfInTheRange(){
        // arrange

        // act
        int actual = Main.generateNumber();
        if (actual >= 0)
            if (actual <=100) actual=1;
            else actual =0;
        // assert
        Assertions.assertEquals("1", actual);
    }

    @Test
    public void test_If_The_Lenghts_Is_The_Same(){
        //arrange

        //act
        int a;
        a=Main.Message().length();
        //assert
        //Assertions.assertTrue("9", a);

        Assertions.assertEquals(23,Main.Message().length());
    }


}

