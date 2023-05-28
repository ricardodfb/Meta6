package practica6herencia_fim;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class IUTelevision extends Canvas {
    private BufferedImage imagen;
    private Television television;

    public IUTelevision(Television television) {
        this.television = television;
        cargarImagen();

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();

                if (x >= 10 && x <= 60 && y >= 10 && y <= 60) {
                    mostrarEspecificacionesTelevision();
                }
            }
        });
    }

    private void cargarImagen() {
        try {
            imagen = ImageIO.read(new File("C:\\Users\\PC\\television.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void paint(Graphics g) {
        g.drawImage(imagen, 10, 10, 50, 50, this);
    }

    private void mostrarEspecificacionesTelevision() {
        String nombreImagen = new File("C:\\Users\\PC\\television.png").getName();

        System.out.println("Especificaciones de la televisión: " + nombreImagen);
        System.out.println("Fabricante: " + television.getFabricante());
        System.out.println("Número de serie: " + television.getNumeroSerie());
        System.out.println("Marca: " + television.getMarca());
        System.out.println("Nombre: " + television.getNombre());
        System.out.println("Costo: " + television.getCosto());
        System.out.println("Pantalla: " + television.getPantalla());
    }
}
