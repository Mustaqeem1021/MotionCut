import java.util.HashMap;
import java.util.Map;

public class URLShortener {
    private Map<String, String> urlMap;
    private Map<String, String> reverseUrlMap;
    private static final String BASE_URL = "http://short.url/";

    public URLShortener() {
        urlMap = new HashMap<>();
        reverseUrlMap = new HashMap<>();
    }

    public String shortenURL(String longURL) {
        if (urlMap.containsKey(longURL)) {
            return urlMap.get(longURL);
        }

        String shortURL = BASE_URL + longURL.hashCode();
        urlMap.put(longURL, shortURL);
        reverseUrlMap.put(shortURL, longURL);

        return shortURL;
    }

    public String expandURL(String shortURL) {
        return reverseUrlMap.get(shortURL);
    }
}
