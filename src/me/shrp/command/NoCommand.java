package me.shrp.command;

/**
 * Can be Singleton
 * Created by lynxs on 2017/10/9.
 */
public class NoCommand implements Command{
    @Override
    public void execute() {
        System.out.println("no command is executed.");
    }

    @Override
    public void undo() {
        System.out.println("no command is undone.");
    }
}
