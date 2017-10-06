package me.shrp.factory;

/**
 * Description
 * Created by lynxs on 2017/10/6.
 */
public class ConcreteProductBeta implements AbstractProductBeta{

    private String value;

    public ConcreteProductBeta(String value){
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
