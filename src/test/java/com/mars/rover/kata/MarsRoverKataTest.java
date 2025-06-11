package com.mars.rover.kata;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MarsRoverKataTest {
    @Test
    void getRoverDirection() {
        MarsRover marsRover = new MarsRover("N", new int[]{1, 1});
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    void getRoverPosition() {
        MarsRover marsRover = new MarsRover("N", new int[]{1, 1});
        assertArrayEquals(new int[]{1, 1}, marsRover.getPosition());
    }

    @Test
    void moveRoverForwardWhenFacingNorth() {
        MarsRover marsRover = new MarsRover("N", new int[]{1, 1});
        assertArrayEquals(new int[]{1, 2}, marsRover.moveForward('F'));
    }

    @Test
    void moveRoverForwardWhenFacingEast() {
        MarsRover marsRover = new MarsRover("E", new int[]{1, 1});
        assertArrayEquals(new int[]{2, 1}, marsRover.moveForward('F'));
    }

    @Test
    void moveRoverForwardWhenFacingSouth() {
        MarsRover marsRover = new MarsRover("S", new int[]{1, 1});
        assertArrayEquals(new int[]{1, 0}, marsRover.moveForward('F'));
    }

    @Test
    void moveRoverFowardWhenFacingWest() {
        MarsRover marsRover = new MarsRover("W", new int[]{1, 1});
        assertArrayEquals(new int[]{0, 1}, marsRover.moveForward('F'));
    }

    @Test
    void tryToMoveRoverFowardWithInvalidInput() {
        MarsRover marsRover = new MarsRover("I", new int[]{1, 1});
        assertArrayEquals(new int[]{1, 1}, marsRover.moveForward('F'));
    }

    @Test
    void tryToMoveRoverWithInvalidInput() {
        MarsRover marsRover = new MarsRover("N", new int[]{1, 1});
        assertArrayEquals(new int[]{1, 1}, marsRover.moveForward('I'));
    }
}
