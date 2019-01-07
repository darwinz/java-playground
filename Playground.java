import java.util.Map;
import java.util.HashMap;

class Playground {
  public static void Playground() {

  }

  public void hello() {
    System.out.println("Hello world!");
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
