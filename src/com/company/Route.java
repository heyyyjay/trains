package com.company;

import com.sun.tools.javac.util.List;

public class Route {
    private List<Town> towns;

    public Route(java.util.List<Town> route) {

    }

    public Route(List<Town> towns) {
        this.towns = towns;
    }

    public List<Town> getTowns() {
        return towns;
    }
}