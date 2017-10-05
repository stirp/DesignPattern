package me.shrp.decorator;

/**
 * Description
 * Created by lynxs on 2017/10/6.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(new ADecorator(new BDecorator(new ConcreteObject())).getValue());
        System.out.println(new BDecorator(new ADecorator(new ConcreteObject())).getValue());
    }
}
