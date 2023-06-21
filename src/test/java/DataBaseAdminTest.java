import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class DataBaseAdminTest {


    DataBaseAdmin dataBaseAdmin;

    @Before
    public void before(){
        dataBaseAdmin = new DataBaseAdmin("Steve", "JP, 193, 627, F", 50000);
    }


    @Test
    public void DBAHasName(){
        assertEquals("Steve", dataBaseAdmin.getName());
    }

    @Test
    public void DBAHasNINum(){
        assertEquals("JP, 193, 627, F", dataBaseAdmin.getNINum());
    }

    @Test
    public void DBAHasSalary(){
        assertEquals(50000, dataBaseAdmin.getSalary());
    }

    @Test
    public void DBACanRaiseSalary(){
        dataBaseAdmin.raiseSalary(5000.00);
        assertEquals(55000, dataBaseAdmin.getSalary());
    }

    @Test
    public void DBACanReceiveBonus(){
        dataBaseAdmin.payBonus();
        assertEquals(50500, dataBaseAdmin.getSalary());
    }

}

