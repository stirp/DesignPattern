package me.shrp.decorator;

/**
 * Description
 * Created by lynxs on 2017/10/6.
 */
public class ADecorator implements AbstractObject{
    private AbstractObject object;

    public ADecorator(AbstractObject object){
        this.object = object;
    }

    @Override
    public String getValue() {
        return "A " + object.getValue();
    }
}
