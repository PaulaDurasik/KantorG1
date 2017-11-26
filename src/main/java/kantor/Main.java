package kantor;

import kantor.AllOptions;


public class Main {
    public static void main(String[] args) {
       usersIwona();



        Menu.getInstance().display(AllOptions.LOGIN_MENU);


    }

    private static void usersIwona() {
        LoginMenu users = new LoginMenu();
        users.createUser();

        users.showUsers();



    }


}
