package net.evendanan.bazelplayground.javalib;

public class Util {
    public static String getLibName() {
        return Util.class.getPackage().getName();
    }

    public static String getLibNameWithJava8() {
        return getPackageNameFromNamer(()->getLibName());
    }

    public static String getPackageNameFromNamer(PackageNamer namer) {
        return namer.getPackageName();
    }

    public static interface PackageNamer {
        String getPackageName();
    }
}
