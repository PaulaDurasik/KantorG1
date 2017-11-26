package kantor;

public class Menu {

    

    AllOptions choose;

    public static Menu instance=null;

    public AllOptions getChoose() {
        return choose;
    }

    public static Menu getInstance(){
        if (instance==null){
            instance=new Menu();
        }
        return instance;
    }

    public void display(User user){
        //System.out.println("Login");
        MainMenu mainMenu = new MainMenu();
        mainMenu.display();
    }


    public void setChoose(AllOptions choose) {
        this.choose = choose;
    }

    public static void setInstance(Menu instance) {
        Menu.instance = instance;
    }


}
