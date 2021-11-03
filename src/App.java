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
        AppUtils.line("Test");
        ListNode<String> head = new ListNode<String>(null, "first");
        ListNode<String> second = new ListNode<String>(head, "second");
        ListNode<String> third = new ListNode<String>(second, "third");
        ListNode<String> fourth = new ListNode<String>(third, "fourth");
        System.out.println(head); // first, second, third, fourth
        ListNode<String> shallowCopy = head;
        ListNode<String> deepCopy = (ListNode<String>) head.clone();

        head.replaceAt(1, "replaced");
        ListNode<String> fifth = new ListNode<String>(fourth, "fifth");
        System.out.println(shallowCopy); // first, replaced, third, fourth, fifth 
        System.out.println(deepCopy); //
                                         // first, second, third, fourth

        // GameNode root = new GameNode(5, true);
        // System.out.println(root.countPlayerWins(true));
        // System.out.println(root.countPlayerWins(false));
    }
}
