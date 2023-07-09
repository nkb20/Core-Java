package hash;

import java.util.HashSet;
import java.util.Set;

public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<Integer>();
        Set seen = new HashSet();

        set.add(2);
        set.add(5);
        set.add(5);
        set.add(2);
        System.out.println(set);
        seen.add(2);
        seen.add("sdkus"+25+2);
        seen.add(2);
        System.out.println(seen);

    }
}
