package com.mars.rover.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MarsRoverKataTest
{
    @Test
    void getRoverDirection()
    {
        MarsRoverDirection marsRoverDirection = new MarsRoverDirection();
        assertEquals("N", marsRoverDirection.getMarsRoverDirection() );
    }
}
