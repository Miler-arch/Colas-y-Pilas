public class Cola {

    int elemento;
    Cola siguiente;

    public Cola(int x)
    {
        elemento = x;
        siguiente = null;
    }

}
        class ColaLista {
        protected Cola primero;
        protected Cola ultimo;


        public ColaLista() {
            primero = ultimo = null;
        }

        public void insertar(int elemento) {
            Cola a;
            a = new Cola(elemento);
            if (colaVacia()) {
                primero = a;
            } else {
                ultimo.siguiente = a;
            }
            ultimo = a;

        }
            //operacion

            public boolean colaVacia() {
                if (primero == null) {
                    return true;
                } else {
                    return false;
                }
            }

            public int quitar(){
                int aux;
                if(!colaVacia()){
                    aux = primero.elemento;
                    primero = primero.siguiente;
                }
                else{
                    return -1;
                }
                return aux;

        }
            public void eliminarCola()
            {
                while ( primero != null){
                    primero = primero.siguiente;
                }
            }

}
