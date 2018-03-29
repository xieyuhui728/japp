package Java.designmode.templatePattern;

/**
 * Created by xieyuhui on 2018/3/22.
 */
public class Football extends Game{
    @Override
    void initialize() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
