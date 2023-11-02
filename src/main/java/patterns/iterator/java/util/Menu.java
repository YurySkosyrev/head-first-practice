package patterns.iterator.java.util;

import java.util.Iterator;

public interface Menu {
    Iterator<MenuItem> createIterator();
}
