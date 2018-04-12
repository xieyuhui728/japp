package Java.designmode.prototypePattern;

import java.io.Serializable;

/**
 * Created by xieyuhui on 2018/4/12.
 * 原型模式结构包含三个角色：
 *
 * 1。Prototype 抽象原型类：声明克隆方法的接口，是所有具体原型类的公共父类，
 * 可以是抽象类也可以是接口，甚至是具体是具体实现类。这个列子中Object充当抽象原型类
 *
 * 2。ConcretePrototype 具体原型类：实现Prototype中声明的克隆方法，在
 * 克隆方法中返回自己的一个克隆对象，这个列子中就是这个Customer类
 *
 * 3。Client 客户类：在客户类中创建一个原型对象，在通过调用原型对象的克隆方法即可
 * 得到多个相同的对象。客户类针对抽象原型类Prototype编程，因此用户可以根据需要选择
 * 具体原型类，系统具有较好的可扩展性。
 *
 */
public class Customer implements Serializable, Cloneable {

    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * 浅clone
     * 值类型把值复制一份给克隆对象
     * 引用类型把引用地址复制一份给克隆对象
     *
     * @return
     */
    public Customer shallowClone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (Customer) obj;
    }

    /**
     * 深clone
     * 无论是值类型还是引用类型都将值复制一份给克隆对象
     *
     * @return
     */
    public Customer deepClone() {
        Customer customerClone = new Customer();
        Address addressClone = new Address();

        Address address = this.getAddress();

        addressClone.setStreetName(address.getStreetName());
        addressClone.setDoorNum(address.getDoorNum());

        customerClone.setAddress(addressClone);
        return customerClone;
    }


}
