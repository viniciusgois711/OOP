package algoritmos.BubbleSort;

import java.io.*;

public class BubbleSort100 {
    public static void main(String[] args) {
        int tamanhoEntrada = 1000000;
        String caminhoArquivo = "C:\\Users\\luvin\\OneDrive\\Área de Trabalho\\OOP\\src\\main\\java\\algoritmos\\NumerosAleatorios\\UmMilhao.txt";

        try {
            int[] array = new int[tamanhoEntrada];

            BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo));

            for(int i = 0; i < array.length; i++){
                array[i] = Integer.parseInt(reader.readLine());

            }
            reader.close();

            long inicio = System.nanoTime();

            bubbleSort(array);

            long fim = System.nanoTime();
            long duracao = (fim-inicio);

            System.out.println(duracao);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void bubbleSort(int[] array){

        for(int i =0; i < array.length-1; i++){
            for(int j = 0; j< array.length-i-1; j++){
                if(array[j] > array[j+1]){
                    int n = array[j];
                    array[j] = array[j+1];
                    array[j+1] = n;
                }
            }
        }
    }

}

