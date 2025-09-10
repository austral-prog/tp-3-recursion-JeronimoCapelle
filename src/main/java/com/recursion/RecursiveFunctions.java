package com.recursion;

import java.util.List;

public class RecursiveFunctions {

    public static int recursiveIndexOf(List<String> list, String target) {
        if (!list.contains(target)) {return -1;}

        if (!list.getFirst().equals(target)) {
            return 1 + recursiveIndexOf(list.subList(1, list.size()), target);
        }
        return 0;
    }

    public static int recursiveIndexOfByIndex(List<String> list, String target, int index) {
        int res = recursiveIndexOf(list.subList(index, list.size()), target);
        if  (res != -1) {return res + index;} return res;
    }


    public static int recursiveIndexOfEmpty(List<String> list) {
        return recursiveIndexOf(list, "");
    }

    public static int recursivePut(String target, List<String> list) {
        int index = recursiveIndexOf(list,"");
        if (index != -1) {
        list.set(index, target);
        }
        return index;
    }

    public static int recursiveRemove(List<String> list, String target) {
        if (!list.contains(target)) {return 0;}

        if (list.getFirst().equals(target)) {
            return 1 + recursiveRemove(list.subList(1, list.size()), target);
        }
        return recursiveRemove(list.subList(1, list.size()),target);
    }

    public static int recursiveSum(List<Integer> list) {
        if (list.isEmpty()) {return 0;}
        return list.getFirst() + recursiveSum(list.subList(1, list.size()));
    }

    public static int recursiveFactorial(int n) {
        if (n == 0) return 1;
        return n * recursiveFactorial(n - 1);
    }

    public static int recursivePow(int base, int exponent) {
        if (exponent == 0) return 1;
        return base * recursivePow(base, exponent-1);
    }

    public static int recursiveFibonacci(int n) {
        if (n <= 1) return n;
        return recursiveFibonacci(n-1) + recursiveFibonacci(n-2);
    }

    public static boolean recursivePalindrome(String word) {
        if (word.length() == 1) return true;
        if (word.charAt(0) == word.charAt(word.length() - 1)) {
            return recursivePalindrome(word.substring(1, word.length() - 1));
        }
        return false;
    }


}
