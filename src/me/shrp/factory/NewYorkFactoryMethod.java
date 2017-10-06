package me.shrp.factory;

/**
 * Description
 * Created by lynxs on 2017/10/6.
 */
public class NewYorkFactoryMethod implements FactoryMethod {
    @Override
    public Product produce(final String type) {
        switch (type) {
            case "A":
                return new ProductA("A produced by NewYorkFactoryMethod.");
            case "B":
                return new ProductB("B produced by NewYorkFactoryMethod.");
            default:
                return null;
        }
    }
}
