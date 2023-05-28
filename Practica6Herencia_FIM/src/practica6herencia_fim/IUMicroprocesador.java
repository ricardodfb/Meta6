package practica6herencia_fim;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class IUMicroprocesador extends Canvas {
    private BufferedImage imagen;
    private Microprocesador microprocesador;

    public IUMicroprocesador(Microprocesador microprocesador) {
        this.microprocesador = microprocesador;
        cargarImagen();

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();

                if (x >= 10 && x <= 60 && y >= 10 && y <= 60) {
                    mostrarEspecificacionesMicroprocesador();
                }
            }
        });
    }

    private void cargarImagen() {
        try {
            imagen = ImageIO.read(new File("C:\\Users\\PC\\microprocesador.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void paint(Graphics g) {
        g.drawImage(imagen, 10, 10, 50, 50, this);
    }

    private void mostrarEspecificacionesMicroprocesador() {
        String nombreImagen = new File("C:\\Users\\PC\\microprocesador.png").getName();

        System.out.println("Especificaciones del microprocesador: " + nombreImagen);
        System.out.println("Cache RAM: " + microprocesador.getCacheRAM() + "KB");
        System.out.println("Velocidad: " + microprocesador.getVelocidadHz() + "Hz");
    }
}
