package HWLesson4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Lesson4PointOne {

    public HashSet<String> uniqueString(String[] strings) {
        HashSet<String> hashSet = new HashSet<>();
        for (String s : strings) {
            hashSet.add(s);
        }
        return hashSet;
    }

    public HashMap<String, Integer> uniqueCounter(String[] strings) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String s: strings) {
            if (hashMap.containsKey(s)) {
                hashMap.put(s, hashMap.get(s) + 1);
            }
            else {
                hashMap.put(s, 1);
            }
        }
        return hashMap;
    }

}
