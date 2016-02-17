import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws IOException {
        ArrayList<String> elementos=new ArrayList<String>();
        ArrayList<Color> listaColores=new ArrayList<Color>();
        String[] sinnombre=null;
        String nombrecolor = new String();
        String[] datos=null;
        ArrayList<String> inserts=new ArrayList<String>();

        Document doc = Jsoup.connect("https://ca.wikipedia.org/wiki/Llista_de_colors").get();
        Elements tabla = doc.select("tbody");
        Elements fila = tabla.select("tr");
        for (int i=0;i<fila.size();i++){
            elementos.add(fila.get(i).text().toString());
        }
        for (int i=0;i<elementos.size();i++){
            if(elementos.get(i).contains("#")){
                String[] colores = elementos.get(i).split(",");
                for(int x=0;x<colores.length;x++){
                     sinnombre = colores[0].split(" #");
                }
                nombrecolor = sinnombre[0];
                for(int x=0;x<sinnombre.length;x++){
                    datos = sinnombre[1].split(" ");
                }
                Color color =new Color();
                color.setNombre(nombrecolor);
                color.setColorhex("#"+datos[0]);
                color.setRed(Integer.valueOf(datos[1]));
                color.setGreen(Integer.valueOf(datos[2]));
                color.setBlue(Integer.valueOf(datos[3]));
                listaColores.add(color);

            }
        }

        for(int i=0;i<listaColores.size();i++){
            inserts.add("INSERT INTO colors (nom, colorhex, red, green, blue) VALUES ("+"\""+listaColores.get(i).getNombre()+"\""+","+"\""+listaColores.get(i).getColorhex()+"\""+","+listaColores.get(i).getRed()+","+listaColores.get(i).getGreen()+","+listaColores.get(i).getBlue()+");");
        }

        for(int i=0;i<inserts.size();i++){
            System.out.println(inserts.get(i));
        }
    }
}