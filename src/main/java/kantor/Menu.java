
package kantor;
import kantor.MenuInterface;

import java.util.Map;

public class Menu {
    public static Menu instance = null;
    Map <Menu, MenuInterface> allOptions;


    public static Menu getInstance() {
        if (instance == null) {
            instance = new Menu();
        }
        return instance;

    }

    public void display(AllOptions loginMenu) {
        if (loginMenu!= null) {
            System.out.println("Coneccted!");
        }

    }
}
