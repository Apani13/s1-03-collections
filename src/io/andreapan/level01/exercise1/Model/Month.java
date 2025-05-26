package io.andreapan.level01.exercise1.Model;

import java.util.ArrayList;
import java.util.Objects;

public class Month {

    private final String name;

    public Month(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Month name cannot be null or empty");
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Month other = (Month) obj;
        return Objects.equals(this.name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }

    @Override
    public String toString() {
        return this.name;
    }



}
