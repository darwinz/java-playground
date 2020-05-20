package com.johnsonb;

import static org.junit.Assert.*;

public class PlaygroundTest {

    private Playground playground;

    @Before
    public void setUp() {
        playground = new Playground();
    }

    @Test
    public void hello() {
        playground.hello();

    }

    @Test
    public void getUserFavoriteMovie() {
    }

    @Test
    public void myFavorites() {
    }
}