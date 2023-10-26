package patterns.command;

import patterns.command.device.ceiling.fan.CeilingFan;
import patterns.command.device.ceiling.fan.CeilingFanOffCommand;
import patterns.command.device.ceiling.fan.CeilingFanOnCommand;
import patterns.command.device.garage.door.GarageDoor;
import patterns.command.device.garage.door.GarageDoorDownCommand;
import patterns.command.device.garage.door.GarageDoorUpCommand;
import patterns.command.device.light.Light;
import patterns.command.device.light.LightOffCommand;
import patterns.command.device.light.LightOnCommand;
import patterns.command.device.stereo.Stereo;
import patterns.command.device.stereo.StereoOffCommand;
import patterns.command.device.stereo.StereoOnWithCDCommand;

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

        remoteControl.onButtonWasPush(0);
        remoteControl.offButtonWasPush(0);
        remoteControl.onButtonWasPush(1);
        remoteControl.offButtonWasPush(1);
        remoteControl.onButtonWasPush(2);
        remoteControl.offButtonWasPush(2);
        remoteControl.onButtonWasPush(3);
        remoteControl.offButtonWasPush(3);
    }
}
