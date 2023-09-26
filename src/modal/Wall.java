package modal;

public class Wall {
    public enum Direction {
        NORTH,
        WEST,
        EAST,
        SOUTH
    }

    private Direction direction;

    public Wall(Direction direction) {
        this.direction = direction;
    }

    public Direction getDirection(){
        return direction;
    }

    public void create(){
        System.out.println("Wall has been created"+direction.name());
    }
}
