package indi.yuantongchn.JZOffer11;

public class Solution {
    /*
    当 nums[m] > nums[j]nums[m]>nums[j] 时： m 一定在 左排序数组 中，即旋转点 x 一定在 [m + 1, j][m+1,j] 闭区间内，因此执行 i = m + 1；
    当 nums[m] < nums[j]nums[m]<nums[j] 时： m 一定在 右排序数组 中，即旋转点 x 一定在[i, m][i,m] 闭区间内，因此执行 j = m；
    当 nums[m] = nums[j]nums[m]=nums[j] 时： 无法判断 m 在哪个排序数组中，即无法判断旋转点 x 在 [i, m][i,m] 还是 [m + 1, j][m+1,j] 区间中。解决方案： 执行 j = j - 1 缩小判断范围，分析见下文。
    */
    public int minArray(int[] numbers) {
        int len = numbers.length;
        if (len == 0) {
            return numbers[0];
        }
        int l = 0;
        int r = len - 1;
        while (l < r) {
            int mid = (l + r) >> 1;
            //和右边比较
            if(numbers[mid] > numbers[r]) {
                l = mid + 1;
            }else if(numbers[mid] < numbers[r]) {
                r = mid;
            }else{
                r--;
            }
        }
        return numbers[l];
    }
}
