package modal;

public class Bedroom {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;

    private Ceiling ceiling;

    private Bed bed;
    private Wardrobe wardrobe;
    private Carpet carpet;
    private Lamp lamp;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Wardrobe wardrobe, Carpet carpet, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.wardrobe = wardrobe;
        this.carpet = carpet;
        this.lamp = lamp;
    }
}
