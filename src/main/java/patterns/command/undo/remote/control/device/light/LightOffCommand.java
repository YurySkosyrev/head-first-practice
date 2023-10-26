package patterns.command.undo.remote.control.device.light;

import patterns.command.remote.control.device.light.Light;
import patterns.command.undo.remote.control.Command;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
