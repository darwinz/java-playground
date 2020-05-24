package com.johnsonb;

import org.junit.Before;
import org.junit.Test;
import java.util.Map;

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
    public void myFavoriteMovieReturnsValue() {
        Map<String, String> favorites = playground.myFavorites();
        assertEquals("Count of Monte Cristo", favorites.get("Movie"));
    }
}