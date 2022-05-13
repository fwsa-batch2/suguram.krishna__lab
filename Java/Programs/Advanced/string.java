public class string {
   public static void main(String[] args) {
        // Declaring a String

    String s = "Suguram";
    String s1 = new String("Sugu");

    System.out.println(s);
    System.out.println(s1);

    String concat = "Hello";
    int a = 10;
    System.out.println(concat +a);

    String replc = "Hello!! World";
    System.out.println(replc.replace("World", "India"));

    String cont = "Welcome to India";
    System.out.println(cont.contains("India"));

    String eq1 = "I am a Human";
    String eq2 = "I am a AI";
    String eq3 = "I am a Human";
    System.out.println(eq1.equals(eq2));
    System.out.println(eq1.equals(eq3));

    String caseSe1 = "I am iron Man";
    String caseSe2 = "I am IRON MAN";
    String caseSe3 = "I am Spiderman";
    System.out.println(caseSe1.equalsIgnoreCase(caseSe2));
    System.out.println(caseSe2.equalsIgnoreCase(caseSe3));

    String charArray="Welcome to Edureka";
    char[] ch=charArray.toCharArray();
    for(int i=0;i<ch.length;i++){
    System.out.print(ch[i]);
    }
   }
}
