package org.launchcode.java.demos.lsn6inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class inheritanceTest {

    @Test
    public void inheritsSuperInFirstConstructor() {
        HouseCat_child keyboardCat = new HouseCat_child("Keyboard Cat", 7);
        assertEquals(7, keyboardCat.getWeight(), .001);
    }

}
