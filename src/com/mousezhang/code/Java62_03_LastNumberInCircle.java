/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * // 面试题62：圆圈中最后剩下的数字
 * // 题目：0, 1, …, n-1这n个数字排成一个圆圈，从数字0开始每次从这个圆圈里
 * // 删除第m个数字。求出这个圆圈里剩下的最后一个数字。
 */
package com.mousezhang.code;

public class Java62_03_LastNumberInCircle {
	/** 方法三：约瑟夫经典解法，O(N)，空间复杂度O(1) */
	public int LastRemaining_Solution(int n, int m) {
		if (n == 0) {
			return -1;
		}
		int last = 0;
		for (int i = 2; i<= n; i++){
			last = (last + m) % i;
		}
		return last;
	}
}