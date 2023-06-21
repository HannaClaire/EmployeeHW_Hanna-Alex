import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Gemima", "kjdfkdjfkn", 120000, "Doin things right", 3000000.00);
    }

    @Test
    public void directorHasBudget(){
        assertEquals(3000000.0, director.getBudget(), 0.0);
    }

    @Test
    public void directorCanReceiveBonus(){
        director.payBonus();
        assertEquals(122400, director.getSalary());
    }


}
