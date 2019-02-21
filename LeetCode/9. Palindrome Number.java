// 把数字拆开，逆向拼接回去
class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        if (x < 0) {
            return false;
        }

        int revertedNumber = 0;
        while (x != 0) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return revertedNumber == temp;
    }
}

// 字符串+栈的性质（先进后出）
    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            stack.push(c);
        }

        String out = "";
        while (!stack.isEmpty()) {
            char c = stack.pop();
            out += c;
        }
        if (out.equals(s))
            return true;
        return false;
    }