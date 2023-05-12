package com.perscholas;

import java.util.Objects;

public class Computer extends Object {
    private String name;

    public Computer() {
    }

    public Computer(String name) {
        this.name = name;
    }

    public int add(int x, int y) {
        return x + y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(name, computer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
