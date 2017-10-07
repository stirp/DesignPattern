package me.shrp.singleton;

/**
 * Description
 * Created by lynxs on 2017/10/7.
 */
public class Main {
    public static void main(String[] args) {
        final BasicSingleton instance = BasicSingleton.getInstance();
        final SynchronizedSingleton instance1 = SynchronizedSingleton.getInstance();
        final InnerSingleton instance2 = InnerSingleton.getInstance();
        final EnumSingleton instance3 = EnumSingleton.INSTANCE;
    }
}

