package com.qalens.md;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PointTest {
    @ParameterizedTest
    @CsvSource({
            "3,6,0,3",
            "3,6,-1,3",
            "3,6,1,3",
            "-3,6,0,9",
            "-3,6,-1,9",
            "-3,6,1,9",
            "-3,-6,0,3",
            "-3,-6,-1,3",
            "-3,-6,1,3",
            "3,-6,0,9",
            "3,-6,-1,9",
            "3,-6,1,9"
    })
    void shouldCalculateHorizontalDistanceProperly(int x1,int x2,int y,int expected){
        Point p1=new Point(x1,y);
        Point p2=new Point(x2,y);
        Assertions.assertEquals(expected,p1.distanceFrom(p2));
    }
    @ParameterizedTest
    @CsvSource({
            "3,6,0,3",
            "3,6,-1,3",
            "3,6,1,3",
            "-3,6,0,9",
            "-3,6,-1,9",
            "-3,6,1,9",
            "-3,-6,0,3",
            "-3,-6,-1,3",
            "-3,-6,1,3",
            "3,-6,0,9",
            "3,-6,-1,9",
            "3,-6,1,9"
    })
    void shouldCalculateVerticalDistanceProperly(int y1,int y2,int x,int expected){
        Point p1=new Point(x,y1);
        Point p2=new Point(x,y2);
        Assertions.assertEquals(expected,p1.distanceFrom(p2));
    }
}
