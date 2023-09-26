package modal;

public class Ceiling {

    public enum PaintColor {
        BLUE(0),
        WHITE(1),
        RED(2),
        GREEN(3);


        private int colorCode;

        PaintColor(int colorCode){
            this.colorCode=colorCode;
        }


    }

    private int height;
    private PaintColor color;

    public Ceiling(int height, PaintColor color) {
        this.height = height;
        this.color = color;
    }


    public int getHeight() {
        return height;
    }

    public PaintColor getColor() {
        return color;
    }

    public void Create(){
        System.out.println("Ceiling with "+height+"and color is"+color.name()+"has been created");
    }
}
