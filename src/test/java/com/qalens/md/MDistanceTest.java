package com.qalens.md;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MDistanceTest {
    @Test
    void shouldCalculateHorizontalDistanceProperly(){
        Point p1=new Point(3,3);
        Point p2=new Point(6,6);
        Assertions.assertEquals(6,MDistance.manhattanDistance(p1,p2));
    }
}
