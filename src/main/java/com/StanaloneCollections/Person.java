package com.StanaloneCollections;
import java.util.*;

public class Person {
    private List<String> friends;
    private Map<String,Integer> feestructure;
    private Properties prop;
    
    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }


    public Map<String, Integer> getFeestructure() {
        return feestructure;
    }

    public void setFeestructure(Map<String, Integer> feestructure) {
        this.feestructure = feestructure;
    }

    

    public Properties getProp() {
        return prop;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }

    @Override
    public String toString() {
        return "Person [friends=" + friends + ", feestructure=" + feestructure + ", prop=" + prop + "]";
    }
    
    
}
