package me.shrp.command;

/**
 * Command is associated with Receiver
 * Created by lynxs on 2017/10/9.
 */
public class CommandA implements Command{

    ReceiverA receiverA;

    public CommandA(ReceiverA receiverA){
        this.receiverA = receiverA;
    }

    @Override
    public void execute() {
        receiverA.action();
    }

    @Override
    public void undo() {
        receiverA.actionUndo();
    }
}
