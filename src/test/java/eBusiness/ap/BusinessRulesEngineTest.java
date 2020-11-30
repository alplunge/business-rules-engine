package eBusiness.ap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

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

    @Test
    void shouldExecuteOneAction() {
        final BusinessRulesEngine businessRulesEngine = new BusinessRulesEngine();
        final Action mockAction = mock(Action.class);
        businessRulesEngine.addAction(mockAction);
        businessRulesEngine.run();
        verify(mockAction).execute();
    }
}
