package me.shrp.command;

import java.util.List;
import java.util.stream.Collectors;

/**
 * It's obvious should use factory or something to conceive Receiver and Command
 * Created by lynxs on 2017/10/9.
 */
public class Client {

    public Command orderA(final ReceiverA receiverA) {
        return new CommandA(receiverA);
    }

    public Command orderB(final ReceiverB receiverB) {
        return new CommandB(receiverB);
    }

    public Command orderBatch(final List<Receiver> receivers) {
        if (receivers == null) {
            return new NoCommand();
        }
        return new BatchCommands(receivers.stream().map(o -> {
            if (o instanceof ReceiverA) {
                return new CommandA((ReceiverA) o);
            } else if (o instanceof ReceiverB) {
                return new CommandB((ReceiverB) o);
            } else {
                return new NoCommand();
            }
        }).collect(Collectors.toList()));
    }
}
