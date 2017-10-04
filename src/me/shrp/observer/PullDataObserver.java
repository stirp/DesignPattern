package me.shrp.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Description
 * Created by lynxs on 2017/10/4.
 */
public class PullDataObserver implements Observer{
    @Override
    public void update(final Observable o, final Object arg) {
        if (o instanceof PullDataObservable) {
            System.out.println("receive arg " + ((PullDataObservable) o).getData() + " from " + o + ".");
        } else {
            System.out.println("receive something from unknown observable.");
        }
    }
}
