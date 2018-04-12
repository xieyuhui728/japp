package Java.designmode.prototypePattern;

import java.io.Serializable;

/**
 * Created by xieyuhui on 2018/4/12.
 */
public class Address implements Serializable,Cloneable {

    private String streetName;

    private String doorNum;

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getDoorNum() {
        return doorNum;
    }

    public void setDoorNum(String doorNum) {
        this.doorNum = doorNum;
    }
}
