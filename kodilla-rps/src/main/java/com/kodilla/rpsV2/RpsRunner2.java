package com.kodilla.rpsV2;

public class RpsRunner2 {
    public static void main(String[] args) {

        while (!Game2.getInstance().isEnd()) {
            Game2.getInstance().intro();
            Game2.getInstance().allRoundsScore();
        }
    }
}
