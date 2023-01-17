package com.org.google;

public class increment {
    public static void main(String[] args) {
        int x=0;
        int y=1;
      y=++x + x++ + ++x +y + ++x + ++x - --x + x + x-- - --x;
        System.out.println(x);
        System.out.println(y);
    }
}
