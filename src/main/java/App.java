import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws IOException {
        ArrayList<String> elementos=new ArrayList<String>();

        Document doc = Jsoup.connect("https://ca.wikipedia.org/wiki/Llista_de_colors").get();
        Elements tabla = doc.select("tbody");
        Elements fila = tabla.select("tr");
        for (int i=0;i<fila.size();i++){
            elementos.add(fila.get(i).text().toString());
        }
        for (int i=0;i<elementos.size();i++){
            System.out.println(elementos.get(i));
            if(elementos.get(i).contains("#")){
                String[] colores = elementos.get(i).split(",");
                for(int x=0;x<colores.length;x++){
                    String[] preparado = colores[0].split(" ");
                    ///separamos por espacio y ahora tendremos que anadir a nuestra lista de objetos
                }

            }
        }
    }
}