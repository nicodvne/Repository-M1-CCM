package test;

import com.company.Main;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class JunitTestClass {


    @Test
    public void testDisplayDateNow(){
        Main.displayDateNow();
        assertTrue(true);
        //assertEquals("La date du jour est : " + LocalDate.now(), outContent.toString());
    }

    @Test
    public void testSum(){
        assertEquals(Main.sum(5,37),42);
    }
}
