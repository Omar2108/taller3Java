package com.tallerjava.bibliotecamusical;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author
 */
public class Biblioteca {

   private String nombre;
    private ArrayList<Cancion> listCanciones;

    public Biblioteca() {

        this.nombre = "Principal";
        inicializarBiblioteca();

    }

    public Biblioteca(String nombre, ArrayList<Cancion> listCanciones) {
        this.nombre = nombre;
        this.listCanciones = listCanciones;
    }

    public final void inicializarBiblioteca() {
        LocalDate fechA;
        fechA = LocalDate.of(2000, Month.MARCH, 23);
        Date fecha = Date.from(fechA.atStartOfDay(ZoneId.systemDefault()).toInstant());
        this.listCanciones = new ArrayList();
        this.listCanciones.add(new Cancion(
                1, "Imagine", "Rock", fecha, 4, "Imagine - John Lennon", "Lanzada por primera vez en Estados Unidos en octubre de 1971 y en el Reino Unido cuatro años más tarde, fue el éxito más vendido del ex Beatle en solitario"
        ));
        fechA = LocalDate.of(1957, Month.APRIL, 26);
        fecha = Date.from(fechA.atStartOfDay(ZoneId.systemDefault()).toInstant());
        this.listCanciones.add(new Cancion(
                2, "Chuck Berry", "Rock", fecha, 3, "Jailhouse Rock - Elvis Presley", "Este rock carcelario fue concebida como una especie de broma con referencias al sexo gay entre presos por sus autores, Leiber y Stoller. Pero Elvis Presley sin embargo, ignoró el trasfondo cómico y la cantó con tal intensidad que la convirtió en todo un intenso número uno."
        ));

        fechA = LocalDate.of(1983, Month.FEBRUARY, 4);
        fecha = Date.from(fechA.atStartOfDay(ZoneId.systemDefault()).toInstant());
        this.listCanciones.add(new Cancion(
                3, "Billie Jean", "Pop", fecha, 5, "Billie Jean - Michael Jackson", "Billie Jean nos ilustra sobre la paranoia que llegó a dominar la carrera de Michael Jackson. Se trata de una canción sobre una demanda de paternidad, que abandona la exuberancia de sus primeros trabajos para dar paso a un funk tan neurótico como genial. Mientras que la canción que da título a Thriller es aterradora en plan broma, esta da miedo de verdad"
        ));

        fechA = LocalDate.of(1971, Month.MAY, 6);
        fecha = Date.from(fechA.atStartOfDay(ZoneId.systemDefault()).toInstant());
        this.listCanciones.add(new Cancion(
                4, "Mediterráneo", "Balada", fecha, 4, "Mediterráneo - Joan Manuel Serrat", "Para mí y para muchos, la mejor canción jamás compuesta en castellano. Para mí su gran mérito es que, siendo una canción completamente emocional, consigue no ser en absoluto cursi. Nadie ha hecho nunca una canción-postal tan bonita"
        ));

        fechA = LocalDate.of(1965, Month.JUNE, 6);
        fecha = Date.from(fechA.atStartOfDay(ZoneId.systemDefault()).toInstant());
        this.listCanciones.add(new Cancion(
                5, "Satisfaction", "Rock", fecha, 5, "Satisfaction - The Rolling Stones", "Aquí tenemos otro candidato a riff más famoso de la historia. Todo lo bueno de los Rolling Stones de mediados de los 60 condensado en 3 minutos y 45 segundos."
        ));

        fechA = LocalDate.of(1990, Month.MARCH, 29);
        fecha = Date.from(fechA.atStartOfDay(ZoneId.systemDefault()).toInstant());
        this.listCanciones.add(new Cancion(
                6, "Vogue", "Pop", fecha, 3, "Vogue - Madonna", " Vogue es su canción más emblemática y fascinante. Es un portal a un mundo de glamour, al Hollywood clásico pero también al mundo de la cultura de baile underground donde nació. Además consiguió que un homenaje a una parte de la comunidad queer y trans negra y latina vendiese millones de copias en todo el mundo."
        ));
        fechA = LocalDate.of(2003, Month.JULY, 21);
        fecha = Date.from(fechA.atStartOfDay(ZoneId.systemDefault()).toInstant());
        this.listCanciones.add(new Cancion(
                7, "Hey Ya!", "Urbano", fecha, 5, "Hey Ya! - Outkast", "Es esta la canción más pegadiza y divertida del siglo XXI? Esquire vota SÍ. Hey Ya! es una vertiginosa explosión de pop en tecnicolor, comparable a mirar por un caleidoscopio en pleno subidón de azúcar. Solamente recuerda: no sacudas tus Polaroids, por mucho que te lo pida André 3000."
        ));
        fechA = LocalDate.of(2003, Month.JULY, 21);
        fecha = Date.from(fechA.atStartOfDay(ZoneId.systemDefault()).toInstant());
        this.listCanciones.add(new Cancion(
                8, "Hey Ya!", "Urbano", fecha, 3, "Hey Ya! - Outkast", "Es esta la canción más pegadiza y divertida del siglo XXI? Esquire vota SÍ. Hey Ya! es una vertiginosa explosión de pop en tecnicolor, comparable a mirar por un caleidoscopio en pleno subidón de azúcar. Solamente recuerda: no sacudas tus Polaroids, por mucho que te lo pida André 3000."
        ));
        fechA = LocalDate.of(1975, Month.JUNE, 28);
        fecha = Date.from(fechA.atStartOfDay(ZoneId.systemDefault()).toInstant());
        this.listCanciones.add(new Cancion(
                9, "No Woman, No Cry", "Regget", fecha, 4, "No Woman, No Cry - Bob Marley", "La versión más conocida de este tema no es la versión original, publicada en el álbum de estudio de 1974 Natty Dread. Más bien la versión del año siguiente en directo, grabada en el Lyceum Theatre de Londres. Aunque Bob Marley la compuso, la acreditó a su amigo Vincent Ford para que pudiera mantener abierto su comedor social en Kingston"
        ));
        fechA = LocalDate.of(2018, Month.NOVEMBER, 10);
        fecha = Date.from(fechA.atStartOfDay(ZoneId.systemDefault()).toInstant());
        this.listCanciones.add(new Cancion(
                10, "Adictiva", "Reggeton", fecha, 4, "Con calma & mis grandes éxitos", "es una canción de los cantantes puertorriqueños de reguetón Daddy Yankee y Anuel AA . Fue lanzada a través del sello discográfico El Cartel Records el 9 de noviembre de 2018, y llegó al top 5 en España y al top 10 en el Billboard Hot Latin Songs . Después de anunciar la canción, [ 1 ]​ el video musical se lanzó horas más tarde, el 7 de noviembre de 2018, antes del lanzamiento de la canción a las plataformas de streaming. "
        ));

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cancion> getListCanciones() {
        return listCanciones;
    }

    public void setListCanciones(ArrayList<Cancion> listCanciones) {
        this.listCanciones = listCanciones;
    }

    /**
     * Devuelve la lista de canciones de la biblioteca principal filtrada por
     * género.
     *
     * @param genero
     * @return
     */
    public ArrayList< Cancion> getCancionesPorGenero(String genero) {
        ArrayList< Cancion> listFiltrada = new ArrayList<>();

        for (Cancion list : this.listCanciones) {
            if (list.getGenero().equals(genero)) {
                listFiltrada.add(list);
            }
        }
        return listFiltrada;
    }

    /**
     * Devuelve la lista de canciones de la biblioteca principal filtrada por
     * año.
     *
     * @param year Recibe el año.
     * @return
     */
    public ArrayList<Cancion> getCancionesPorYear(Date year) {

        ArrayList<Cancion> listFiltrada = new ArrayList<>();

        for (Cancion list : this.listCanciones) {
            if (list.getFecha().equals(year)) {
                listFiltrada.add(list);
            }
        }
        return listFiltrada;
    }

    public void OrdenarPorFecha() {
        Collections.sort(listCanciones, new Comparator<Cancion>() {

            @Override
            public int compare(Cancion obj1, Cancion obj2) {
                return obj1.getFecha().compareTo(obj2.getFecha());
            }

        });
    }

    public void OrdenarPorDuracion() {
        Collections.sort(listCanciones, new Comparator<Cancion>() {

            @Override
            public int compare(Cancion obj1, Cancion obj2) {
                return obj1.getDuracion().compareTo(obj2.getDuracion());
            }

        });
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "nombre=" + nombre + ", listCanciones=" + listCanciones + '}';
    }
   

}
