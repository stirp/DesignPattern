package me.shrp.command;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/**
 * Description
 * Created by lynxs on 2017/10/9.
 */
public class Commander {
    ReceiverA receiverA = new ReceiverA();
    ReceiverB receiverB = new ReceiverB();
    Invoker invoker = new Invoker();
    public static void main(String[] args) throws InterruptedException {
        final Client client = new Client();
        final Commander commander = new Commander();

        Command command1 = client.orderA(commander.receiverA);
        Command command2 = client.orderB(commander.receiverB);
        Command command3 = client.orderBatch(Arrays.asList(commander.receiverA,commander.receiverB));

        commander.invoker.setCommand(command1);
        commander.invoker.setCommand(command2);
        commander.invoker.setCommand(command3);

        TimeUnit.SECONDS.sleep(5);

        System.out.println("Oh! All commands timeout. Let's undo.");

        command1.undo();
        command2.undo();
        command3.undo();

        commander.invoker.shutdown();

    }
}
