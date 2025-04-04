package screenmatch;

public class Decisiones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 2022 ;
        boolean incluidoEnElPlan = false;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "basico";

//        if(fechaDeLanzamiento >= 2022){
//            System.out.println("Peliculas más Populares");
//        }else{
//            System.out.println("Pelicula Retro que aún vale la pena ver");
//        }
        // || esto significa O es decir que con que una condicion sea verdadera se ejecutara laS instruccionES dentro del if
        // && esto significa Y es decir que todos las condiciones deben de cumplirse para ejecutar las instrucciones dentro del if
        if(incluidoEnElPlan || tipoPlan.equals("plus")){
            System.out.println("Disfrute de su pelicula");
        }else{
            System.out.println("Pelicula no disponible para su plan actual");
        }
    }
}
