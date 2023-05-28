package practica6herencia_fim;

public class ComponenteElectronico {
    private DispositivoElectronico esParteDe;

    public DispositivoElectronico getEsParteDe() {
        return esParteDe;
    }

    public void setEsParteDe(DispositivoElectronico esParteDe) {
        this.esParteDe = esParteDe;
    }

    @Override
    public String toString() {
        return "ComponenteElectronico{" +
                "esParteDe=" + esParteDe +
                '}';
    }
}

