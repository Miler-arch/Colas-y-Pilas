public class Main {

    public static void pila(){
        PilaLista pila = new PilaLista();
        pila.insertar(1);
        pila.insertar(2);
        pila.insertar(3);
        pila.insertar(4);
        pila.insertar(5);
        pila.insertar(6);
        pila.insertar(7);

        print(""+pila.quitar());
        print(""+pila.quitar());
        print(""+pila.quitar());
        print(""+pila.quitar());
        print(""+pila.quitar());
        print(""+pila.quitar());
        print(""+pila.quitar());
    }
    public static void cola()
    {
        ColaLista cola = new ColaLista();

        cola.insertar(1);
        cola.insertar(2);
        cola.insertar(3);
        cola.insertar(4);
        cola.insertar(5);
        cola.insertar(6);
        cola.insertar(7);

        print(""+cola.quitar());
        print(""+cola.quitar());
        print(""+cola.quitar());
        print(""+cola.quitar());
        print(""+cola.quitar());
        print(""+cola.quitar());
        print(""+cola.quitar());
    }

    public static void main(String[] args){
        pila();
        //cola();
    }
    private static void print(String numero) {
        System.out.print(numero);
    }
}
