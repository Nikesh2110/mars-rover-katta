package com.mars.rover.kata;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import javax.swing.*;

public class MarsRoverKataTest
{
    @Test
    void getRoverDirection()
    {
        MarsRover marsRover = new MarsRover("N", new int[] {1,1});
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    void getRoverPosition()
    {
        MarsRover marsRover = new MarsRover("N", new int[] {1,1});
        assertArrayEquals(new int[]{1, 1}, marsRover.getPosition());
    }

    @Test
    void moveRoverForward()
    {
        MarsRover marsRover = new MarsRover("N", new int[]{1,1});
        assertArrayEquals(new int[]{1,2}, marsRover.moveForward('F'));
    }
}
