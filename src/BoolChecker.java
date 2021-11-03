import java.util.LinkedList;

public class BoolChecker {

    public static boolean check(String str) {
        LinkedList<Character> stack = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if (stack.isEmpty()) {
                stack.push(curr);
            }

            if (curr == 't' || curr == 'f') {
                stack.push(curr);
            }
            // Not
            if (curr == '!') {
                if (stack.peek() == 't') {
                    stack.pop();
                    stack.push('f');
                }
                if (stack.peek() == 'f') {
                    stack.pop();
                    stack.push('t');
                }
            }
            // Or
            if (curr == '|') {
                boolean isTrue = false;
                if (stack.peek() == 't') {
                    isTrue = true;
                }
                stack.pop();
                if (stack.peek() == 't') {
                    isTrue = true;
                }
                stack.pop();

                if (isTrue) {
                    stack.push('t');
                } else {
                    stack.push('f');
                }
            }
            // and
            if (curr == '&') {
                boolean firstIsTrue = false;
                if (stack.peek() == 't') {
                    firstIsTrue = true;
                }
                stack.pop();
                if (stack.peek() == 't' && firstIsTrue) {
                    stack.pop();
                    stack.push('t');
                } else {
                    stack.pop();
                    stack.push('f');
                }
            }

            // terminary
            if (curr == '?') {
                char c = stack.peek();
                stack.pop();
                char b = stack.peek();
                stack.pop();
                char a = stack.peek();
                stack.pop();
                // a ? b : c. if a = t its b else c
                if (a == 't') {
                    stack.push(b);
                } else {
                    stack.push(c);
                }
            }

        }
        if(stack.isEmpty()) {
            throw new IllegalStateException("Invalid argument");
        }
        if(stack.peek() == 't') {
            return true;
        }
        return false;
    }
}
