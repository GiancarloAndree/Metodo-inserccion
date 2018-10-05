package Metodo_Insercion;

public class Alg_Ordenamiento {

    int i;
    int j;
    int temporal;
    int recorrido;

    public Alg_Ordenamiento() {
        this.i = 0;
        this.j = 0;
        this.temporal = 0;
    }

    public void Insercion(int[] arreglo, int n) {
        int i, j, auxiliar;
        for (i = 1; i < n; i++) {
            auxiliar = arreglo[i];
            j = i - 1;
            while (j >= 0 && arreglo[j] > auxiliar) {
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            arreglo[j + 1] = auxiliar;

        }

        Mostrar_Arreglo(arreglo);
    }

    public void Mostrar_Arreglo(int[] arreglo) {
        int k;
        for (k = 0; k < arreglo.length; k++) {
            System.out.print("[" + arreglo[k] + "]");

        }
        System.out.println("");
    }
}
