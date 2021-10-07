package familytree;

import java.sql.Date;

public class FamilyTree {
    private NNode<Person> familyTree;
    public FamilyTree(NNode<Person> familyTree) {
        this.familyTree = familyTree;
    }

    public static NNode<Person> generateFamily() {

        boolean dead = false;
        boolean alive = true;
        // youngest gen
        Person bob = new Person("Bob Nuts", new Date(2019, 4, 20), alive, Gender.MALE);
        Person kim = new Person("Kim Nuts", new Date(2021, 1, 4), alive, Gender.FEMALE);
        NNode<Person> bobNode = new NNode<>(bob);
        NNode<Person> KimNode = new NNode<>(kim);

        // youngest parents
        Person jeff = new Person("Jeff Nuts", new Date(1992, 10, 10), alive, Gender.MALE);
        Person monica = new Person("Monica bruh", new Date(1994, 9, 20), alive, Gender.FEMALE);
        NNode<Person> jeffsFam = new NNode<>(jeff);
        jeffsFam.addPartner(monica);
        jeffsFam.addKid(bobNode);
        jeffsFam.addKid(KimNode);

        // child of John without family
        Person greg = new Person("Greg Nuts", new Date(1993, 3, 30), alive, Gender.MALE);
        NNode<Person> gregNode = new NNode<>(greg);

        // middle gen
        Person john = new Person("John Nuts", new Date(1960, 7, 15), alive, Gender.MALE);
        Person catherine = new Person("Catherine Williams", new Date(1965, 5, 22), alive, Gender.FEMALE);
        NNode<Person> johnsFem = new NNode<>(john);
        johnsFem.addPartner(catherine);
        johnsFem.addKid(jeffsFam);
        johnsFem.addKid(gregNode);

        return johnsFem;
    }
}
