public class array {
    public static void main(String[] args) {
        int sizeOfArray = 5;
        String[] language = new String[sizeOfArray];
        language[0] = "tamil";
        language[1] = "english";
        language[2] = "malayalam";
        language[3] = "hindi";
        language[4] = "french";

        // printing the values of the array

        // System.out.println(language[0]);
        // System.out.println(language[1]);
        // System.out.println(language[2]);
        // System.out.println(language[3]);
        // System.out.println(language[4]);


        // can print all the values in a single time using for loop

    
        // Integer len = 5;
        for (Integer i = 0; i < sizeOfArray; i++) {
            System.out.println(language[i]);
        }
    }
}
