package prova;

public class Q1 {
    public static void main(String[] args) {
        int dia = 3;
        String nomeDia;
        if(dia == 1){
            nomeDia = "Domingo";
        }else if(dia == 2){
            nomeDia = "Segunda";
        }else if(dia == 3){
            nomeDia = "Terca";
        }else{
            nomeDia = "Dia Inválido";
        }
        System.out.println(nomeDia);
    }
}
