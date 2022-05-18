public class Abstraction{
    public static void main(String[] args) {
        manager obj = new rolesAndLevels();
        obj.prjName();
        obj.members();
        obj.level();
        obj.roles();
    }
}

abstract class manager{
    public void prjName(){
        System.out.println("Abstraction!!");
    }

    public abstract void members();
    public abstract void roles();
    public abstract void level();
}

abstract class teamMembers extends manager{
    public void members(){
        System.out.println("Suguram, Sugu, Ram");
    }
}

class rolesAndLevels extends teamMembers{
    public void roles(){
        System.out.println("Development, Design, Testing");
    }

    public void level(){
        System.out.println("Intermediate");
    }
}