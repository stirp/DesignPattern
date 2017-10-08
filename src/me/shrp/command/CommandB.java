package me.shrp.command;

/**
 * Description
 * Created by lynxs on 2017/10/9.
 */
public class CommandB implements Command{
    ReceiverB receiverB;

    public CommandB(final ReceiverB receiverB) {
        this.receiverB = receiverB;
    }

    @Override
    public void execute() {
        receiverB.action();
    }

    @Override
    public void undo() {
        receiverB.actionUndo();
    }
}
