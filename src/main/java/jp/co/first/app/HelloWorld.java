package jp.co.first.app;

import java.util.stream.Stream;

/**
 * Created by pc-326 on 15/02/22.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Stream.of("Hello World").forEach(System.out::println);
    }
}
