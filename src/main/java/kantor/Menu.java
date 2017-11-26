package kantor;

import kantor.AllOptions;

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
