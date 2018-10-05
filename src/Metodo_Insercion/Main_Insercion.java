package Metodo_Insercion;

import javax.swing.JOptionPane;

public class Main_Insercion {

    public static void main(String[] args) {
        
        

        Alg_Ordenamiento ordenar = new Alg_Ordenamiento();

        int tam;
        tam = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el Tamaño del Arreglo"));
        int vector[] = new int[tam];
        for (int i = 0; i < tam; i++) {
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite los elemento indice " + i));
            ordenar.Insercion(vector, i + 1);
        }
    }
}
