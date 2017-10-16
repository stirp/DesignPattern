package me.shrp.facade;

/**
 * Description
 * Created by lynxs on 2017/10/17.
 */
public class ABFacade {
    private final ClassA a;
    private final ClassB b;

    public ABFacade(ClassA a, ClassB b) {
        this.a = a;
        this.b = b;
    }

    public String firstFunction(){
        return a.functionOne() +"\n" + b.functionTwo() + "\n" + a.functionThree();
    }

    public String secondFunction(){
        return b.functionOne() +"\n" + b.functionTwo() + "\n" + a.functionTwo() + "\n" + a.functionThree();
    }
}
