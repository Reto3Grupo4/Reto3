package EjerObjetos;

public class Coche {

    private int velocidad;
    
    public Coche(int velocidadInicial) {
    	super();
    	velocidad =0;
        this.velocidad = velocidadInicial;
    }
    
    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {

        this.velocidad = velocidad;

        if (velocidad == 0) {
            System.out.println("Finalizado");
        }
    }
	

	public void acelera (int mas) {
		this.velocidad += mas;
		
	}
	
	public void frena (int menos) {
		if(menos <0) {
			this.velocidad += menos;
		}else {
			this.velocidad -= menos;
		}
		if(this.velocidad < 0) {
			this.velocidad = 0;
		}
	}

}

