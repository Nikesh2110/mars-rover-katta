package com.mars.rover.kata;

import java.util.stream.IntStream;

public class MarsRover {
    private final String direction;
    private final int[] position;

    public MarsRover(String direction, int[] position) {
        this.direction = direction;
        this.position = position;
    }

    public String getDirection() {
        return direction;
    }

    public int[] getPosition() {
        return position;
    }

    public int[] moveForward(char sequence) {
        if (sequence == 'F') {
            switch (direction) {
                case "N":
                    return IntStream.range(0, position.length).map(i -> i == 1 ? position[i] + 1 : position[i]).toArray();
                case "E":
                    return IntStream.range(0, position.length).map(i -> i == 0 ? position[i] + 1 : position[i]).toArray();
                case "S":
                    return IntStream.range(0, position.length).map(i -> i == 1 ? position[i] - 1 : position[i]).toArray();
                case "W":
                    return IntStream.range(0, position.length).map(i -> i == 0 ? position[i] - 1 : position[i]).toArray();
            }
            return position;
        }
        return position;
    }
}
