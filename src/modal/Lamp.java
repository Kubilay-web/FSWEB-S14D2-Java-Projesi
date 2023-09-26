package modal;

public class Lamp {

    public enum LampType {
        KITCHEN_LAMB,
        DESK_LAMB,
        SALOON_LAMB
    }


    private LampType style;
    private boolean battery;
    private int globRating;

    public Lamp(LampType style,boolean battery,int globRating){
        this.style=style;
        this.battery=battery;
        this.globRating=globRating;
    }

    public void turnOn(){
        System.out.println("modal.Lamp is being turned on");
    }

    public LampType getStyle(){
        return style;
    }

    public boolean isBattery(){
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    public String toString() {
        StringBuilder builder=new StringBuilder();
        builder.append("\n***********\n");
        builder.append("Style "+style);
        builder.append("Battery "+battery);
        builder.append("GLobRating "+globRating);
        return builder.toString();
    }


}
