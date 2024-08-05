package dev.lpa;

public class Main {
    public static void main(String[] args) {
        Integer boxedInt=Integer.valueOf(15);
        Integer deprecatedBoxing=new Integer(15);
        int unboxedInt=boxedInt.intValue();

        Integer autoBoxed = 15;
        int autoUnboxed=autoBoxed;
        System.out.println(autoBoxed.getClass().getName());
    }
}
