package Programs.Exercises;

public class FibboExercise {
    public static void main (String args[]){
        int series = 10;
        int fnum=0;
        int snum=1;
        int tnum;
        
        System.out.println(fnum);
        System.out.println(snum);
        

        for(int i=3; i<=series; i++){
        tnum=fnum+snum;
        System.out.println(tnum);
        fnum=snum;
        snum=tnum;
        }
    }
}
