package homework8;

public class OpenItem implements Command{
    private BoardScreen screen;

    @Override
    public void execute() {
        screen.open();
    }
}
