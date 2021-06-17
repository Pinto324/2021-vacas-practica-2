
package src.Peliculas;

public class Peliculas {
    private int Id;
    private String Nombre;
    private int Año;
    private String Categoria;
    private boolean Disponible;
    private int VecesPrestada;

    public Peliculas(int Id, String Nombre, int Año, String Categoria, boolean Disponible, int VecesPrestada) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Año = Año;
        this.Categoria = Categoria;
        this.Disponible = Disponible;
        this.VecesPrestada = VecesPrestada;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public boolean isDisponible() {
        return Disponible;
    }

    public void setDisponible(boolean Disponible) {
        this.Disponible = Disponible;
    }

    public int getVecesPrestada() {
        return VecesPrestada;
    }

    public void setVecesPrestada(int VecesPrestada) {
        this.VecesPrestada = VecesPrestada;
    }
    public String MostrarInfo(){
        if(Disponible){
        return Id+" | "+Nombre+" | "+" | "+Año+" | "+Categoria+" | Está disponible";
        }else{
        return Id+" | "+Nombre+" | "+" | "+Año+" | "+Categoria+" | No está disponible";
        }
    }
}
