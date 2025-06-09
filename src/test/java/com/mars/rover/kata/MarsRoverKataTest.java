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
        int[] expectedPosition = {1,1};
        MarsRover marsRover = new MarsRover("N", expectedPosition);
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    void getRoverPosition()
    {
        int[] expectedPosition = {1,1};
        MarsRover marsRover = new MarsRover("N", expectedPosition);
        assertArrayEquals(new int[]{1, 1}, marsRover.getPosition());
    }
}
