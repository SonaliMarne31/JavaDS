package Strings;
import java.util.*;

public class EncodeDecodeTinyURL {
    Map<Integer, String> map = new HashMap<>();
    
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        map.put(longUrl.hashCode(), longUrl);
        return "http://tinyurl.com/" + longUrl.hashCode();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String str = shortUrl.replace("http://tinyurl.com/", "");
        return map.get(Integer.parseInt(str));
    }
}
