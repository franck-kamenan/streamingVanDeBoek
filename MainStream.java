package be.intecbrussel.streaming;

import java.util.stream.Stream;

public class MainStream {

    public static void main(String[] args) {


        String[] words = {"Hello", "this", "is", "a", "stream"};

        Stream.of(words)
                .forEach(System.out::println);
    }
}
