public class Solution {
    public String replaceSpace(StringBuffer str) {
    	String result = str.toString();
        result = result.replace(" ", "%20");
        return result;
    }
}

public class Solution {
    public String replaceSpace(StringBuffer str) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.toString().length(); i++) {
            if (String.valueOf(str.charAt(i)).equals(" ")) {
                sb.append("%20");
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}