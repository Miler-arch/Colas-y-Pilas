public class Pila {

    int elemento;
    Pila siguiente;

    Pila(int x){
        elemento = x;
        siguiente = null;
    }
}

class PilaLista{
    private Pila cima;

    public PilaLista()
    {
        cima = null;
    }

    //operacion

    public boolean pilaVacia() {
        if (cima == null)
        {
            return true;
        }
        else {
            return false;
        }
    }
    public void insertar(int elemento)
    {
        Pila nuevo;
        nuevo = new Pila(elemento);
        nuevo.siguiente = cima;
        cima = nuevo;
    }
    public int quitar(){
        if(pilaVacia()){
            return -1;
        }

        int aux = cima.elemento;
        cima = cima.siguiente;
        return aux;
    }
    public void eliminarPila(){
        Pila t;
        while (!pilaVacia()){
            t = cima;
            cima = cima.siguiente;
            t.siguiente = null;
        }
    }


}