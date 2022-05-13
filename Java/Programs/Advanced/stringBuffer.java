public class stringBuffer {
    public static void main(String[] args) {
        StringBuffer stringPractice = new StringBuffer("Suguram");
        System.out.println(stringPractice);
        // stringPractice.append("SK");
        stringPractice.replace(4,7,"mar");
        // stringPractice.delete(4,6);
        System.out.println(stringPractice);
    }
}
