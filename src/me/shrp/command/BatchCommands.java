package me.shrp.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Description
 * Created by lynxs on 2017/10/9.
 */
public class BatchCommands implements Command{
    protected List<Command> commands = new ArrayList<>();

    public BatchCommands(List<Command> commands) {
        this.commands.clear();
        if (commands != null) {
            this.commands.addAll(commands);
        }
    }
    @Override
    public void execute() {
        final ArrayList<Command> commands = new ArrayList<>(this.commands);
        for (final Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        final ArrayList<Command> commands = new ArrayList<>(this.commands);
        for (final Command command : commands) {
            command.undo();
        }
    }
}
