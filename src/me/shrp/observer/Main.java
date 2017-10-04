package me.shrp.observer;

/**
 * TODO 默认的Observable是一个类，并且同步方式比较粗旷，导致复用困难
 * Description
 * Created by lynxs on 2017/10/4.
 */
public class Main {
    public static void main(String[] args) {
        final PullDataObservable pullDataObservable = new PullDataObservable();
        final PullDataObserver pullDataObserver = new PullDataObserver();
        pullDataObservable.addObserver(pullDataObserver);
        pullDataObservable.setData(10);
        pullDataObservable.notifyObservers();
        final PushDataObservable pushDataObservable = new PushDataObservable();
        final PushDataObserver pushDataObserver = new PushDataObserver();
        pushDataObservable.addObserver(pushDataObserver);
        pushDataObservable.setData(12);
    }
}
