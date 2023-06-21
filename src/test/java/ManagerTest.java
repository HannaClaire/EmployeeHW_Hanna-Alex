import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Steve", "JP, 193, 627, F", 50000, "Accounting");
    }


    @Test
    public void managerHasName(){
        assertEquals("Steve", manager.getName());
    }

    @Test
    public void managerHasNINum(){
        assertEquals("JP, 193, 627, F", manager.getNINum());
    }

    @Test
    public void managerHasSalary(){
        assertEquals(50000, manager.getSalary());
    }

    @Test
    public void managerCanRaiseSalary(){
        manager.raiseSalary(5000.00);
        assertEquals(55000, manager.getSalary());
    }

    @Test
    public void managerCanReceiveBonus(){
        manager.payBonus();
        assertEquals(50500, manager.getSalary());
    }

    @Test
    public void managerHasDeptName(){
        assertEquals("Accounting", manager.getDeptName());
    }

    @Test
    public void managerCannotHaveNegativeRaise(){
        manager.raiseSalary(-5000.00);
        assertEquals(50000, manager.getSalary());
    }

    @Test
    public void managerCanChangeName(){
        manager.setName("Theresa");
        assertEquals("Theresa", manager.getName());
    }

    @Test
    public void managerNameNotNull(){
        manager.setName(null);
        assertEquals("Steve", manager.getName());
    }







}
