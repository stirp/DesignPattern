package me.shrp.strategy;

/**
 * Description
 * Created by LynxStirp on 2017/10/4.
 */
public abstract class StrategyBaseObject {
    abstract void function();

    public static void main(String[] args) {
        new StrategyObjectA().function();
        new StrategyObjectB().function();
    }
}
