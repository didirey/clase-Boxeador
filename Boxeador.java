public class Boxeador {
    
    public String nombre;
    
    private int potenciaGolpe;
    
    private boolean KO;
    
    
    public Boxeador(String nombreBoxeador, int fuerzaGolpe, boolean estado){
        nombre = nombreBoxeador;
        potenciaGolpe = 0;
        KO = estado;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getPotenciaGolpe() {
        return potenciaGolpe;
    }

    public boolean getEstado() {
        return KO;
    }

    public void setNombre(String ponerNombre) {
        nombre=ponerNombre;
    }

    public void setPotenciaGolpe(int ponerPotencia) {
        potenciaGolpe = ponerPotencia;
    }

    public void setKO() {
        KO = true;
    }










}