package com.johnsonb;

import java.util.Map;
import java.util.Iterator;

public class Main {
  private static Playground playground;

  /**
   * @param args
   */
  public static void main(String[] args) {
    playground = new Playground();
    Map<String, String> myFaves = playground.myFavorites();

    playground.hello();
    showMyFavorites(myFaves);
    getUserFavoriteMovie();
  }

  /**
   * @param favesList
   */
  private static void showMyFavorites(Map<String, String> favesList) {
    System.out.println(String.format("A list of my favorites:"));
    Iterator it = favesList.entrySet().iterator();
    while (it.hasNext()) {
      Map.Entry pair = (Map.Entry)it.next();
      System.out.println(pair.getKey() + " = " + pair.getValue());
      it.remove();
    }
  }

  private static void getUserFavoriteMovie() {
    playground.getUserFavoriteMovie();
  }
}
