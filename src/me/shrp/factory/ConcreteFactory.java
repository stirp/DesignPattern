package me.shrp.factory;

/**
 * Description
 * Created by lynxs on 2017/10/6.
 */
public class ConcreteFactory implements AbstractFactory{
    @Override
    public AbstractProductAlpha produceAlpha() {
        return new ConcreteProductAlpha("Alpha produced by ConcreteFactory.");
    }

    @Override
    public AbstractProductBeta produceBeta() {
        return new ConcreteProductBeta("Beta produced by ConcreteFactory.");
    }
}
