package refactoring_tachPhuongThuc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CylinderTest {
    private Object assertEquals;

    @Test
    @DisplayName(" Testing Volume(0,0)")
    void testGetVolume0And0(){
        int radius=0;
        int height=0;
        double expected=0;
        double result=Cylinder.getVolume(radius,height);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName(" Testing Volume(1,2)")
    void testGetVolume1And2(){
        int radius=1;
        int height=2;
        double expected=20;
        double result=Cylinder.getVolume(radius,height);
        assertEquals(expected,result);
    }
}
