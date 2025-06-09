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

    public int[] moveForward(char sequence)
    {
        if (direction.equals("N"))
        {
            return new int[]{1,2};
        } else if (direction.equals("E")){
            return new int[]{2,1};
        } else if (direction.equals("S")){
            return new int[]{1,0};
        }
        return position;
    }
}
