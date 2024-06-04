import java.text.Format;

public class ElonsToyCar {

    int Battery,Driven;

    public ElonsToyCar(){
        this.Battery = 100;
        this.Driven = 0;
    }

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", this.Driven);
    }

    public String batteryDisplay() {
        return (this.Battery <= 0) ? "Battery empty" : String.format("Battery at %d%%", this.Battery);
    }

    public void drive() {
        if (this.Battery <= 0) return;
        this.Battery --;
        this.Driven += 20;
    }

}
