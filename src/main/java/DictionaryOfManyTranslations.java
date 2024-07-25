import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private final HashMap<String, ArrayList<String>> translations;

    public DictionaryOfManyTranslations() {
        this.translations = new HashMap<>();
    }

    public void add(String word, String translation) {
        // an empty list has to be added for a new word if one has not already been added
        this.translations.putIfAbsent(word, new ArrayList<>());

        this.translations.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        if (translations.get(word) == null) {
            return new ArrayList<String>();
        }
        return translations.get(word);
    }

    public void remove(String word) {
        translations.remove(word);
    }
}
