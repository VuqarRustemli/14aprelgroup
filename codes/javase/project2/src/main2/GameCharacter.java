package main2;

public class GameCharacter {

    private RunStrategy runStrategy;

    public GameCharacter(RunStrategy runStrategy) {
        this.runStrategy = runStrategy;
    }

    public void setRunStrategy(RunStrategy runStrategy) {
        this.runStrategy = runStrategy;
    }

    public void performRun() {
        runStrategy.run();
    }
}