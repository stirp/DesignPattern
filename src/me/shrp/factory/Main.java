package me.shrp.factory;

/**
 * Description
 * Created by lynxs on 2017/10/6.
 */
public class Main {
    public static void main(String[] args) {
        final SimpleFactory simpleFactory = new SimpleFactory();
        System.out.println(simpleFactory.produce("A").getValue());
        System.out.println(simpleFactory.produce("B").getValue());


        FactoryMethod factoryMethod = new BeijingFactoryMethod();
        System.out.println(factoryMethod.produce("A").getValue());
        System.out.println(factoryMethod.produce("B").getValue());
        factoryMethod = new NewYorkFactoryMethod();
        System.out.println(factoryMethod.produce("A").getValue());
        System.out.println(factoryMethod.produce("B").getValue());

        AbstractFactory factory = new ConcreteFactory();
        System.out.println(factory.produceAlpha().getValue());
        System.out.println(factory.produceBeta().getValue());
    }
}
