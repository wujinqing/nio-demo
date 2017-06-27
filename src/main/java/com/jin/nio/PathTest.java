package com.jin.nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author wu.jinqing
 * @date 2017年03月08日
 */
public class PathTest {
    public static void main(String[] args) throws IOException {
        Path path = FileSystems.getDefault().getPath("C:\\Users\\wujq\\Desktop", "TXT.txt");

        System.out.println(path.toString());
        BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8);

        String buf;
        while ((buf = reader.readLine())!= null)
        {
            System.out.println(buf);
        }

    }
}
