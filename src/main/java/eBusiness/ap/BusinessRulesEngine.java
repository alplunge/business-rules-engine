package eBusiness.ap;

import java.util.ArrayList;
import java.util.List;

public class BusinessRulesEngine {
    private final List<Action> actions;

    public BusinessRulesEngine() {
        this.actions = new ArrayList<>();
    }

    public void addAction(final Action action) {
        this.actions.add(action);
    }

    public int count() {
        return this.actions.size();
    }

    public void run() {
        this.actions.forEach(Action::execute);
    }
}
