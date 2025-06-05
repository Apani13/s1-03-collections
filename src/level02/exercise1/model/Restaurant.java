package level02.exercise1.model;

import level01.exercise1.Model.Month;

import java.util.Objects;

public class Restaurant {

    private String name;
    private int score;

    public Restaurant(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Restaurant other = (Restaurant) obj;
        return ( Objects.equals(this.name, other.name) )
                && ( Objects.equals(this.score, other.score) );
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.score);
    }

    @Override
    public String toString() {
        return "NAME: " + this.name
                + "\nSCORE: " + this.score;
    }



}
