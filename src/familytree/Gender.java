package familytree;
public enum Gender {
    MALE("male"), FEMALE("female");

    private String gender;

    private Gender(final String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}