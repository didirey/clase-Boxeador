public class Boxeador {
    
    public String nombre;
    
    private int potenciaGolpe;
    
    private boolean ko;
    
    
    public Boxeador(String nombreBoxeador, int fuerzaGolpe, boolean estado){
        nombre = nombreBoxeador;
        potenciaGolpe = fuerzaGolpe;
        ko = estado;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getPotenciaGolpe() {
        return potenciaGolpe;
    }

    public boolean getKO() {
        return ko;
    }

    public void setNombre(String ponerNombre) {
        nombre=ponerNombre;
    }

    public void setPotenciaGolpe(int ponerPotencia) {
        potenciaGolpe = ponerPotencia;
    }

    public void setKO() {
        ko = true;
    }

    public void imprimirDetalles(){
        System.out.println("|Nombre boxeador: " + nombre + " |Potencia de golpe de: " + potenciaGolpe + " |Estado KO: " + ko + " |");
    }

    public String getEstadoObjeto() {
        return "El boxeador se llama " + nombre + " tiene una potencia de golpe de " + potenciaGolpe + " y su estado KO es " + ko;
    }









}