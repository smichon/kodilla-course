package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify(() -> System.out.println("\n~~~~~~ " + "Text to beautify" + " *******"));
        poemBeautifier.beautify(()-> System.out.println(" __________________________________\n"+
                "|                                  |\n|***********Text to beautify-------|\n"+
                "|__________________________________|\n"));
        poemBeautifier.beautify(PoemBeautifier::lettersUpperCase);
        poemBeautifier.beautify(PoemBeautifier::replaceELetterWith3);
        poemBeautifier.beautify(() -> System.out.println("\nIn this text one letter is replaced by number"
                .replace("t", "1")));
        poemBeautifier.beautify(() -> System.out.println("\nText to hide".replaceAll(".","*")));
    }
}
