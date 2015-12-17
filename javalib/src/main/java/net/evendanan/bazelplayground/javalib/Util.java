package net.evendanan.bazelplayground.javalib;

public class Util {
    public static String getLibName() {
        return Util.class.getPackage().getName();
    }
}
