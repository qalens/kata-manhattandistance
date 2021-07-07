package com.qalens.md;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PointTest {
    @Test
    void shouldCalculateHorizontalDistanceProperly(){
        Point p1=new Point(3,0);
        Point p2=new Point(6,0);
        Assertions.assertEquals(3,p1.distanceFrom(p2));
    }
}
