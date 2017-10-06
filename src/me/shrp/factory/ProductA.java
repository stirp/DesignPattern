package me.shrp.factory;

/**
 * Description
 * Created by lynxs on 2017/10/6.
 */
public class ProductA implements Product{

    private String value;

    public ProductA(String value){
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
