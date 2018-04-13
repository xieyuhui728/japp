package Java.designmode.builderPattern;

/**
 * Created by xieyuhui on 2018/4/13.
 * 指挥者类：又称导演类，他负责安排复对象的建造次序，
 * 指挥者和抽象建造者之间存在关联关系，可以在construct()建造
 * 方法中调用建造者对象的部件构造和装配方法，完成复杂对象的建造。
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
