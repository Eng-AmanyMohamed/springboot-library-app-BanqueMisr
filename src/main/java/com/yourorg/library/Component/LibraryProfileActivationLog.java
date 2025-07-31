package com.yourorg.library.Component;


import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class LibraryProfileActivationLog implements CommandLineRunner {
    private LibraryConfig libraryConfig;

    public LibraryProfileActivationLog(LibraryConfig libraryConfig) {
        this.libraryConfig = libraryConfig;
    }
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Active Library Profile");
        System.out.println("Library Name " + this.libraryConfig.getName());
        System.out.println("Library Mode " + this.libraryConfig.getMode());

    }
}
