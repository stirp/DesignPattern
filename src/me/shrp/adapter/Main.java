package me.shrp.adapter;

/**
 * Description
 * Created by lynxs on 2017/10/17.
 */
public class Main {
    public static void main(String[] args) {
        final ConcreteA concreteA = new ConcreteA();
        final InterfaceB adapterB = new AdapterB(concreteA);
        System.out.println(adapterB.functionB());
    }
}
