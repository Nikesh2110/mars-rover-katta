package com.mars.rover.kata;

import java.util.stream.IntStream;

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
            return IntStream.range(0, position.length).map(i -> i==1 ? position[i]+1:position[i]).toArray();
        } else if (direction.equals("E")){
            return IntStream.range(0, position.length).map(i -> i==0 ? position[i]+1:position[i]).toArray();
        } else if (direction.equals("S")){
            return IntStream.range(0, position.length).map(i -> i==1 ? position[i]-1:position[i]).toArray();
        } else if (direction.equals("W")){
            return IntStream.range(0, position.length).map(i -> i==0 ? position[i]-1:position[i]).toArray();
        }
        return position;
    }
}
