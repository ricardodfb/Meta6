package practica6herencia_fim;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class IUComputadora extends DispositivoElectronico {
    private String direccionImagen;
    private BufferedImage imagen;
    private JPanel panelImagen;

    public IUComputadora(String fabricante, String numeroSerie, String marca, String nombre, float costo) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.direccionImagen = "C:\\Users\\PC\\computadora.png";
        cargarImagen();

        panelImagen = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(imagen, 0, 0, null);
            }
        };
        panelImagen.setOpaque(false);
        panelImagen.setBounds(10, 10, imagen.getWidth(), imagen.getHeight());

        panelImagen.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();

                if (x >= 10 && x <= 60 && y >= 10 && y <= 60) {
                    mostrarEspecificacionesImagen();
                }
            }
        });

        JFrame frame = new JFrame("Computadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.add(panelImagen);
        frame.setVisible(true);
    }

    private void cargarImagen() {
        try {
            imagen = ImageIO.read(new File(direccionImagen));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

private void mostrarEspecificacionesImagen() {
    String nombreImagen = new File(direccionImagen).getName();

    System.out.println("Especificaciones de la imagen: " + nombreImagen);
    System.out.println("Fabricante: " + getFabricante());
    System.out.println("Número de serie: " + getNumeroSerie());
    System.out.println("Marca: " + getMarca());
    System.out.println("Nombre: " + getNombre());
    System.out.println("Costo: " + getCosto());
}

}
