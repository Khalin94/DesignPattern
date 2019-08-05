public class MacroRemoteLoader{
	public static void main(String[] args){
	RemoteControl remoteControl = new RemoteControl();

	Light light = new Light("Living Room");
	Stereo stereo = new Stereo("Living Room");
	GarageDoor door = new GarageDoor("");
	CeilingFan fan = new CeilingFan("Living Room");

	LightOnCommand lightOn = new LightOnCommand(light);
	StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
	GarageDoorUpCommand garageUp = new GarageDoorUpCommand(door);
	CeilingFanHighCommand fanHigh = new CeilingFanHighCommand(fan);

	LightOffCommand lightOff = new LightOffCommand(light);
	StereoOffCommand stereoOff = new StereoOffCommand(stereo);
	GarageDoorDownCommand garageDown = new GarageDoorDownCommand(door);
	CeilingFanOffCommand fanOff = new CeilingFanOffCommand(fan);

	Command[] partyOn = {lightOn, stereoOn, garageUp, fanHigh};
	Command[] partyOff = {lightOff, stereoOff, garageDown, fanOff};

	MacroCommand partyOnMacro = new MacroCommand(partyOn);
	MacroCommand partyOffMacro = new MacroCommand(partyOff);

	remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

	System.out.println(remoteControl);
	System.out.println("Push MacroOn");
	remoteControl.onButtonWasPushed(0);
	System.out.println("Push MacroOff");
	remoteControl.offButtonWasPushed(0);
	}
}

