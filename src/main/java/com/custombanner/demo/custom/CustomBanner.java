package com.custombanner.demo.custom;


import java.io.PrintStream;

import org.jspecify.annotations.Nullable;
import org.springframework.boot.Banner;
import org.springframework.core.env.Environment;

public class CustomBanner implements Banner {

    @Override
    public void printBanner(Environment arg0, @Nullable Class<?> arg1, PrintStream out) {
        out.println("***************************");
        out.println("  Welcome to My Application");
        out.println("***************************");
    }
    
}
