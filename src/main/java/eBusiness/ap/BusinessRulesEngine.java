package eBusiness.ap;

import java.util.ArrayList;
import java.util.List;

public class BusinessRulesEngine {
    private final List<Rule> rules;
    private final Facts facts;

    public BusinessRulesEngine(final Facts facts) {
        this.facts = facts;
        this.rules = new ArrayList<>();
    }

    public void addRule(final Rule rule) {
        this.rules.add(rule);
    }

    public void run() {
        this.rules.forEach(rule -> rule.perform(facts));
    }

    public int count() {
        return this.rules.size();
    }
}
