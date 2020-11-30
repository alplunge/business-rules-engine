package eBusiness.ap;

@FunctionalInterface
public interface Action {
    void execute(Facts facts);
}
