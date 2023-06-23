package listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGListeners.class)
@Test
public class Main {

    @Test
    public void test1(){
        System.out.println("I am test 1");
    }
    @Test
    public void test2(){
        System.out.println("I am test 2");
    }
    @Test
    public void test3(){
        System.out.println("I am test 3");
    }
}
