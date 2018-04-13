package Java.designmode.builderPattern;

/**
 * Created by xieyuhui on 2018/4/13.
 * 客户端一般只需要于Director指挥者进行交互，在客户端
 * 确定具体建造者的类型，并实例化具体建造者对象，然后通过
 * Setter方法或构造函数传入指挥者类。
 *
 * 在建造者模式中，客户端只需要实例化指挥者类，指挥者类针对
 * 抽象建造者编程，客户端根据需要传入具体的建造者类型，指挥者
 * 将指导具体建造者一步一步构造一个完整的产品，相同的构造过程
 * 可以创建完成不同的产品。
 */
public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
    }


}
