package kantor;

<<<<<<< HEAD:src/main/java/kantor/Menu.java
import kantor.AllOptions;

=======
>>>>>>> 5a1f396155eb9ff5e6941e115fd6de1935a2f3b0:src/main/java/kantor/Menu.java
public class Menu {
    public static Menu instance=null;


    public static Menu getInstance(){
        if (instance==null){
            instance=new Menu();
        }
        return instance;

    }

    public void display(AllOptions loginMenu){
        System.out.println("Login");

    }


}
