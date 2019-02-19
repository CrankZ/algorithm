public class Solution {
    // 空间换时间
    // 数字为0-9，所以搞10个数组，然后分别统计数量
    public int MoreThanHalfNum_Solution(int [] array) {
        if (array == null || array.length <= 0)
            return 0;
        int[] arr = new int[10];
        int len = array.length / 2;
        for (int i : array)
            arr[i]++;
        for (int i = 0; i < 10; i++)
            if (arr[i] > len)
                return i;
        return 0;
    }
}