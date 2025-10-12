import org.junit.jupiter.api.*;

public class JunitCycleQuiz {

    @Test
    public void junitQuiz3(){
        System.out.println("This is first test");
    }

    @Test
    public void junitQuiz4(){
        System.out.println("This is secont test");
    }

    @BeforeEach
    public void BeforeEach(){
        System.out.println("Hello!Giho");
    }

    @AfterAll
    public static void AfterAll(){
        System.out.println("Bye!");
    }
}
