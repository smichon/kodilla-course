package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(PoemDecorator poemDecorator) {
        poemDecorator.decorate();
    }

    public static void lettersUpperCase() {
        String text = "text to be changed by UpperCase";
        System.out.println(text.toUpperCase());
    }

    public static void replaceELetterWith3() {
        String text = "\nIn this text one letter is replaced by number";
        System.out.println(text.replace('e','3'));
    }
}
