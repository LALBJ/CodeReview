package homework8;

public class CreateItem implements Command{
    BoardScreen screen;

    @Override
    public void execute() {
        screen.create();
    }
}
