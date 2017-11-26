package kantor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoginMenu implements MenuInterface {

    List<User> userList = new ArrayList<User>();


    public   void showUsers() {

        for (User user : userList) {
            System.out.println(String.format("User: %s,%s,", user.getLogin(), user.getRole().getRoleName()));

        }
    }

    public  void createUser() {

        User u1 = new User("Darek", "darek123", Role.USER);
        User u2 = new User("Ilona", "ilona456", Role.USER);
        User u3 = new User("Paula", "paula600", Role.ADMIN);
        User u4 = new User("Iwona", "iwona237", Role.USER);
        addUser(u1,u2,u3,u4);

    }

    public    void addUser(User... users) {

        System.out.println("Dodaje urzytkowników");
        for (int i = 0; i < users.length; i++) {
            userList.add(users[i]);


        }
    }

    public void display() {



        System.out.println("=====================");
        System.out.println("  Strona logowania: ");
        System.out.println("=====================");

        System.out.println("\nWybierz jedną z opcji:");
        System.out.println("L - zaloguj do systemu");
        System.out.println("Exit - wróć do menu głównego");

        menuChoose();

    }

    private void menuChoose(){

        Scanner scanner = new Scanner(System.in);
        String wybor = scanner.nextLine();

        while (true) {

            if ("L".equals(wybor)) {

                System.out.println("Wybrałeś stronę logowania:");
            } else

            if ("Exit".equals(wybor)) {
                break;
            }
        }
    }
}
