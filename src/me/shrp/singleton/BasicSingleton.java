package me.shrp.singleton;

/**
 * Description
 * Created by lynxs on 2017/10/7.
 */
public class BasicSingleton {
    private static BasicSingleton singleton = new BasicSingleton();

    public static BasicSingleton getInstance(){
        return singleton;
    }
}
