// 数组构造哈希表
public class Solution {
    //Insert one char from stringstream
    String s = "";
    int hash[] = new int[256];
    public void Insert(char ch)
    {
        s += ch;
        hash[ch] += 1;
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        char[] str = s.toString().toCharArray();
        for (char c : str) {
            if (hash[c] == 1)
                return c;
        }
        return '#';
    }
}