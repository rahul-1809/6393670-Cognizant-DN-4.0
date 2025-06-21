public class Main{
    public static void main(String[] args){

        Light light = new Light();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();

        System.out.println("User presses ON button:");
        remote.setCommand(lightOn);
        remote.pressButton();

        System.out.println("User presses OFF button:");
        remote.setCommand(lightOff);
        remote.pressButton();

        System.out.println("User presses button with no command:");
        remote.setCommand(null);
        remote.pressButton();
    }
}