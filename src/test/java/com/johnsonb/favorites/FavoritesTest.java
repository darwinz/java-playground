package com.johnsonb.favorites;

import org.junit.*;
import java.util.Map;

import static org.junit.Assert.*;

public class FavoritesTest {

    private Favorites favorites;

    @Before
    public void setUp() {
        favorites = new Favorites();
    }

    @Test
    public void hello() {
        favorites.hello();
    }

    @Test
    public void getUserFavoriteMovie() {
    }

    @Test
    public void myFavoriteMovieReturnsValue() {
        Map<String, String> favoritesMap = favorites.myFavorites();
        assertEquals("Count of Monte Cristo", favoritesMap.get("Movie"));
    }
}
