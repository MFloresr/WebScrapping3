/**
 * Created by Vipi on 16/02/2016.
 */
public class Color {
    private String nombre;
    private String colorhex;
    private int red;
    private int green;
    private int blue;

    public Color(){
    }
    public Color(String nombre, String colorhex, int red, int green, int blue){
        this.nombre= nombre;
        this.colorhex = colorhex;
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColorhex() {
        return colorhex;
    }

    public void setColorhex(String colorhex) {
        this.colorhex = colorhex;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    @Override
    public String toString() {
        return "Color{" +
                "nombre='" + nombre + '\'' +
                ", colorhex='" + colorhex + '\'' +
                ", red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                '}';
    }
}
