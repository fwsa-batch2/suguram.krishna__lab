public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder strBuild = new StringBuilder("Vaa");
        strBuild.append(" Arunachalam");
        System.out.println(strBuild);
        strBuild.insert(15, " Nee Varuvanu Theriyum");
        System.out.println(strBuild);
        strBuild.replace(35, 38, "adhu");
        System.out.println(strBuild);
        strBuild.delete(16, 40);
        System.out.println(strBuild);
        strBuild.reverse();
        System.out.println(strBuild);
        System.out.println(strBuild.capacity());
    }
}
