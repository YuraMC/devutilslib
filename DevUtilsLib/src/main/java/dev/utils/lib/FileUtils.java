package dev.utils.lib;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class FileUtils {

    private FileUtils() {}

    public static String[] readFileArray(File filePath) throws IOException {
        final BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        final List<String> result = new ArrayList<>();

        String line;

        while((line = bufferedReader.readLine()) != null) {
            result.add(line);
        }

        final Object[] src = result.toArray();
        final String[] dest = new String[src.length];

        System.arraycopy(src, 0, dest, 0, src.length);


        return dest;
    }

    public static List<String> readFileList(File filePath) throws IOException {
        final List<String> result = new ArrayList<>();
        final BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

        String line;

        while((line = bufferedReader.readLine()) != null) {
            result.add(line);
        }

        return result;
    }
}
