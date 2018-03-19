/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * // 面试题15：二进制中1的个数
 * // 题目：请实现一个函数，输入一个整数，输出该数二进制表示中1的个数。其中负整数用补码表示。例如
 * // 把9表示成二进制是1001，有2位是1。因此如果输入9，该函数输出2。
 */
package com.mousezhang.code;

public class Java15_02_NumberOf1InBinary {
	/**
	 * 把一个整数减1，再和原整数做位与运算，会把该整数最右边一个1变成0
	 * 一个整数的二进制表示有多少个1，就可以进行多少次这样的操作
	 * @param n
	 * @return
	 */
    public int NumberOf1(int n) {
        int count = 0;
        while(n != 0){
            count++;
            n = n & (n - 1);	//每一次将最后一个1变成0
         }
        return count;
    }
}