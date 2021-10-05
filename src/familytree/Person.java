package familytree;

import java.util.Date;

public class Person {
    private String name;
    private Date birthday;
    private boolean isAlive;
    private Gender gender;

    public Person(String name, Date birthday, boolean isAlive, Gender gender) {
        this.name = name;
        this.birthday = birthday;
        this.isAlive = isAlive;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "{" + " name='" + this.name + "'" + ", birthday='" + this.birthday + "'" + ", isAlive='" + this.isAlive
                + "'" + ", gender='" + this.gender + "'" + "}";
    }

    

}