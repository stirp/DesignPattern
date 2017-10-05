package me.shrp.decorator;

/**
 * Description
 * Created by lynxs on 2017/10/6.
 */
public class BDecorator implements AbstractObject{
    private AbstractObject object;

    public BDecorator(AbstractObject object){
        this.object = object;
    }
    @Override
    public String getValue() {
        return "B " + object.getValue();
    }
}
