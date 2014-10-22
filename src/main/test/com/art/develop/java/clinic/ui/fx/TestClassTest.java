package com.art.develop.java.clinic.ui.fx;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestClassTest {


    @Test
    public void testStrAdd() throws Exception {

        ssClass t = new ssClass();


        assertEquals("ss1", t.strAdd("ss", "1"));
    }
}