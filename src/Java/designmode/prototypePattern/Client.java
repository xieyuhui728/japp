package Java.designmode.prototypePattern;

/**
 * Created by xieyuhui on 2018/4/12.
 * 客户端类
 */
public class Client {

    public static void main(String[] args) {
        Customer customer = new Customer();
        Address address = new Address();
        address.setStreetName("长宁路");
        address.setDoorNum("999号");
        customer.setAddress(address);

        Customer customerShallowClone = customer.shallowClone();

        System.out.println(customer == customerShallowClone);
        System.out.println(customer.getAddress() == customerShallowClone.getAddress());

        Customer customerDeepClone = customer.deepClone();

        System.out.println(customer == customerDeepClone);
        System.out.println(customer.getAddress() == customerDeepClone.getAddress());
    }
}
