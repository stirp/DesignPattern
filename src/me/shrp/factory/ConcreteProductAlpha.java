package me.shrp.factory;

/**
 * Description
 * Created by lynxs on 2017/10/6.
 */
public class ConcreteProductAlpha implements AbstractProductAlpha{

    private String value;

    public ConcreteProductAlpha(String value){
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
