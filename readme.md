# Manhattan Distance Kata

## Problem Statement For Kata
Originally Posted At https://kata-log.rocks/manhattan-distance-kata

Manhattan distance is the distance between two points in a grid (like the grid-like street geography of the New York borough of Manhattan) calculated by only taking a vertical and/or horizontal path.

Write a function int manhattanDistance(Point, Point) that returns the Manhattan Distance between the two points.
### Rules
- The class Point is immutable (its state cannot be changed after instantiation)
- The class Point has no Getters
- The class Point has no public properties (i.e. the internal state cannot be read from outside the class).

## Selected Stack
- Java 11
- gradle (with gradle wrapper) as build tool
- junit 5 as test framework

## Understanding Solution
- The Problem was solved using TDD and with the approach of just enough design at each stage
- Go through Each commit One by one to understand how first failing tests were written
- Each commit is one step of Red-Green-Refactor step