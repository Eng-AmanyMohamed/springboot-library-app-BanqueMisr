package com.yourorg.library.Component;

import org.springframework.stereotype.Component;

@Component

public class LibraryConfig {
    private String name;
    private String mode;





    public String getName() {
        return this.name;
    }

    public String getMode() {
        return "";
    }
}
