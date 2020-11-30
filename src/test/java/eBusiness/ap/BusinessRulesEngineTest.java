package eBusiness.ap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BusinessRulesEngineTest {

    @Test
    void shouldHaveNoRulesInitially() {
        final BusinessRulesEngine businessRulesEngine = new BusinessRulesEngine();
        Assertions.assertEquals(0, businessRulesEngine.count());
    }

    @Test
    void shouldAddTwoActions() {
        final BusinessRulesEngine businessRulesEngine = new BusinessRulesEngine();
        businessRulesEngine.addAction(() -> {});
        businessRulesEngine.addAction(() -> {});
        Assertions.assertEquals(2, businessRulesEngine.count());
    }
}
