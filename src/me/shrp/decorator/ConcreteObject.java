package me.shrp.decorator;

/**
 * Description
 * Created by lynxs on 2017/10/6.
 */
public class ConcreteObject implements AbstractObject{
    @Override
    public String getValue() {
        return "real object";
    }
}
