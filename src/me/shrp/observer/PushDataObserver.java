package me.shrp.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Description
 * Created by lynxs on 2017/10/4.
 */
public class PushDataObserver implements Observer{
    @Override
    public void update(final Observable o, final Object arg) {
        System.out.println("receive arg " + arg + " from " + o + ".");
    }
}
