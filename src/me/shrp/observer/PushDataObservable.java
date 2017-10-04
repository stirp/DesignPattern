package me.shrp.observer;

import java.util.Observable;

/**
 * Description
 * Created by lynxs on 2017/10/4.
 */
public class PushDataObservable extends Observable{
    private int data;

    public int getData() {
        return data;
    }

    public void setData(final int data) {
        this.data = data;
        setChanged();
        notifyObservers(data);
    }
}
