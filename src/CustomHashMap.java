import java.util.ArrayList;
import java.util.List;

public class CustomHashMap<K, V> {
    List<Entry> entries;

    class Entry {
        K key;
        V value;
        public Entry next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public CustomHashMap() {
        this.entries = new ArrayList<>(5);
        int i = 0;
        while (i < 5) {
            entries.add(i, null);
        }
    }

    public V get(K key) {
        int index = getIndex(key);
        Entry current = entries.get(index);
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            } else {
                current = current.next;
            }
        }
        throw new IllegalStateException("Key does not exist.");
    }

    public void put(K key, V value) {
        int index = key.hashCode();
        Entry newEntry = new Entry(key, value);
        if (entries.get(index) == null) {
            entries.add(index, newEntry);
        } else {
            newEntry.next = entries.get(index);
            entries.add(index, newEntry);
        }
    }

    private int getIndex(K key) {
        int hashCode = key.hashCode();
        if(hashCode < 0) {
            hashCode *= -1;
        }
        return hashCode % entries.size();
    }
}