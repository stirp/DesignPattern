package me.shrp.singleton;

/**
 * Description
 * Created by lynxs on 2017/10/7.
 */
public class SynchronizedSingleton {
    public static SynchronizedSingleton singleton;

    public static synchronized SynchronizedSingleton getInstance(){
        if (singleton == null) {
            singleton = new SynchronizedSingleton();
        }
        return singleton;
    }
}
