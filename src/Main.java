import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BigDecimal bg = new BigDecimal("100000000000000000000000000000000000000000000000000000000");
        System.out.println(bg);

        List<String> list = new ArrayList<>();
        list.add(0,"A");
        list.add(1,"B");
        list.add(2,"C");
        list.add(3,"D");
        list.add(4,"E");
        list.set(4,"F");//set:取代index的value，并将原来的value返回
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
