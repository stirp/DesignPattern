package me.shrp.adapter;

/**
 * Description
 * Created by lynxs on 2017/10/17.
 */
public class AdapterB implements InterfaceB{

    private InterfaceA a;

    public AdapterB(InterfaceA a) {
        this.a = a;
    }

    @Override
    public String functionB() {
        return "functionB with " + a.functionA();
    }
}
