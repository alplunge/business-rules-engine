package eBusiness.ap;

@FunctionalInterface
public interface Rule {
    void perform(Facts facts);
}
