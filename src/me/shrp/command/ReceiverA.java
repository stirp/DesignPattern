package me.shrp.command;

/**
 * Description
 * Created by lynxs on 2017/10/9.
 */
public class ReceiverA implements Receiver{
    @Override
    public void action() {
        System.out.println("ReceiverA action.");
    }

    @Override
    public void actionUndo() {
        System.out.println("ReceiverA actionUndo.");
    }
}
