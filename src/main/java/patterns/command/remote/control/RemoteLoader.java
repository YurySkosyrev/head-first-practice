package patterns.command.remote.control;

import patterns.command.remote.control.device.ceiling.fan.CeilingFan;
import patterns.command.remote.control.device.ceiling.fan.CeilingFanOffCommand;
import patterns.command.remote.control.device.ceiling.fan.CeilingFanOnCommand;
import patterns.command.remote.control.device.garage.door.GarageDoor;
import patterns.command.remote.control.device.garage.door.GarageDoorDownCommand;
import patterns.command.remote.control.device.garage.door.GarageDoorUpCommand;
import patterns.command.remote.control.device.light.Light;
import patterns.command.remote.control.device.light.LightOffCommand;
import patterns.command.remote.control.device.light.LightOnCommand;
import patterns.command.remote.control.device.stereo.Stereo;
import patterns.command.remote.control.device.stereo.StereoOffCommand;
import patterns.command.remote.control.device.stereo.StereoOnWithCDCommand;

public class RemoteLoader {
    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
    }
}
