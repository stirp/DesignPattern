package me.shrp.singleton;

/**
 * Description
 * Created by lynxs on 2017/10/7.
 */
public class InnerSingleton {

    public static InnerSingleton getInstance(){
        return InnerOfInnerSingleton.SINGLETON;
    }

    private static class InnerOfInnerSingleton {
        private final static InnerSingleton SINGLETON = new InnerSingleton();
    }
}
