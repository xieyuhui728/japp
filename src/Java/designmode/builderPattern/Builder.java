package Java.designmode.builderPattern;

/**
 * Created by xieyuhui on 2018/4/13.
 *
 * 建造者模式：如果我们需要创建复杂对象并希望系统具备很好的
 * 灵活性和可扩展性，可以考虑使用建造者模式。
 * 它的核心在于如何一步步构建一个包含多个组件部件的完整对象，
 * 使用相同的构建过程构建不同的产品。
 *
 *
 * 抽象建造者：它为创建一个产品Product对象的各个部件指定抽象接口类，
 * 建造这一般声明两类方法，一类方法是buildPartX(),它们用于创建复杂对象的各个部件；
 * 另一类方法是getResult()，它们用于返回复杂对象。
 */
public abstract class Builder {

    private Product product = new Product();

    abstract void buildPartA();

    abstract void buildPartB();

    abstract void buildPartC();

    public Product getResult() {
        return product;
    }


}
