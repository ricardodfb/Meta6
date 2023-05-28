package practica6herencia_fim;

import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Draw extends Canvas {

   private BufferedImage image;
   private BufferedImage image2;

   public Draw() {
       try {
           image = ImageIO.read(new File("D:\\Files\\Documents\\semestre4\\poo\\net beans\\Practica6Herencia_FIM\\src\\practica6herencia_fim\\circuito.png"));
       } catch (Exception e) {
           e.printStackTrace();
       }
       
       addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();

                if (x >= 10 && x <= 60 && y >= 10 && y <= 60) {
                    mostrarEspecificacionesImagen(image, "circuito.png");
                }
                
                if (x >= 70 && x <= 120 && y >= 10 && y <= 60) {
                    mostrarEspecificacionesImagen(image2, "pantalla.png");
                }
            }
        });
   }

   @Override
   public void paint(Graphics g) {
       // Dibujar la primera imagen en el objeto Canvas
       g.drawImage(image, 10, 10, 50, 50, this);
       // Dibujar la segunda imagen en el objeto Canvas
       g.drawImage(image2, 70, 10, 50, 50, this);
   }

   private void mostrarEspecificacionesImagen(BufferedImage img, String nombreImagen) {
       int width = img.getWidth();
       int height = img.getHeight();
       int type = img.getType();
       
       System.out.println("Especificaciones de la imagen: " + nombreImagen);
       System.out.println("Ancho: " + width);
       System.out.println("Alto: " + height);
       System.out.println("Tipo: " + type);
   }

   public static void main(String[] args) {
       Draw canvas = new Draw();
       Frame frame = new Frame();
       frame.setSize(300, 300);
       frame.add(canvas);
       frame.setVisible(true);
   }
}
