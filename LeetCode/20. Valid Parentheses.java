class Solution {
    public boolean isValid(String s) {
                Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.size() == 0)
                    return false;
                char in = stack.pop();
                char out;
                if (c == ')')
                    out = '(';
                else if (c == ']')
                    out = '[';
                else {
                    out = '{';
                }
                if (in != out)
                    return false;
            }
        }
        if (stack.size() != 0)
            return false;
        return true;
    }
}