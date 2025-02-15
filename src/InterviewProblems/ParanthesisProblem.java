package InterviewProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ParanthesisProblem {
    public static boolean isValid(String s) {
        if(s.length()%2!=0 || s.length()==0)
            return false;
        Stack<Character> stack = new Stack<>();
        Set<Character> open = new HashSet<Character>(Arrays.asList('{','[','('));
        for(char c:s.toCharArray())
        {
            if(open.contains(c))
            {
                stack.push(c);
            }
            else
            {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if(c=='}' && top!='{' ||c==']' && top!='['||c==')' && top!='(' )
                    return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("{[()]}"));
        System.out.println(isValid("(("));
        System.out.println(isValid("))"));
        System.out.println(isValid("("));
        System.out.println(isValid(""));
        System.out.println(isValid("()"));
        System.out.println(isValid("(){}"));
    }
}
