package src.Peliculas;

import src.tienda.*;


public class DatosPeliculas {
    private int Max = 50;
    private Peliculas[] Peliculas = new Peliculas[Max];
    private int ContadorPeliculas;

    public DatosPeliculas() {
        ContadorPeliculas = 1;
    }

    public int getMax() {
        return Max;
    }

    public void setMax(int Max) {
        this.Max = Max;
    }

    public Peliculas[] getPeliculas() {
        return Peliculas;
    }

    public void setPeliculas(Peliculas[] Peliculas) {
        this.Peliculas = Peliculas;
    }

    public int getContadorPeliculas() {
        return ContadorPeliculas;
    }

    public void setContadorPeliculas(int ContadorPeliculas) {
        this.ContadorPeliculas = ContadorPeliculas;
    }
    public void IngresarDatosPelicula(){
        String nombre = IngresoDatos.getTexto("Ingrese el nombre de la pelicula");
        int fecha = IngresoDatos.getEntero("Ingrese el año de salida", false);
        String cat = IngresoDatos.getTexto("Ingrese el nombre de la Categoria");
        Peliculas[ContadorPeliculas-1] = new Peliculas(ContadorPeliculas,nombre,fecha,cat,true,0);
        ContadorPeliculas++;
    }
    public void MostrarPeliculas(){
        for(int x = 0 ; x < ContadorPeliculas - 1 ; x++){
             System.out.println(Peliculas[x].MostrarInfo());
        }
    }
    public void ordenarPorNombre(){
    boolean Cambio;
        for (int i = 1; i < (ContadorPeliculas-1); i++) {
            for (int j = 0; j < (ContadorPeliculas-1-i); j++) {
                    Cambio = (Peliculas[j].getNombre().compareTo(Peliculas[j+1].getNombre()) > 0 );
                    if(Cambio){
                    //clientes i va antes que clientes j <0 descendente
                    Peliculas aux = Peliculas[j];
                    Peliculas[j] = Peliculas[j+1];
                    Peliculas[j+1]= aux;
                }
            }
        }
    }
}
