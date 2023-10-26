package patterns.command.undo.remote.control;

public interface Command {
    void execute();
    void undo();
}
