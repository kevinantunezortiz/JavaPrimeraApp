package screenmatch;

public class ScreenMatch {
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a Screen Match");
        System.out.println("Pelicula: Matrix");
        //CamelCase
        int fechaDeLanzamiento = 1999 ;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        double media = (8.2+6.0+9.0) / 3;
        System.out.println(media);
        String sinopsis = """
                Matrix es una Paradoja
                La mejor pelicula del fin del milenio
                Fue lanzada en:
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);
      /*  String nombre = "Maria";
        int edad = 30;
        double valor = 55.9999;
        System.out.println(String.format("Mi nombre es %s, tengo %d años y hoy gasté %.2f dolares", nombre, edad, valor));*/
        String nombre ="Kevin";
        int aulas = 4;

        String mensaje= """
                  Hola, %s!
                  Bienvenido al curso de Java.
                  Tendremos %d aulas para mostrarte lo que es necesario para que puedas dar tu primeros pasos en este lenguaje                  """.formatted(nombre, aulas);

        System.out.println(mensaje);
    }
}
