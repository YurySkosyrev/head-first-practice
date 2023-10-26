package patterns.command.simple.remote.control;

import patterns.command.device.light.Light;
import patterns.command.device.light.LightOnCommand;

public class SimpleRemoteCommandTest {
    public static void main(String[] args) {

        Light light = new Light("Living Room");
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        remoteControl.setCommand(lightOnCommand);
        remoteControl.buttonWasPressed();

    }
}
