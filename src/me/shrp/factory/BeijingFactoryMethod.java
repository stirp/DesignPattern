package me.shrp.factory;

/**
 * Description
 * Created by lynxs on 2017/10/6.
 */
public class BeijingFactoryMethod implements FactoryMethod {
    @Override
    public Product produce(final String type) {
        switch (type) {
            case "A":
                return new ProductA("A produced by BeijingFactoryMethod.");
            case "B":
                return new ProductB("B produced by BeijingFactoryMethod.");
            default:
                return null;
        }
    }
}
