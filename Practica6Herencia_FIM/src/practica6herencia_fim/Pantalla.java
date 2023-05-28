package practica6herencia_fim;

class Pantalla extends ComponenteElectronico {
    private final int resolucionX;
    private final int resolucionY;

    public Pantalla(int resolucionX, int resolucionY) {
        this.resolucionX = resolucionX;
        this.resolucionY = resolucionY;
    }

    public int getResolucionX() {
        return resolucionX;
    }

    public int getResolucionY() {
        return resolucionY;
    }

    @Override
    public String toString() {
        return "Pantalla{" +
                "resolucionX=" + resolucionX +
                ", resolucionY=" + resolucionY +
                '}';
    }
}

