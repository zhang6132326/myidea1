package com.zxf.singleton;

public class Main1 {
    public static void main(String[] args) {
        Mgr01 mgr01=Mgr01.getInstance();
        Mgr01 mgr02=Mgr01.getInstance();
        System.out.println(mgr01==mgr02);
    }
}
