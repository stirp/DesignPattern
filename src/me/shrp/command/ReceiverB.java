package me.shrp.command;

/**
 * Description
 * Created by lynxs on 2017/10/9.
 */
public class ReceiverB implements Receiver{
    @Override
    public void action() {
        System.out.println("ReceiverB action.");
    }

    @Override
    public void actionUndo() {
        System.out.println("ReceiverB actionUndo.");
    }
}
