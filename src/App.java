import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import LinkedList.CustomLinkedList;
import Polynomials.PolynomialFactory;
import Utils.AppUtils;
import animal.Animal;
import animal.AnimalShelter;
import animal.Cat;
import animal.Dog;
import employee.Employee;
import miscellaneous.ArraySorter;
import miscellaneous.MagicBox;
import miscellaneous.Recursive;

public class App {
    public static void main(String[] args) {
        AppUtils.line("Programmeer vraag 1");
        int[] array = { 9, 1, 3, 7, 4, 10, 6, 5, 19, 12, 15, 13, 300, 20, 11, 3, 1, 1, 30, 40, 50, 44, 9 };
        int[] orderedArray = { 1, 4, 7, 11, 15, 20, 30, 44, 60, 90, 100, 104, 110 };
        int[] a = { 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 };
        int[] b = { 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024 };
        AppUtils.line("recursive");
        System.out.println(Recursive.maxrec(array));
        System.out.println(Recursive.binarySearch(orderedArray, 7));
        System.out.println(Recursive.reverseString("these nuts"));
        System.out.println(Recursive.palindromeSearch("Jij slaapt, ronkt, knort; ronkt, knort pa als jij?"));

        AppUtils.line("array sorting");
        AppUtils.printArr(ArraySorter.bubbleSort(array));

        AppUtils.line("array Polynomial");
        System.out.println(PolynomialFactory.addPolynomials());

        AppUtils.line("Magic box");
        System.out.println(MagicBox.generate(5));

        AppUtils.line("Linked List");
        CustomLinkedList<Integer> list = new CustomLinkedList<>();  
        list.addBack(1);
        list.addBack(6);
        list.addBack(4);
        list.addFront(4);
        System.out.println(list.count());    
        LinkedList<String> linkList = new LinkedList<String>();
        System.out.println(Recursive.multipleReverse("abcd"));    

        AppUtils.line("Animals");
        Animal pikkie = new Dog("pikkie", 69);
        Animal poesje = new Cat("peosje");
        poesje.makeSound();
        pikkie.makeSound();
        AnimalShelter<Animal> shelter = new AnimalShelter<>();
        AnimalShelter<Dog> dogShelter = new AnimalShelter<>();
        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("bob", 6000));
        employees.add(new Employee("Joe", 2000));
        employees.add(new Employee("Hank", 1600));
        employees.add(new Employee("Bill", 10000));
        LinkedList<Employee> employeeCopy = (LinkedList<Employee>) employees.clone();
        System.out.println(employeeCopy.getFirst().toString() + employees.getFirst().toString());
        


        
    }
}
