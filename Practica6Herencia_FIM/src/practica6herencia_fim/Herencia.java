package practica6herencia_fim;

import java.util.*;
public class Herencia {
    public static void main(String[] args) {
        IUComputadora computadora = new IUComputadora("Fabricante", "123456", "Marca", "Nombre", 1000.0f);
        Smartphone smartphone1 = new Smartphone("Fabricante1", "1234", "Marca1", "Smartphone 1", 1000.0f,
                new Microprocesador(4, 2000), 2048, new Sensor("Tipo1", "Unidad1", 50),
                new Pantalla(1080, 1920));

        Smartphone smartphone2 = new Smartphone("Fabricante2", "5678", "Marca2", "Smartphone 2", 1500.0f,
                new Microprocesador(8, 2500), 4096, new Sensor("Tipo2", "Unidad2", 75),
                new Pantalla(1440, 2560));

        Television tv1 = new Television("Fabricante3", "91011", "Marca3", "Televisión 1", 2000.0f,
                new Pantalla(1920, 1080));

        Television tv2 = new Television("Fabricante4", "121314", "Marca4", "Televisión 2", 2500.0f,
                new Pantalla(3840, 2160));

        ArrayList<Smartphone> listaDeSmartphones = new ArrayList<>();
        listaDeSmartphones.add(smartphone1);
        listaDeSmartphones.add(smartphone2);

        ArrayList<Television> listaDeTVs = new ArrayList<>();
        listaDeTVs.add(tv1);
        listaDeTVs.add(tv2);

        System.out.println("Lista de Smartphones:");
        for (Smartphone smartphone : listaDeSmartphones) {
            System.out.println(smartphone.toString());
        }

        System.out.println("Lista de TVs:");
        for (Television tv : listaDeTVs) {
            System.out.println(tv.toString());
        }
    }
}
