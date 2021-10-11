import java.util.ArrayList;
import java.util.List;

public class CustomHashMap<K, V> {
    // private List<Entry> entries;
    // Entry[] entries = (Entry[]) new Object[10];
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
        // this.entries = new ArrayList<>();
        // entries = new Entry[];
        this.entries = new ArrayList<>(10);
        System.out.println(entries.get(0));
    }

    // public V get(K key) {

    // }

    // public void put(K key, V value) {
    //     int index = key.hashCode();
    //     if()
    //     entries[index] = new Entry(key, value);
    // }
}