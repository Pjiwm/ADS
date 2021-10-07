import java.util.Date;
import java.util.LinkedList;

import Polynomials.PolynomialFactory;
import Stacks.BracketDeLimiter;
import Utils.AppUtils;
import animal.*;
import employee.*;
import familytree.*;
import linkedlist.CustomLinkedList;
import miscellaneous.ArraySorter;
import miscellaneous.MagicBox;
import miscellaneous.Recursive;
import priorityqueue.*;

public class App {
    public static void main(String[] args) {
        int[] array = { 9, 1, 3, 7, 4, 10, 6, 5, 19, 12, 15, 13, 300, 20, 11, 3, 1, 1, 30, 40, 50, 44, 9 };
        int[] orderedArray = { 1, 4, 7, 11, 15, 20, 30, 44, 60, 90, 100, 104, 110 };
        int[] a = { 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 };
        int[] b = { 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024 };
        AppUtils.line("Employee List");
        EmployeeList<Employee> employeeList = new EmployeeList<>();
        employeeList.add(new Employee("Bob", 2000));
        employeeList.add(new Employee("Dick", 2500));
        employeeList.add(new Employee("Hank", 4000));
        employeeList.add(new Employee("Joe", 3000));
        EmployeeList<Employee> employeeListCopy = employeeList.clone();
        System.out.println(employeeListCopy.size());
        System.out.println(employeeListCopy.get(0).toString() + " " + employeeList.get(0).toString());
        AppUtils.line("BracketDeLimiter");
        System.out.println(BracketDeLimiter.isBalanced("(())"));
        System.out.println(BracketDeLimiter.isBalanced("((())"));
        System.out.println(BracketDeLimiter.isBalanced("()))"));
        AppUtils.line("search-ary tree");
        BTreeNode<Integer> tree = new BTreeNode<>(6);
        tree.insert(4);
        tree.insert(8);
        tree.insert(3);
        tree.insert(5);
        tree.insert(7);
        tree.insert(9);
        System.out.println(tree);








    }
}
