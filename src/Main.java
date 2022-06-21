public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        var result = suma(a, b);

        System.out.println("El resultado de la suma es " + result);

        auto miAuto = new auto();
        miAuto.addDoor();
        miAuto.addDoor();
        System.out.println("La cantidad de puertas es " + miAuto.door);


    }

    public static int suma(int a, int b) {
        return a + b;
    }
}
class auto {
    public int door = 2;

    public void addDoor(){
        this.door++;
    }
}
