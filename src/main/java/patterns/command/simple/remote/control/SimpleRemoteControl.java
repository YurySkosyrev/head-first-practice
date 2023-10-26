package patterns.command.simple.remote.control;

import patterns.command.Command;

public class SimpleRemoteControl {

    Command slot;

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }

}
