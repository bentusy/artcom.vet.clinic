package artcom.develop.java.clinic.ui.fx;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestClassTest {

    @Test
    public void testStrAdd() throws Exception {
        TestClass t = new TestClass();
        String s1 = t.strAdd("1", "2");
        assertEquals("12", s1);
    }
}