package me.shrp.templateMethod;

/**
 * Description
 * Created by lynxs on 2017/10/19.
 */
public class ConcreteObject2 extends Template{
    @Override
    protected void function2() {
        System.out.println("function2 from object2.");
    }

    @Override
    protected void function3() {
        System.out.println("function3 from object2.");
    }

    @Override
    protected boolean hook(){
        return true;
    }
}
