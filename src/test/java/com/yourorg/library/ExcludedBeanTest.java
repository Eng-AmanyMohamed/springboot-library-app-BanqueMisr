package com.yourorg.library;

import com.yourorg.library.Service.implementation.ExcludedService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
public class ExcludedBeanTest {

    @Autowired(required = false) // prevents Spring from failing if bean is missing
    private ExcludedService excludedService;

    @Test
    void excludedBeanShouldNotBeLoaded() {
        assertNull(excludedService, "ExcludedService should NOT be in the context!");
    }
}
