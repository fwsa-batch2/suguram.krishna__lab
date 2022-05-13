package Programs.Exercises;

public class arraySorting {
    public static void main(String args[]){
        int number [] = {8,45,12,4,80,90};
        int length = number.length;
        for(int i=0; i<length; i++){
            int temporary = 0;
            for(int j=i+1; j<length; j++){
                if(number[i]<number[j]){
                    temporary = number[i];
                    number[i] = number[j];
                    number[j] = temporary;
                }
            }
            System.out.println(number[i]);
        }
    }
}
