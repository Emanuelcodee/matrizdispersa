package matricesdispersas;
import java.util.Random;
import java.util.Scanner;

public class MatricesDispersas {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int filas = 0, columnas = 0, insertar = 0;

        System.out.println("Numero de filas:");
        filas = in.nextInt();
        
        System.out.println("Numero de columnas:");
        columnas = in.nextInt();
       
        // Matriz n*m:
        int matrizDispersa[][] = new int[filas][columnas];
 
        System.out.println("Numeros a insertar en la matriz:");
        insertar = in.nextInt();
        
        if(insertar>(filas*columnas)){
            System.out.println("Numero no permitido!");
            System.exit(0);
        }

        int randomColumnas  = 0, randomFilas = 0, contador = 0;
        int a = 1;
        
        // Creacion de la tripleta:
        int Tripleta[][] = new int[insertar + 1][3];
        
        Tripleta[0][0] = filas;
        Tripleta[0][1] = columnas;
        Tripleta[0][2] = insertar;

        // Llenamos la matriz de forma random:
        while (contador < insertar) {
            randomColumnas = new Random().nextInt(columnas - 1);
            randomFilas = new Random().nextInt(filas - 1);
            
            if(matrizDispersa[randomFilas][randomColumnas]==0){
                int value =  new Random().nextInt(25); // Aca se pone hasta que valor los numeros randomizados!
                
                // Por si el random asigna un cero:
                if (value != 0) {
                    matrizDispersa[randomFilas][randomColumnas] = value;

                    Tripleta[a][0] = randomFilas;
                    Tripleta[a][1] = randomColumnas;
                    Tripleta[a][2] = value;

                    a++;
                    contador++;
                }
                
            }  
        }
        
        System.out.println("MATRIZ:");
        mostrarMatriz(matrizDispersa);
        System.out.println("TRIPLETA:");
        mostrarMatriz(Tripleta);
    }
    
    //David was here
    public static void mostrarMatriz(int[][] matriz) {
        for (int a = 0; a < matriz.length; a++) {
            for (int b = 0; b < matriz[a].length; b++) {
                System.out.print("[" + matriz[a][b] + "] ");
            }
            System.out.println("");
        }
    }
}
