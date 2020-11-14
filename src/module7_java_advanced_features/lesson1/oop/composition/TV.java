package module7_java_advanced_features.lesson1.oop.composition;

class TV {
    //TV has a remote control
    private RemoteControl remoteControl;

    public TV(RemoteControl remoteControl) {
        this.remoteControl = remoteControl;
    }
    //We are reusing remote control functional inside tv class
    public void change(int channel) {
        remoteControl.changeChannel(channel);
    }
}
