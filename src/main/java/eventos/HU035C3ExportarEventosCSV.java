package eventos;

import java.util.ArrayList;
import java.util.List;

class Evento {
    private String nombre;
    private String categoria;
    private String link;

    public Evento(String nombre, String categoria, String link) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.link = link;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getLink() {
        return link;
    }
}

public class HU035C3ExportarEventosCSV {
    public static void main(String[] args) {
        // Lista de eventos de ejemplo
        List<Evento> eventos = new ArrayList<>();
        eventos.add(new Evento("Taller de control", "Educación", "http://taller.com"));
        eventos.add(new Evento("Charla sobre depresión", "Salud", "http://charla.com"));
        eventos.add(new Evento("Seminario Java", "Tecnología", "http://java.com"));

        exportarComoCSV(eventos);
    }

    public static void exportarComoCSV(List<Evento> eventos) {

        System.out.println("Nombre,Categoría,Link");

        for (Evento evento : eventos) {
            System.out.println(evento.getNombre() + "," + evento.getCategoria() + "," + evento.getLink());
        }
    }
}
