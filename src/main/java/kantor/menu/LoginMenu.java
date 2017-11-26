package kantor.menu;

import kantor.MenuInterface;

import java.util.Scanner;

public class LoginMenu implements MenuInterface {



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

    //private logInToCantor()
}
