public class String_Basics {
    public static void main(String args[]){
        String name = "Suguram";
        String name1 = "Ram";
        //Concatination
        System.out.println(name +" is also known as "+ name1);
        //replacing a char
        String name2 = name.replace("r","m");
        System.out.println(name2);
        //substring
        System.out.println(name.substring(0, 4));
    }    
}
