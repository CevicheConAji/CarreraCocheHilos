import java.util.Random;

public class Coche extends Thread {
    private static int contador = 0 ;
    private int id;
    private String nombre;
    private int distancia;

    public Coche(String nombre) {
        this.nombre = nombre;
        this.id = ++contador;
        System.out.println("Coche creado: " + getNombre()+ " (" + obtenerId() + ") ");
    }

    @Override
    public void run() {
        Random r = new Random();
        for(int i = 0; i < 500; i++) {
            distancia += r.nextInt(100 - 0 )+100;
            System.out.println(getNombre()+" ("+obtenerId() + ") "+" distancia: " + distancia);
            i = distancia;
            if(distancia >= 500) {
                System.out.println(getNombre()+" ("+obtenerId() + ") "+ " ha finzalizado la carrera "+getDistancia());
            }
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println("Error "+e.getMessage());
            }
        }
    }


    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Coche.contador = contador;
    }


    public int obtenerId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
}
