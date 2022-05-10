public class wrapperPractice {
    public static void main(String[] args) {
        
        //int to Integer

        int i = 10;
        Integer obj = Integer.valueOf(i);
        System.out.println(obj);

        //char to Character
        char a = 's';
        Character obj1 = Character.valueOf(a);
        System.out.println(obj1);

        //Integer to Int

        Integer obj2 = 2;
        int var1  = obj2;
        System.out.println(var1);

        //Character to char
         Character obj3 = 'k';
         char var2 = obj3;
         System.out.println(var2);

         System.out.println(obj+obj1);

         System.out.println(var1+var2);
    }
}