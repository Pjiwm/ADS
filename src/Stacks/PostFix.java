package Stacks;

import java.util.Stack;

public class PostFix {
    public static int calcuate(String epxression) {
        Stack<Integer> stack = new Stack<Integer>();
        String[] tokens = epxression.split(" ");

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            if (tryParseInt(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int first, second;
                try {
                    first = stack.pop();
                    second = stack.pop();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }

                switch (token) {
                    case "+":
                        stack.push(first + second);
                        break;
                    case "-":
                        stack.push(first - second);
                        break;
                    case "*":
                        stack.push(first * second);
                    case "/":
                        stack.push(first / second);
                        break;
                    default:
                        return -1;
                }
            }
        }
        if(stack.size() != 1) {
            return -1;
        }
        return stack.pop();
    }

    private static boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
