
package src.tienda;
import src.clientes.VectorClientes;
import src.Peliculas.DatosPeliculas;
public class Principal {
     public static void main(String[] args){
        Principal p = new Principal();
    }

   private VectorClientes tablaClientes = new VectorClientes();
   private DatosPeliculas tablaPeliculas = new DatosPeliculas();
    public Principal(){
            Impresion();
        }
    public void Impresion(){
        int opcion;
            System.out.println("Bienvenido a memorabilia \n\n");
            System.out.println("1) Ingreso de clientes");
            System.out.println("2) Mostrar clientes");
            System.out.println("3) Ordenar Clientes Ascente");
            System.out.println("4) Ordenar Clientes Descendente");
            System.out.println("5) Ingresar nueva película");
            System.out.println("6) Mostrar  datos de las películas");
            System.out.println("7) Ordenar las películas de forma ascendente respecto al nombre");
            System.out.println("-1) Salir");
            System.out.println("\n");
            opcion = IngresoDatos.getEntero("Ingrese la opción ", true);
            Switch(opcion);
        }
    public void Switch(int opcion){
            switch (opcion) {
                case -1:
                    break;
                case 1:
                    //ingreso de datos
                    tablaClientes.agregarCliente();
                    break;
                case 2:
                    //mostrar clientes
                     tablaClientes.mostrarClientes();
                    break;
                case 3:
                    //mostrar clientes
                    System.out.println("Desordenado:");
                    tablaClientes.mostrarClientes();
                    System.out.println("\n\nOrdenado:");
                    tablaClientes.ordenarPorNombre(true);
                    tablaClientes.mostrarClientes();
                    break;  
                case 4:
                    //mostrar clientes
                    System.out.println("Desordenado:");
                    tablaClientes.mostrarClientes();
                    System.out.println("\n\nOrdenado:");
                    tablaClientes.ordenarPorNombre(false);
                    tablaClientes.mostrarClientes();
                    Impresion();
                    break;
                case 6:
                    //Mostrar Peliculas
                    tablaPeliculas.MostrarPeliculas();
                    Impresion();
                    break;
                case 5:
                    tablaPeliculas.IngresarDatosPelicula();
                    Impresion();
                    break;
                case 7:
                    System.out.println("Desordenado:");
                    tablaPeliculas.MostrarPeliculas();
                    System.out.println("\n\nOrdenado:");
                    tablaPeliculas.ordenarPorNombre();
                    tablaPeliculas.MostrarPeliculas();
                    Impresion();
                    break;
                default:
                    Impresion();
                    break;
            }
    }       
}
