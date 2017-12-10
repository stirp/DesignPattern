package me.shrp.iterator;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Description
 * Created by lynxs on 2017/12/10.
 */
public class Main {
    public static void main(String[] args) {
        final Iterator<String> iterator = Arrays.asList("1", "2", "3", "4").iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
