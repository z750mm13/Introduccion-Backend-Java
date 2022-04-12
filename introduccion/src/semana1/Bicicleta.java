package semana1;

public class Bicicleta {
    // Caracteristicas
    public int pins, rodada;
    public double velocidad;

    public int getPins() {  return pins;  }
    public double getVelocidad() {  return velocidad;  }
    public int getRodada() {  return rodada;  }

    public boolean setPins(int pins) {
        if ( !(pins>0) ) return false;
        this.pins = pins;
        return true;
    }

    public boolean setRodada(int rodada) {
        if ( !(rodada>0) ) return false;
        this.rodada = rodada;
        return true;
    }

    public boolean setVelocidad(double velocidad) {
        if ( !(velocidad>=0) ) return false;
        this.velocidad = velocidad;
        return true;
    }

    public String toString() {
        return "Bicicleta [\n"+
                "pins: "+pins+"\n"+
                "rodada: "+rodada+"\n"+
                "velocidad: "+velocidad+"\n"+
                "]";
    }
}