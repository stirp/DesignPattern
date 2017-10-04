package me.shrp.strategy;

/**
 * Description
 * Created by lynxs on 2017/10/4.
 */
public class Main {
    public static void main(String[] args) {
        StrategyBaseObject object = new StrategyObjectA();
        object.function();
        object = new StrategyObjectB();
        object.function();
    }
}
