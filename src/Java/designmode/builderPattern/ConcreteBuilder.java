package Java.designmode.builderPattern;

/**
 * Created by xieyuhui on 2018/4/13.
 * 具体的建造者，实现各个部件的具体构造和装配方法，
 * 定义并明确它所创建的复杂对象。
 */
public class ConcreteBuilder extends  Builder{
    @Override
    void buildPartA() {
        System.out.println("ConcreteBuilder buildPartA");
    }

    @Override
    void buildPartB() {
        System.out.println("ConcreteBuilder buildPartB");
    }

    @Override
    void buildPartC() {
        System.out.println("ConcreteBuilder buildPartC");
    }
}
