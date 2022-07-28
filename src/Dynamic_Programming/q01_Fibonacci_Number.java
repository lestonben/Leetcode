package Dynamic_Programming;

/*
    https://leetcode.com/problems/fibonacci-number/
 */

public class q01_Fibonacci_Number {

    public int fib(int n) {
        if (n<=1) return n;
        return fib(n-1) + fib(n-2);
    }

    /*
        n <= 1, because initially begins with 1 instead of 0
        by the time when n-1 and n-2 occurs, have chance of getting n = 0/1, so have to put <= sign
     */
}
