package practica6herencia_fim;

import java.util.ArrayList;

public class DispositivoElectronico {
    protected String fabricante;
    protected String numeroSerie;
    protected String marca;
    protected String nombre;
    protected float costo;

    public DispositivoElectronico(String fabricante, String numeroSerie, String marca, String nombre, float costo) {
        this.fabricante = fabricante;
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.nombre = nombre;
        this.costo = costo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public String getMarca() {
        return marca;
    }

    public String getNombre() {
        return nombre;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public ArrayList<ComponenteElectronico> getComponentes() {
        return new ArrayList<>();
    }

    public void agregarComponente(ComponenteElectronico componente) {
    }

    public void quitarComponente(ComponenteElectronico componente) {
    }

    @Override
    public String toString() {
        return "DispositivoElectronico{" + "fabricante='" + fabricante + '\'' + ", numeroSerie='" + numeroSerie + '\'' + ", marca='" + marca + '\'' + ", nombre='" + nombre + '\'' + ", costo=" + costo + '}';
    }
}
