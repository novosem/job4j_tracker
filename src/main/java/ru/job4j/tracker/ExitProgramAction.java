package ru.job4j.tracker;

public class ExitProgramAction implements UserAction {
    private final Output out;

    public ExitProgramAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Exit program";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        return false;
    }
}
