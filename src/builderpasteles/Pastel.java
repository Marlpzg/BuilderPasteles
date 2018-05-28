package builderpasteles;

public class Pastel {

    private String nombre, saborPrincipal,  saborSecundario, saborOpc1, saborOpc2, saborOpc3;
    private int porciones;
    
    private Pastel (PastelBuilder builder){
        
        this.nombre = builder.nombre;
        this.porciones = builder.porciones;
        this.saborPrincipal = builder.saborPrincipal;
        this.saborSecundario = builder.saborSecundario;
        this.saborOpc1 = builder.saborOpc1;
        this.saborOpc2 = builder.saborOpc2;
        this.saborOpc3 = builder.saborOpc3;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSaborPrincipal() {
        return saborPrincipal;
    }

    public void setSaborPrincipal(String saborPrincipal) {
        this.saborPrincipal = saborPrincipal;
    }

    public String getSaborSecundario() {
        return saborSecundario;
    }

    public void setSaborSecundario(String saborSecundario) {
        this.saborSecundario = saborSecundario;
    }

    public String getsOpcional1() {
        return saborOpc1;
    }

    public void setsOpcional1(String sOpcional1) {
        this.saborOpc1 = sOpcional1;
    }

    public String getsOpcional2() {
        return saborOpc2;
    }

    public void setsOpcional2(String sOpcional2) {
        this.saborOpc2 = sOpcional2;
    }

    public String getsOpcional3() {
        return saborOpc3;
    }

    public void setsOpcional3(String sOpcional3) {
        this.saborOpc3 = sOpcional3;
    }

    public int getPorciones() {
        return porciones;
    }

    public void setPorciones(int porciones) {
        this.porciones = porciones;
    }

    public static class PastelBuilder {
        private final String nombre, saborPrincipal,  saborSecundario;
        private String saborOpc1, saborOpc2, saborOpc3;
        private final int porciones;
        
        public PastelBuilder(String nombre, String saborPrincipal, String saborSecundario, int porciones){
            
            this.nombre = nombre;
            this.saborPrincipal = saborPrincipal;
            this.saborSecundario = saborSecundario;
            this.porciones = porciones;
            
        }
        
        public PastelBuilder saborOpc1(String sabor){
            
            this.saborOpc1 = sabor;
            return this;
            
        }
        
        public PastelBuilder saborOpc2(String sabor){
            
            this.saborOpc2 = sabor;
            return this;
            
        }
        
        public PastelBuilder saborOpc3(String sabor){
            
            this.saborOpc3 = sabor;
            return this;
            
        }
        
        public Pastel build(){
            return new Pastel(this);
        }
    }
    
    public static Pastel getPastel(){
    
        return new PastelBuilder("Cheesecake", "Queso", "Fresa", 8).saborOpc1("Caramelo").build();
    
    }

    @Override
    public String toString() {
        return "Nombre:" + nombre + ", Sabor Principal: " + saborPrincipal + ", Sabor Secundario: " + saborSecundario + ", Sabor Opcional 1: " + saborOpc1 + ", Sabor Opcional 2: " + saborOpc2 + ", Sabor Opcional 3: " + saborOpc3 + ", Porciones: " + porciones;
    }
  
}
