public class Main {
    public static void main(String[] args) {
        String nombre = "hola";
        Coche c1 = new Coche("Piero");
        Coche c2 = new Coche("Paco");

        c1.start();
        c2.start();
        try{
            c1.join();
            c2.join();
        }catch (Exception e){
            System.out.println("Error "+e.getMessage());
        }
    }
}