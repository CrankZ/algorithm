/**
链接：https://www.nowcoder.com/questionTerminal/6aa9e04fc3794f68acf8778237ba065b
来源：牛客网

所有的丑数分为三种类型 2*i,3*i,5*i     其中 i是数组中的元素，一开始只有1
2*1  3*1  5*1
2*2  3*1  5*1
2*2  3*2  5*1
2*3  3*2  5*1
2*3  3*2  5*2
2*4  3*3  5*2
2*5  3*3  5*2
2*5  3*4  5*2
2*6  3*4  5*3
2*8  3*5  5*3
2*8  3*6  5*4
**/
public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if (index < 7)
            return index;
        int[] ret = new int[index];
        ret[0] = 1;
        int t2 = 0, t3 = 0, t5 = 0;
        for (int i = 1; i < index; i++) {
            ret[i] = min(min(ret[t2]*2, ret[t3]*3), ret[t5]*5);
            if (ret[i] == ret[t2]*2)
                t2++;
            if (ret[i] == ret[t3]*3)
                t3++;
            if (ret[i] == ret[t5]*5)
                t5++;
        }
        return ret[index-1];
    }
    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}