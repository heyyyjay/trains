package com.company;

/**
 * Created by jltolent on 9/6/14.
 */
public class Road {
    private Town origin;
    private Town destination;
    private int distance;

    public Road(Town origin, Town destination, int distance) {
        this.origin = origin;
        this.destination = destination;
        this.distance = distance;
    }

    public Town getOrigin() {
        return origin;
    }
}
