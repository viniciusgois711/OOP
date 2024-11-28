/*
A classe deve ter atributos para armazenar o nome da disciplina e as notas dos dois bimestres e da prova final.
Os métodos da classe devem permitir calcular a média parcial (com as notas bimestrais) e
a média final (com todas as notas, caso o aluno tenha ficado na prova final).
Considere como média de aprovação o valor 60, notas de 0 a 100, média parcial ponderada com pesos 2 e 3 e média final como a média
aritmética da média parcial com a nota da prova final,
caso o aluno não seja aprovado por média.
Escrever um programa para testar a classe.
*/

package Lista1POO.Subject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String subjectName;
        double score1, score2, finalExam, firstAverage, resultScore;
        boolean approved;
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the subject name: ");
        subjectName = sc.next();
        System.out.println("Type the score1: ");
        score1 = sc.nextDouble();
        System.out.println("Type the score2: ");
        score2 = sc.nextDouble();

        Subject subject = new Subject(score1, score2);

        firstAverage = subject.weightedAverage();
        System.out.println("The first average is: " + firstAverage);

        approved = subject.approved(firstAverage);

        if(approved){
            System.out.println("The student was approved in " + subjectName);
        }else{
            System.out.println("The student wasn't approved, type the final exam score");
            finalExam = sc.nextDouble();
            resultScore = subject.finalAverage(firstAverage, finalExam);
            approved = subject.approved(resultScore);
            if (approved){
                System.out.println("The student was approved in " + subjectName);
            }else{
                System.out.println("The student wasn't approved with the final exam");
            }

        }

    }
}
