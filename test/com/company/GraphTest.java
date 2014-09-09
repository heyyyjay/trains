package com.company;

import org.hamcrest.core.Is;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class GraphTest {

    @Test
    public void testGetDistance_betweenTwoNodes() throws Exception {
        Town a = new Town('A');
        Town b = new Town('B');
        Road road = new Road(a, b, 5);
        List<Road> roads = new ArrayList<Road>();
        roads.add(road);

        Route route = new Route(Arrays.asList(a, b));
        Graph graph = new Graph(roads);

        int distance = graph.getDistance(route);
        assertThat(distance, Is.is(5));
    }

    @Test
    public void testGetDistance_betweenThreeNodes() throws Exception {
        Town town1 = new Town('A');
        Town town2 = new Town('B');
        Town town3 = new Town('C');


        Road road1 = new Road(town1, town2, 5);
        Road road2 = new Road(town2, town3, 4);

        Route route = new Route(Arrays.asList(town1, town2, town3));
        Graph graph = new Graph(Arrays.asList(road1, road2));
        int distance = graph.getDistance(route);

        assertThat(distance, Is.is(9));
    }

}