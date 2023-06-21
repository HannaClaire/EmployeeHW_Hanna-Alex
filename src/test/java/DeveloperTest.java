import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class DeveloperTest {


    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Steve", "JP, 193, 627, F", 50000);
    }


    @Test
    public void devHasName(){
        assertEquals("Steve", developer.getName());
    }

    @Test
    public void devHasNINum(){
        assertEquals("JP, 193, 627, F", developer.getNINum());
    }

    @Test
    public void devHasSalary(){
        assertEquals(50000, developer.getSalary());
    }

    @Test
    public void devCanRaiseSalary(){
        developer.raiseSalary(5000.00);
        assertEquals(55000, developer.getSalary());
    }

    @Test
    public void devCanReceiveBonus(){
        developer.payBonus();
        assertEquals(50500, developer.getSalary());
    }

}
