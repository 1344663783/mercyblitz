package collection;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class ThreadSafeCollection {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        Collections.synchronizedList(integers);
        new CopyOnWriteArraySet();
        new ConcurrentSkipListSet();
    }
}
