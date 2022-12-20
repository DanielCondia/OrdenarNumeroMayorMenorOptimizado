public class Main {
    public static void main(String[] args) {
        int[] array = {140,139,160,170,135};
        int[] arrayOrdenado = new int [array.length];
        int controlador = 1;
        for (int i = 0; i < array.length; i++) {
            if(controlador == array.length){
                controlador = array.length;
                controlador--;
            }
            if(array[controlador] < array[i]){
                arrayOrdenado[i] = array[controlador];
                arrayOrdenado[controlador] = array[i];
                int contador = ++controlador;
                while(contador < array.length){
                    arrayOrdenado[contador] = array[contador];
                    contador++;
                }
                array = new int[array.length];
                array = arrayOrdenado;
                arrayOrdenado = new int[array.length];
                i = -1;
                controlador = 0;
            }
            else{
                arrayOrdenado[i] = array[i];
            }
            controlador++;
        }
        imprimirNumeros(arrayOrdenado);
    }
    public static void imprimirNumeros(int[] arrayOrdenado){
        for (int i = 0; i < arrayOrdenado.length; i++) {
            System.out.println(arrayOrdenado[i]);
        }
    }
}