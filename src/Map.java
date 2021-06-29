import java.util.HashMap;

public class Map {

    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap();

        trackList.put("First Song", "Some Lyrics  1");
        trackList.put("Second Song", "Some Lyrics  2");
        trackList.put("Third Song", "Some Lyrics  3");
        trackList.put("Forth Song", "Some Lyrics  4");

        System.out.println(trackList);
        System.out.println(trackList.get("First Song"));
        trackList.get("First Song");
        trackList.forEach((k, v) ->
                System.out.println(k + ": " + v));
    }
}
