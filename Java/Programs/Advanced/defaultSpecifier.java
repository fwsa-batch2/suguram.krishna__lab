class DefaultSpecifier {
    private int defaultCheck;
    private String passwordCheck;
    
    public DefaultSpecifier(){
        defaultCheck = 12;
        passwordCheck = "Sk123@gmail.com";
    }

    public static void main(String[] args) {
        DefaultSpecifier check = new DefaultSpecifier();
        System.out.println(check.defaultCheck);
        System.out.println(check.passwordCheck);
    }
}