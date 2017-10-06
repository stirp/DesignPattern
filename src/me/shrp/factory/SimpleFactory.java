package me.shrp.factory;

/**
 * Description
 * Created by lynxs on 2017/10/6.
 */
public class SimpleFactory {
    Product produce(String type) {
        switch (type) {
            case "A":
                return new ProductA("A produced by SimpleFactory.");
            case "B":
                return new ProductB("B produced by SimpleFactory.");
            default:
                return null;
        }
    }
}
