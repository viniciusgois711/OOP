package Lista1POO.Subject;

public class Subject {

    private double score1, score2, finalExam, firstAverage;


    public Subject(double score1, double score2){
        this.score1 = score1;
        this.score2 = score2;
    }

    public boolean approved(double firstAverage){
        if (firstAverage < 60){
            return false;
        }else{
            return true;
        }
    }

    public double finalAverage(double firstAverage, double finalExam){
        return (firstAverage+finalExam)/2;
    }

    public double weightedAverage(){
        return ((this.score1*2)+(this.score2*3))/5;
    }

    public void setFinalExam(double finalExam){
        this.finalExam = finalExam;
    }
    public void setScore1(double score1){
        this.score1 = score1;
    }
    public void setScore2(double score2){
        this.score2 = score2;
    }
    public double getScore1(){
        return this.score1;
    }
    public double getScore2(){
        return this.score2;
    }
    public double getFinalExam(){
        return this.finalExam;
    }
}
