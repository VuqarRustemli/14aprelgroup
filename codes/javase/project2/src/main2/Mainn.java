package main2;

public class Mainn {
    public static void main(String[] args) {

        GameCharacter character = new GameCharacter(new SlowRun());

        character.performRun();

        character.setRunStrategy(new FastRun());

        character.performRun();
    }
}