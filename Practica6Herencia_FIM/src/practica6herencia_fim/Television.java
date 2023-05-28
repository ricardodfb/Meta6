package practica6herencia_fim;

import java.util.ArrayList;
class Television extends DispositivoElectronico {
    private final Pantalla pantalla;

    public Television(String fabricante, String numeroSerie, String marca, String nombre, float costo, Pantalla pantalla) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.pantalla = pantalla;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    @Override
    public ArrayList<ComponenteElectronico> getComponentes() {
        return null;
    }

    @Override
    public void agregarComponente(ComponenteElectronico componente) {

    }

    @Override
    public void quitarComponente(ComponenteElectronico componente) {
    }

    @Override
    public String toString() {
        return "Television{" +
                "pantalla=" + pantalla +
                "} " + super.toString();
    }
}