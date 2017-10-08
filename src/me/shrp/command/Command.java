package me.shrp.command;

/**
 * Description
 * Created by lynxs on 2017/10/9.
 */
public interface Command {
    void execute();
    void undo();
}
