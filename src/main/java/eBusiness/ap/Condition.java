package eBusiness.ap;

@FunctionalInterface
public interface Condition {
    boolean evaluate(Facts facts);
}
