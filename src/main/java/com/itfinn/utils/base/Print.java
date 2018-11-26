package com.itfinn.utils.base;

import java.io.PrintStream;

/**
 * Created by xiefei on 2018/3/5 0005.
 */
public class Print {
    // 换行打印
    public static void print(Object text) {
        System.out.println(text);
    }

    // 打印一行空行
    public static void print() {
        System.out.println();
    }

    // 不换行打印
    public static void printnl(Object text) {
        System.out.print(text);
    }

    // The new Java SE5 printf() (from C):
    public static PrintStream printf(String format, Object... args) {
        return System.out.printf(format, args);
    }
}
