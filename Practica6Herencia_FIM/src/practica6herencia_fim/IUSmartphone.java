package practica6herencia_fim;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class IUSmartphone extends Canvas {
    private BufferedImage imagen;
    private Smartphone smartphone;

    public IUSmartphone(Smartphone smartphone) {
        this.smartphone = smartphone;
        cargarImagen();

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();

                if (x >= 10 && x <= 60 && y >= 10 && y <= 60) {
                    mostrarEspecificacionesSmartphone();
                }
            }
        });
    }

    private void cargarImagen() {
        try {
            imagen = ImageIO.read(new File("C:\\Users\\PC\\smartphone.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(imagen, 10, 10, 50, 50, this);
    }

    private void mostrarEspecificacionesSmartphone() {
        String nombreImagen = new File("C:\\Users\\PC\\smartphone.png").getName();

        System.out.println("Especificaciones del smartphone: " + nombreImagen);
        System.out.println("Fabricante: " + smartphone.getFabricante());
        System.out.println("Número de serie: " + smartphone.getNumeroSerie());
        System.out.println("Marca: " + smartphone.getMarca());
        System.out.println("Nombre: " + smartphone.getNombre());
        System.out.println("Costo: " + smartphone.getCosto());
        System.out.println("CPU: " + smartphone.getCpu());
        System.out.println("RAM: " + smartphone.getRamMB() + "MB");
        System.out.println("Sensor de huella: " + smartphone.getSensorDeHuella());
        System.out.println("Pantalla: " + smartphone.getPantalla());
    }
}
