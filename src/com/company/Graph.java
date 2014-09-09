package com.company;

import java.util.Map;
import java.util.List;

public class Graph {

    private Map<Town, Road> roads;

    public Graph(List<Road> inputRoads) {
        for (Road road : inputRoads) {
            roads.put(road.getOrigin(), road);
        }
    }

    public int getDistance(Route route) {
        Town origin;
        Town destination;

        for (int i = 0; i < route.getTowns().length(); i ++) {

        }
    }
}
