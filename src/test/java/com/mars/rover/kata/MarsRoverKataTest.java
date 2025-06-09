package com.mars.rover.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MarsRoverKataTest
{
    @Test
    void getRoverDirection()
    {
        MarsRover marsRover = new MarsRover("N");
        assertEquals("N", marsRover.getDirection() );
    }


}
