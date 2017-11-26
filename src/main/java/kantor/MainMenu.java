package kantor;

import java.util.Scanner;

public class MainMenu implements MenuInterface{

    public void display() {
        System.out.println("=====================");
        System.out.println("     Main menu: ");
        System.out.println("=====================");

        System.out.println("\nWybierz jedną z opcji:");
        System.out.println("1 - Zarządzaj kontem");
        System.out.println("2 - Kursy walut");
        System.out.println("K - Koniec programu");

        menuChoose();

    }

    private void menuChoose(){
        Scanner scanner = new Scanner(System.in);
        String wybor = scanner.nextLine();
        int opcja = 0;

        while (true){
            System.out.println("Podaj swój wybór: ");
            if ("1".equals(wybor)) {
                System.out.println("Wybrałeś zarządzania kontem");
                opcja = 1;
                break;
            } else
            if ("2".equals(wybor)) {
                System.out.println("Wybrałeś stronę kursów walut:");
                opcja = 2;
                break;
            } else

            if ("K".equals(wybor)) {
                opcja = 3;
                break;
            } else
            {
                System.out.println("Nie ma takiej opcji!");
            }
        }

        switch(opcja) {
            case 1 : LoginMenu loginMenu = new LoginMenu();
                     loginMenu.display();
                break;
            case 2 : CurrencyMenu currencyMenu = new CurrencyMenu();
                     currencyMenu.display();
                break;
            case 3 :
                System.out.println("Bye! Bye! My Friend :) ");
                break;

        }


    }
}
