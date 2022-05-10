class defaultSpecifier {
    private int defaultCheck;
    private String passwordCheck;
    
    public defaultSpecifier(){
        defaultCheck = 12;
        passwordCheck = "Sk123@gmail.com";
    }

    public static void main(String[] args) {
        defaultSpecifier check = new defaultSpecifier();
        System.out.println(check.defaultCheck);
        System.out.println(check.passwordCheck);
    }
}