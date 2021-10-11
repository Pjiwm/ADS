public class Name {
    // key
    private String first, second;

    public Name(String first, String second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Name)) {
            return false;
        }
        Name name = (Name) o;
        return name.first.equals(this.first) && name.second.equals(this.second);
    }

    @Override
    public int hashCode() {
        return first.hashCode() ^ second.hashCode();
    }

}