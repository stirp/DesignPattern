package me.shrp.templateMethod;

/**
 * Description
 * Created by lynxs on 2017/10/19.
 */
public abstract class Template {
    public void templateMethod(){
        function1();
        function2();
        if (hook()){
            function3();
        }
    }

    protected void function1(){
        System.out.println("function1");
    }

    protected abstract void function2();

    protected boolean hook(){
        return false;
    };

    protected abstract void function3();
}
