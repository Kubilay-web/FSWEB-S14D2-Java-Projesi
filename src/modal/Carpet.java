package modal;

public class Carpet {

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


    private int width;
    private int height;
    private PaintColor color;

    public Carpet(int width, int height, PaintColor color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void lying(){
        System.out.println("Carpet is lying on thebedroom floor.");
    }

}
