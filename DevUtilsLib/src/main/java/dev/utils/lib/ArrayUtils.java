package dev.utils.lib;

public final class ArrayUtils {
    private ArrayUtils() {}

    public static void printArray(Object[] array) {
        for(Object object : array) {
            System.out.println(object.toString());
        }
    }
}
