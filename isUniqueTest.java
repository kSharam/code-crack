import org.junit.Test;

import static org.junit.Assert.*;

public class isUniqueTest {

//import org.junit.Test;

//import static org.junit.Assert.assertEquals;


    @Test
    public void isUniqueTest() {
        isUnique classUnderTest = new isUnique();
        assertEquals(true, classUnderTest.isUnique("try"));
    }

    @Test
    public void isUniqueTest1() {
        isUnique classUnderTest = new isUnique();
        assertEquals(false, classUnderTest.isUnique("mom"));
    }
}