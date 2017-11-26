import menu.MenuInterface;

import java.util.Map;

public class Menu {
    public static Menu instance=null;
    Map<Menu, MenuInterface> allOptions;



    public static Menu getInstance(){
        if (instance==null){
            instance=new Menu();
        }
        return instance;

    }

    public void display(AllOptions loginMenu){
        System.out.println("Podaj Login");


    }


   // mapa opcji,
    //lista opcji
    //lista osób

}
