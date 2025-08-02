package com.yourorg.library;
import com.yourorg.library.Service.implementation.DeprecatedFeatureService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
public class DeprecatedFeatureServiceTest {

    @Autowired(required = false)
    private DeprecatedFeatureService deprecatedService;

    @Test
    void testBeanIsExcluded() {
        assertNull(deprecatedService, "DeprecatedFeatureService should NOT be in the context!");
    }
}
