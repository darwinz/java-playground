package com.johnsonb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;

import static java.lang.System.out;

class Playground {
  public void hello() {
    out.println("Hello world!");
  }

  public void getUserFavoriteMovie() {
    System.out.println("What is your favorite movie? ");
    try {
      BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
      String faveMovie = bufferRead.readLine();

      System.out.printf("Your favorite movie is '%s'", faveMovie);
    }
    catch(IOException ex) {
      ex.printStackTrace();
    }
  }

  public Map<String, String> myFavorites() {
    Map<String, String> favorites = new HashMap<String, String>();
    favorites.put("Movie", "Count of Monte Cristo");
    favorites.put("TV Show", "Big Bang Theory");
    favorites.put("Book", "Mistborn");
    favorites.put("Programming Language", "Ruby");
    favorites.put("IDE", "JetBrains");
    favorites.put("Text Editor", "Vim");
    favorites.put("Food", "Sushi");
    favorites.put("Fruit", "Apple");
    favorites.put("Color", "Red");
    favorites.put("College Sports Team", "University of Utah Utes");
    favorites.put("Pro Basketball Team", "Utah Jazz");
    favorites.put("Pro Football Team", "Dallas Cowboys");

    return favorites;
  }
}
