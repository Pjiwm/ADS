package Stacks;

import java.util.Stack;

public class BracketDeLimiter {
    public static boolean isBalanced(String s) {
        Stack stack = new Stack();
        String[] tokens = s.split("");
        
        for (String token : tokens) {

            if (token.equals("(")) {
                stack.push(token);
            } else if (token.equals(")")) {
                // if a ")" bracket is added it can never be balanced, so it'll be added so it can
                // never return stack.size() == 0 as true.
                if (stack.isEmpty()) {
                    stack.push(token);
                } else if (stack.peek().equals("(")) {
                    stack.pop();
                }
            }
        }

        return stack.size() == 0;
    }
}