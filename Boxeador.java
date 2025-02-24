public class Boxeador {
    
    public String nombre;
    
    private int potenciaGolpe;
    
    private boolean ko;
    
    
    public Boxeador(String nombreBoxeador, int fuerzaGolpe){
        nombre = nombreBoxeador;
        potenciaGolpe = fuerzaGolpe;
        ko = false;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getPotenciaGolpe(int introducirPotencia) {
        potenciaGolpe = introducirPotencia - 1;
        return potenciaGolpe;
    }

    public boolean getKO() {
        ko = true;
        return ko;
    }

    public void setNombre(String ponerNombre) {
        nombre=ponerNombre;
    }

    public void setPotenciaGolpe(int ponerPotencia) {
        potenciaGolpe = ponerPotencia;
    }

    public void setKO() {
        if(ko == false) {
            ko = true;
        }
        else {
            ko = false;
        }
    }

    public void imprimirDetalles(){
        String estado;
        if(ko == true) {
            estado = "Si";
        }
        else {
            estado = "No";
        }
        System.out.println("|Nombre boxeador: " + nombre + " |Potencia de golpe de: " + potenciaGolpe + " |Estado noqueado: " + estado + " |");
    }

    public String getEstadoObjeto() {
        String estado;
        if(ko == true) {
            estado = "Si";
        }
        else {
            estado = "No";
        }
        return "El boxeador se llama " + nombre + " tiene una potencia de golpe de " + potenciaGolpe + " y su estado noqueado es " + estado;
    }









}