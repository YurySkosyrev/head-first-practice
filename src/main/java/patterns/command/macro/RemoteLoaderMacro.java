package patterns.command.macro;


import patterns.command.remote.control.Command;
import patterns.command.remote.control.RemoteControl;
import patterns.command.remote.control.device.hottub.Hottub;
import patterns.command.remote.control.device.hottub.HottubOffCommand;
import patterns.command.remote.control.device.hottub.HottubOnCommand;
import patterns.command.remote.control.device.light.Light;
import patterns.command.remote.control.device.light.LightOffCommand;
import patterns.command.remote.control.device.light.LightOnCommand;
import patterns.command.remote.control.device.stereo.Stereo;
import patterns.command.remote.control.device.stereo.StereoOffCommand;
import patterns.command.remote.control.device.stereo.StereoOnCommand;
import patterns.command.remote.control.device.tv.TV;
import patterns.command.remote.control.device.tv.TVOffCommand;
import patterns.command.remote.control.device.tv.TVOnCommand;


public class RemoteLoaderMacro {
    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        TVOnCommand tvOnCommand = new TVOnCommand(tv);
        TVOffCommand tvOffCommand = new TVOffCommand(tv);

        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        HottubOnCommand hottubOnCommand = new HottubOnCommand(hottub);
        HottubOffCommand hottubOffCommand = new HottubOffCommand(hottub);

        Command[] partyOn = {lightOnCommand, tvOnCommand, stereoOnCommand, hottubOnCommand};
        Command[] partyOff = {lightOffCommand, tvOffCommand, stereoOffCommand, hottubOffCommand};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Pushing Macro Off---");
        remoteControl.offButtonWasPushed(0);

    }
}
