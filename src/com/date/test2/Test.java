package com.date.test2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] src={1,2,3,4};
        int[] srcs={5,6,7,8,9,22,33};
        System.arraycopy(src,0,srcs,2,4);
        System.out.println(Arrays.toString(srcs));
    }
}
