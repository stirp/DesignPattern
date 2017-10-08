package me.shrp.command;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Description
 * Created by lynxs on 2017/10/9.
 */
public class Invoker {

    final ExecutorService executorService = Executors.newSingleThreadExecutor();

    public void setCommand(final Command command) {
        executorService.execute(command::execute);
    }

    public void shutdown(){
        executorService.shutdown();
    }
}
