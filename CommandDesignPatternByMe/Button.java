package CommandDesignPatternByMe;

public class Button {
    Command command;

    public Button(Command command){
        this.command = command;
    }
    public void pressForward(){
        System.out.print("\n");
        System.out.println("Button pressed Forward");
        command.forward();
    }
    public void pressBackward(){
        System.out.println("\n");
        System.out.println("Button pressed Backward");
        command.backwards();
    }
}
