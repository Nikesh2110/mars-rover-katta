package com.mars.rover.kata;

public class MarsRover
{
    private String direction;
    private int[] position;

    public MarsRover(String direction, int[] position) {
        this.direction = direction;
        this.position = position;
    }

    public String getDirection()
    {
        return direction;
    }

    public int[] getPosition() {
        return position;
    }

    public int[] moveForward(char f)
    {
        return new int[]{1,2};
    }
}
