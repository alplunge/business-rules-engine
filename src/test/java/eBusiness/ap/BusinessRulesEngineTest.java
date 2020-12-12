package eBusiness.ap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class BusinessRulesEngineTest {
    private Facts mockFacts;

    @BeforeEach
    void setup() {
       mockFacts  = mock(Facts.class);
    }

    @Test
    void shouldHaveNoRulesInitially() {
        final BusinessRulesEngine businessRulesEngine = new BusinessRulesEngine(mockFacts);
        Assertions.assertEquals(0, businessRulesEngine.count());
    }

    @Test
    void shouldAddTwoActions() {
        final BusinessRulesEngine businessRulesEngine = new BusinessRulesEngine(mockFacts);
        final Rule mockRule = mock(Rule.class);
        businessRulesEngine.addRule(mockRule);
        businessRulesEngine.addRule(mockRule);
        Assertions.assertEquals(2, businessRulesEngine.count());
    }
}
