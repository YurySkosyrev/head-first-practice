package patterns.command.undo.remote.control;


import patterns.command.undo.remote.control.device.ceiling.fan.CeilingFan;
import patterns.command.undo.remote.control.device.ceiling.fan.CeilingFanHighCommand;
import patterns.command.undo.remote.control.device.ceiling.fan.CeilingFanMediumCommand;
import patterns.command.undo.remote.control.device.ceiling.fan.CeilingFanOffCommand;

public class RemoteLoaderCeilingFan {
    public static void main(String[] args) {

        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanMediumCommand, ceilingFanOffCommand);
        remoteControl.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPush();

        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPush();

    }
}
