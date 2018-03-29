package Java.designmode.templatePattern;

/**
 * Created by xieyuhui on 2018/3/22.
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game cricket = new Cricket();
        cricket.play();

        Game football = new Football();
        football.play();
    }
}
